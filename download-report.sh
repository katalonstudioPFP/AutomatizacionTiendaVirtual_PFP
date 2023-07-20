#!/bin/sh

# The first argument $1 is the report id.
# It is easily available by opening a bench report and check the URL: https://api.octoperf.com/ui/workspace/<workspaceId>/project/<projectId>/analysis/report/<reportId>
# Here it would be 'reportId'

# The second argument $2 is the API key. It is also available in OctoPerf's UI.
# Please check the documentation at https://api.octoperf.com/doc/account/profile/#apikey to know where to find it.

# Printing a report as a PDF file is an asynchronous task.
# The first step is to create such task by calling OctoPerf's API with a POST request containing a 'PrintReportTask'.
# You can customize the following request to specify an export configuration that suits your needs (page format, margins, etc).
# In the UI, this configuration can be edited in the report export page: https://api.octoperf.com/doc/analysis/export-bench-report/#configure-export
echo "Create print task"
taskId=$(curl \
--header "Authorization: Bearer $2" \
--header "Content-Type: application/json" \
-X POST https://api.octoperf.com/tasks -d @- << EOF
{
  "benchReportId": "$1",
  "config": {
    "orientation": "landscape",
    "coverPage": "# $COMPANY_NAME$\n<br>\n<br>\n<br>\n<br>\n<br>\n<br>\n<h2 style='text-align: right;'>$REPORT_NAME$</h2>\n<h3 style='text-align: right;'>$REPORT_DATE$<br></h3>\n<br>\n<br>\n<br>\n<br>\n<br>\n$REPORT_DESCRIPTION$",
    "tablesRowCount": {
      "StatisticTableReportItem": 20,
      "StatisticTreeReportItem": 20,
      "ErrorsReportItem": 20,
      "ThresholdAlarmReportItem": 20,
      "TextualMonitorReportItem": 5,
      "SynopsisReportItem": 6
    },
    "pageFormat": "A4",
    "pageMargin": {
      "top": "",
      "right": "",
      "bottom": "",
      "left": ""
    },
    "scale": 0.8,
    "@type": "ExportReportConfig"
  },
  "@type": "PrintReportTask"
}
EOF
)
echo $taskId

# Now we must wait for the task to complete.
# The following request always returns a 200 HTTP response code, but the response body is only present when the task succeed.
echo "Get task result"
taskResult=''
while [ -z $taskResult ];
do
  echo "Waiting 5 seconds..."
  sleep 5
  taskResult=$(curl --header "Authorization: Bearer $2" --header "Content-Type: application/json" https://api.octoperf.com/tasks/$taskId/result)
done
echo $taskResult

# The task result is a JSON string: {"@type":"PrintReportTaskResult","filename":"filename.pdf"}
# We must extract the file name to download it using sed
echo "Extract file name"
fileName=$(echo $taskResult | head -n 1 | sed -E 's/.*filename":"([^"]*).*/\1/')
echo $fileName

# The download URL is based on the bench result (not report!)
# So we must download the report JSON to get the result ID (A simple report only has one result ID, but a comparison report can have several result IDs).
echo "Get report $1 as JSON"
reportJson=$(curl --header "Authorization: Bearer $2" https://api.octoperf.com/analysis/bench-reports/$1)

# An example of the returned JSON is available in OctoPerf swagger documentation https://api.octoperf.com/swagger-ui/index.html#/Analysis%20-%20Bench%20Reports/u_19
echo "Extract result ID"
resultId=$(echo $reportJson | head -n 1 | sed -E 's/.*benchResultIds":\["([^"]*).*/\1/')
echo $resultId

# Finally we can download the file
echo "Download PDF file"
curl --header "Authorization: Bearer $2" https://api.octoperf.com/analysis/logs/$resultId?filename=$fileName --output report.pdf
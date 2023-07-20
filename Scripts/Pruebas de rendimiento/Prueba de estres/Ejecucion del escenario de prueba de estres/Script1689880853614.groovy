import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint

import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//llamamos a la api de ejecucion de escenarios de octoperf con la plantilla definida
response= WS.sendRequest(findTestObject('Object Repository/Solicitud a las pruebas de estres/Postman/Ejecucion de prueba de estress'))


//Verificamos que el estado de la respuesta es 200
WS.verifyResponseStatusCode(response, 200)

//la respuesta de octoperf es en formato html

//accedemos al id del report de la respuesta
String reportBenchID=WS.getElementPropertyValue(response,'id').toString()

//imprimimos el report id por consola
println("Bench Report Id: "+reportBenchID)

//guardamos el nuevo REPORT ID por consola porque cada ejecucion cambie el id del result y report
GlobalVariable.BENCH_REPORT_ID=reportBenchID
//guardamos el id del result ,donde estan los tiempos de la prueba de carga
String benchResultIds=WS.getElementPropertyValue(response,'benchResultIds[0]').toString()

println("Bench Result Id: "+ benchResultIds)

GlobalVariable.BENCH_RESULT_ID=benchResultIds

benchResultIds[0]
<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>Modificación de datos de la cuenta con cliente registrado</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>false</rerunImmediately>
   <testSuiteGuid>6a8a771b-70c3-4d71-a53a-dbcf3c95c90a</testSuiteGuid>
   <testCaseLink>
      <guid>4c1df130-91da-4c3d-a755-9edd87c74628</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/ScriptsComunes/ScriptsComunes/AccesoATienda</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>19322904-17a6-4ed1-ba4f-d9f057904898</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>af8043ab-2bbe-4456-9386-bc75638fab19</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/ScriptsComunes/ScriptsComunes/Loguearse</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>cc7c46cb-3f37-4fea-be41-2cb305276747</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Datos</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>cc7c46cb-3f37-4fea-be41-2cb305276747</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Usuario</value>
         <variableId>ae4f7622-601b-4589-a169-a483407a454e</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>cc7c46cb-3f37-4fea-be41-2cb305276747</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Password</value>
         <variableId>819de514-dc68-4e12-9729-270f15818847</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>ac3614ea-227d-4c05-aa61-81844cce983b</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/ScriptsComunes/ScriptsComunes/ComprobarComponentesDeMiCuenta</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>5d9433a6-0f3e-4393-b240-06ad8b0f4fb9</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Datos</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>5d9433a6-0f3e-4393-b240-06ad8b0f4fb9</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>NombreVisible</value>
         <variableId>a244ce83-796d-4564-9245-c715b979865e</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>b664bddd-171f-42d8-9f45-19c4f7dff84c</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/ScriptsComunes/ScriptsComunes/DarseDeBajaBoletin_Y_CambiarNombreVisible</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>904a560a-44e8-4d2a-acd7-4ec0f5a37f1e</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/Datos</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>904a560a-44e8-4d2a-acd7-4ec0f5a37f1e</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>NombreVisible</value>
         <variableId>aa1e672f-35fe-476d-9011-a29802490d6e</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>1085866a-9229-42b7-ad8a-9195144645ab</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/ScriptsComunes/ScriptsComunes/ComprobarCuponesCliente</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>dfcc7ab2-4ac9-4c44-a456-ead0fbda91f5</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/ScriptsComunes/ScriptsComunes/CerrarSesion</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
</TestSuiteEntity>

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

//imprimimos el resultado actual de RESULT ID
println("EL BENCH RESULT ID DE LA EJECUCION ES "+GlobalVariable.BENCH_RESULT_ID)


//Ejecutamos 1000 veces la accion de dentro del bucle
for(int i=0;i<=1000 ; i++) {
	
 //hacemos una csolicitud pasando un  mapa de string y objeto
 response=WS.sendRequest(findTestObject('Object Repository/Solicitud a las pruebas de estres/Postman/Seguimiento de la prueba de estres', [('benchReportId') : GlobalVariable.BENCH_REPORT_ID]))

 //Verificamos que el estado de la respuesta es 200
 
 if(WS.verifyResponseStatusCode(response, 200))
 {
	 println("PODEMOS SEGUIR LA EJECUCION DE LA PRUEBA DE CARGA CORRECTAMENTE")
 }
 else {
	 println("NO PODEMOS SEGUIR LA EJECUCION DE LA PRUEBA DE CARGA ,HA HABIDO UN ERROR")
 }
 
 //Miramos el progreso de la ejecucion de la prueba
String ProgresoDeLaEjecucion=WS.getElementPropertyValue(response,'value').toString()


 if(ProgresoDeLaEjecucion=="100.0") {
	println(ProgresoDeLaEjecucion)
	println("LA EJECUCION DE LA PRUEBA DE ESTRES HA TERMINADO")
	println("AHORA PROCEDEMOS A GENERAR Y DESCARGAR EL INFORME DE PRUEBA DE ESTRES EN PDF")
	//se termina el bucle
	break
  }
  else {
	  
	  WS.delay(30)
	  
	  
	  print("LA PRUEBA DE CARGA AUN NO HA TERMINADO,EL PORCENTAJE DE EJECUCION ES "+ ProgresoDeLaEjecucion)
	  
  }
  
  println("EL IDENTIFICADOR  DE LA EJECUCION ES "+GlobalVariable.BENCH_RESULT_ID)
  
  println("EL IDENTIFICADOR DEL INFORME ES "+GlobalVariable.BENCH_REPORT_ID)

}
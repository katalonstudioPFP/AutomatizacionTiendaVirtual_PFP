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

CustomKeywords.'analisisdeseguridad.AnalisisdeSeguridadOAWSPZAP.VolverProxyAEstadoInicial'()

CustomKeywords.'analisisdeseguridad.AnalisisdeSeguridadOAWSPZAP.ConfigurarNavegadorFirefox'()

WebUI.callTestCase(findTestCase('ScriptsComunes/FuncionesBasicas/AccesoATienda'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ScriptsComunes/FuncionesBasicas/Loguearse'), [('Usuario') : 'tejonloco0@gmail.com', ('Password') : 'Isabela_2023_'], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ScriptsComunes/FuncionesBasicas/CerrarSesion'), [:], FailureHandling.CONTINUE_ON_FAILURE)

CustomKeywords.'analisisdeseguridad.AnalisisdeSeguridadOAWSPZAP.GenerarInformeDeSeguridad'('prueba5')

CustomKeywords.'analisisdeseguridad.AnalisisdeSeguridadOAWSPZAP.VolverProxyAEstadoInicial'()


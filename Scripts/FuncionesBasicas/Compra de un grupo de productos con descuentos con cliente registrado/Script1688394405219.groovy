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

WebUI.callTestCase(findTestCase('ScriptsComunes/AccesoATienda'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ScriptsComunes/BusquedaDeProductosEnDescuento'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ScriptsComunes/ComprobacionPaginaDeProductosConDescuento'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ScriptsComunes/ComprobarCarritoVariosProductos'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ScriptsComunes/ComprobacionPaginaCheckout'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ScriptsComunes/LoginDesdeCheckout'), [('Usuario') : 'tejonloco0@gmail.com', ('Password') : 'Isabela_2023_'], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ScriptsComunes/ComprobacionDatosDeEnvioDeCliente'), [('Nombre') : 'sonia', ('Apellido') : 'sanchez'
        , ('Pais') : 'España', ('Direccion') : 'calle doctor esquerdo 169', ('Piso') : '2 c', ('Ciudad') : 'madrid', ('Comunidad') : 'Madrid'
        , ('CP') : '28007', ('Email') : 'tejonloco0@gmail.com'], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ScriptsComunes/RealizarPedidoYComprobacionPedidoExitoso'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('ScriptsComunes/CerrarNavegador'), [:], FailureHandling.CONTINUE_ON_FAILURE)


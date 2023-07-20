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

WebUI.verifyElementText(findTestObject('Object Repository/Comprobación de calculo correcto del coste de envío de producto/Page_Carrito -/th_Envio'), 
    'Envío')

WebUI.verifyElementText(findTestObject('Object Repository/Comprobación de calculo correcto del coste de envío de producto/Page_Carrito -/label_Precio fijo 3,00'), 
    'Precio fijo: 3,00 €')

WebUI.verifyElementText(findTestObject('Object Repository/Comprobación de calculo correcto del coste de envío de producto/Page_Carrito -/TextoDeOpcionesDeEnvio'), 
    'Las opciones de envío se actualizarán durante el pago.')

WebUI.verifyElementVisible(findTestObject('Object Repository/Comprobación de calculo correcto del coste de envío de producto/Page_Carrito -/a_CalcularCosteEnvio'))

WebUI.verifyElementText(findTestObject('Object Repository/Comprobación de calculo correcto del coste de envío de producto/Page_Carrito -/th_Impuestos (estimado para España)'), 
    'Impuestos (estimado para España)')

WebUI.verifyElementText(findTestObject('Object Repository/Comprobación de calculo correcto del coste de envío de producto/Page_Carrito -/th_Total'), 
    'Total')

WebUI.scrollToElement(findTestObject('Comprobación de calculo correcto del coste de envío de producto/Page_Carrito -/CiudadDelEnvio'), 
    2)

WebUI.click(findTestObject('Object Repository/Comprobación de calculo correcto del coste de envío de producto/Page_Carrito -/a_CalcularCosteEnvio'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Comprobación de calculo correcto del coste de envío de producto/Page_Carrito -/span_Espaa'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Comprobación de calculo correcto del coste de envío de producto/Page_Carrito -/CiudadDelEnvio'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Comprobación de calculo correcto del coste de envío de producto/Page_Carrito -/CPDelEnvio'))

WebUI.verifyElementText(findTestObject('Object Repository/Comprobación de calculo correcto del coste de envío de producto/Page_Carrito -/BotonActualizar'), 
    'Actualizar')

WebUI.setText(findTestObject('Object Repository/Comprobación de calculo correcto del coste de envío de producto/Page_Carrito -/CiudadDelEnvio'), 
    Provincia)

WebUI.setText(findTestObject('Object Repository/Comprobación de calculo correcto del coste de envío de producto/Page_Carrito -/CPDelEnvio'), 
    CP)

WebUI.click(findTestObject('Object Repository/Comprobación de calculo correcto del coste de envío de producto/Page_Carrito -/BotonActualizar'))

WebUI.verifyElementText(findTestObject('Object Repository/Comprobación de calculo correcto del coste de envío de producto/Page_Carrito -/CosteEnvio'), 
    CosteEnvio)

WebUI.verifyElementText(findTestObject('Object Repository/Comprobación de calculo correcto del coste de envío de producto/Page_Carrito -/strong_28009 madrid, Madrid'), 
    CP+" " +Provincia)


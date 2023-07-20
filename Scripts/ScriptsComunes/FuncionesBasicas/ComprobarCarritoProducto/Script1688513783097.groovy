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

WebUI.verifyElementVisible(findTestObject('Object Repository/Comprobación de calculo correcto del coste de envío de producto/Page_Carrito -/th_Producto'))

WebUI.verifyElementText(findTestObject('Object Repository/Comprobación de calculo correcto del coste de envío de producto/Page_Carrito -/th_Producto'), 
    'Producto')

WebUI.verifyElementText(findTestObject('Object Repository/Comprobación de calculo correcto del coste de envío de producto/Page_Carrito -/th_Precio'), 
    'Precio')

WebUI.verifyElementText(findTestObject('Object Repository/Comprobación de calculo correcto del coste de envío de producto/Page_Carrito -/th_Cantidad'), 
    'Cantidad')

WebUI.verifyElementText(findTestObject('Object Repository/Comprobación de calculo correcto del coste de envío de producto/Page_Carrito -/th_Subtotal'), 
    'Subtotal')

WebUI.verifyElementVisible(findTestObject('Object Repository/Comprobación de calculo correcto del coste de envío de producto/Page_Carrito -/td_'))

WebUI.verifyElementText(findTestObject('Object Repository/Comprobación de calculo correcto del coste de envío de producto/Page_Carrito -/td_Camiseta para mujer'), 
    'Camiseta para mujer')

WebUI.verifyElementText(findTestObject('Object Repository/Comprobación de calculo correcto del coste de envío de producto/Page_Carrito -/PrecioProducto'), 
    '18,90 €')

WebUI.verifyElementText(findTestObject('Object Repository/Comprobación de calculo correcto del coste de envío de producto/Page_Carrito -/input_Camiseta para mujer cantidad_cartf0e5_48d88e'), 
    'Camiseta para mujer')

WebUI.verifyElementText(findTestObject('Object Repository/Comprobación de calculo correcto del coste de envío de producto/Page_Carrito -/PrecioProducto'), 
    '18,90 €')

WebUI.verifyElementText(findTestObject('Object Repository/Comprobación de calculo correcto del coste de envío de producto/Page_Carrito -/h2_Total del carrito'), 
    'Total del carrito')

WebUI.verifyElementText(findTestObject('Object Repository/Comprobación de calculo correcto del coste de envío de producto/Page_Carrito -/th_Subtotal'), 
    'Subtotal')

WebUI.verifyElementText(findTestObject('Object Repository/Comprobación de calculo correcto del coste de envío de producto/Page_Carrito -/Total'), 
    '18,90 €')


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

WebUI.click(findTestObject('Compra de un producto con cupon descuento/Page_Inicio -/a_Tienda'))

WebUI.click(findTestObject('Compra de un producto con cupon descuento/Page_Gafas de hombre -/img_Gafas de hombre'))

WebUI.click(findTestObject('Object Repository/Compra de un producto con cupon descuento/Page_Gafas de hombre -/BotonAñadirACarrito'))

WebUI.mouseOver(findTestObject('Object Repository/Compra de un producto con cupon descuento/Page_Gafas de hombre -/IconoCarrito'))

WebUI.verifyElementText(findTestObject('Compra de un producto con cupon descuento/Page_Gafas de hombre -/a_Gafas de hombre'), 
    NombreProducto)

WebUI.verifyElementText(findTestObject('Object Repository/Compra de un producto con cupon descuento/Page_Gafas de hombre -/strong_Subtotal'), 
    'Subtotal:')

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un producto con cupon descuento/Page_Gafas de hombre -/a_Ver carrito'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un producto con cupon descuento/Page_Gafas de hombre -/a_Finalizar compra'))

WebUI.verifyElementText(findTestObject('Object Repository/Compra de un producto con cupon descuento/Page_Gafas de hombre -/div_PrecioTotalCarrito'), 
    '81,00 €')


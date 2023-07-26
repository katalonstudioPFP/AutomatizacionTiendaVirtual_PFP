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

WebUI.click(findTestObject('Compra de un producto con cupon descuento/Page_Checkout -/a_Haz clic aqui para introducir tu codigo'))

WebUI.verifyElementVisible(findTestObject('Compra de un producto con cupon descuento/Page_Checkout -/div_Tienes un cupon Haz clic aqu para introducirlo'))

WebUI.verifyElementText(findTestObject('Compra de un producto con cupon descuento/Page_Checkout -/a_Haz clic aqui para introducir tu codigo'), 
    'Haz clic aquí para introducir tu código')

WebUI.verifyElementText(findTestObject('Compra de un producto con cupon descuento/Page_Checkout -/p_Si tienes un cdigo de cupon, por favor, aplicalo'), 
    'Si tienes un código de cupón, por favor, aplícalo abajo.')

WebUI.verifyElementVisible(findTestObject('Compra de un producto con cupon descuento/Page_Checkout -/input_CodigoCupon'))

WebUI.verifyElementVisible(findTestObject('Compra de un producto con cupon descuento/Page_Checkout -/ButonAplicarCupon'))

WebUI.verifyElementText(findTestObject('Compra de un producto con cupon descuento/Page_Checkout -/ButonAplicarCupon'), 'Aplicar cupón')

WebUI.setText(findTestObject('Compra de un producto con cupon descuento/Page_Checkout -/input_CodigoCupon'), Cupon)

WebUI.click(findTestObject('Compra de un producto con cupon descuento/Page_Checkout -/ButonAplicarCupon'))

WebUI.verifyElementText(findTestObject('Compra de un producto con cupon descuento/Page_Checkout -/div_El codigo de cupon se aplica correctamente'), 
    'El código de cupón se ha aplicado correctamente.')


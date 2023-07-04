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

WebUI.click(findTestObject('Object Repository/Compra de un producto con cupon descuento/UtilizarCupon/Page_Checkout -/a_Haz clic aqu para introducir tu cdigo'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un producto con cupon descuento/UtilizarCupon/Page_Checkout -/div_Tienes un cupn Haz clic aqu para introd_2bfdbc'))

WebUI.verifyElementText(findTestObject('Object Repository/Compra de un producto con cupon descuento/UtilizarCupon/Page_Checkout -/a_Haz clic aqu para introducir tu cdigo'), 
    'Haz clic aquí para introducir tu código')

WebUI.verifyElementText(findTestObject('Object Repository/Compra de un producto con cupon descuento/UtilizarCupon/Page_Checkout -/p_Si tienes un cdigo de cupn, por favor, ap_d37d78'), 
    'Si tienes un código de cupón, por favor, aplícalo abajo.')

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un producto con cupon descuento/UtilizarCupon/Page_Checkout -/input_Cupn_coupon_code'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un producto con cupon descuento/UtilizarCupon/Page_Checkout -/button_Aplicar cupn'))

WebUI.verifyElementText(findTestObject('Object Repository/Compra de un producto con cupon descuento/UtilizarCupon/Page_Checkout -/button_Aplicar cupn'), 
    'Aplicar cupón')

WebUI.setText(findTestObject('Object Repository/Compra de un producto con cupon descuento/UtilizarCupon/Page_Checkout -/input_Cupn_coupon_code'), 
    Cupon)

WebUI.click(findTestObject('Object Repository/Compra de un producto con cupon descuento/UtilizarCupon/Page_Checkout -/button_Aplicar cupn'))

WebUI.verifyElementText(findTestObject('Object Repository/Compra de un producto con cupon descuento/UtilizarCupon/Page_Checkout -/div_El cdigo de cupn se ha aplicado correctamente'), 
    'El código de cupón se ha aplicado correctamente.')


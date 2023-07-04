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

WebUI.click(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Checkout -/a_Haz clic aqu para acceder'))

WebUI.verifyElementText(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Checkout -/label_Nombre de usuario o correo electrnico'), 
    'Nombre de usuario o correo electrónico *')

WebUI.verifyElementText(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Checkout -/label_Contrasea'), 
    'Contraseña *')

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Checkout -/Usuario'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Checkout -/Password'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Checkout -/BotonAcceder'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Checkout -/label_Recurdame'))

WebUI.verifyElementText(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Checkout -/a_Olvidaste la contrasea'), 
    '¿Olvidaste la contraseña?')

WebUI.setText(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Checkout -/Usuario'), 
    Usuario)

WebUI.setText(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Checkout -/Password'), 
    Password)

WebUI.click(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Checkout -/BotonAcceder'))


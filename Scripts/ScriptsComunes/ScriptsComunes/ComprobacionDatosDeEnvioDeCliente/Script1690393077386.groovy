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

WebUI.scrollToElement(findTestObject('Compra de un grupo de productos con descuentos con cliente registrado/Page_Checkout -/Nombre'), 2)

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Checkout -/Nombre'), 
    'value', Nombre, 0)

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Checkout -/Apellido'), 
    'value', Apellido, 0)

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Checkout -/Pais'), 
    'title', Pais, 0)

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Checkout -/Direccion'), 
    'value', Direccion, 0)

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Checkout -/Piso'), 
    'value', Piso, 0)

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Checkout -/Ciudad'), 
    'value', Ciudad, 0)

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Checkout -/Comunidad'), 
    'title', Comunidad, 0)

WebUI.scrollToElement(findTestObject('Compra de un grupo de productos con descuentos con cliente registrado/Page_Checkout -/CP'), 2)

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Checkout -/CP'), 
    'value', CP, 0)

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Checkout -/Email'), 
    'value', Email, 0)

WebUI.click(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Checkout -/input_Transferencia bancaria directa_paymen_cf3a83'))

WebUI.click(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Checkout -/input_Contctenos en email para preguntas re_7d39a6'))


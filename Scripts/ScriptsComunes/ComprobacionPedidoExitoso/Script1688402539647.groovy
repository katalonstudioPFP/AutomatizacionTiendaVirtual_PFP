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

WebUI.click(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/button_Realizar el pedido'))

WebUI.verifyElementText(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Gracias por tu compra -/h1_Gracias por tu compra'), 
    'Gracias por tu compra')

WebUI.verifyElementText(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Gracias por tu compra -/h2_Te agradecemos la compra en esta tienda._5dacf0'), 
    'Te agradecemos la compra en esta tienda. Esperamos que compres mas veces en esta tienda por eso debajo de la imagen tienes un cupón descuento para que lo utilices en tu próxima compra')

WebUI.verifyElementVisible(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Gracias por tu compra -/img_Gracias por tu compra_attachment-medium_a68d76'))

WebUI.verifyElementText(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Gracias por tu compra -/h2_Aqu tienes tu cupn con un descuento del _488281'), 
    'Aquí tienes tu cupón con un descuento del 10% para tu próxima compra')

WebUI.verifyElementVisible(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Gracias por tu compra -/div_10Cart discountmhj8p64w i'))


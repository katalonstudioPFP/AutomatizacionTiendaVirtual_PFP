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

WebUI.click(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Carrito -/a_Finalizar compra'))

WebUI.verifyElementPresent(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/a_Haz clic aqu para acceder'), 
    1)

WebUI.rightClick(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/a_Haz clic aqu para introducir tu cdigo'))

WebUI.verifyElementPresent(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/a_Haz clic aqu para introducir tu cdigo'), 
    1)

WebUI.verifyElementText(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/a_sala aqu'), '¡Úsala aquí!')

WebUI.verifyElementVisible(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/h3_Detalles de facturacin'))

WebUI.verifyElementVisible(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/input_Suscrbete a nuestro boletn_ship_to_di_21497e'))

WebUI.scrollToElement(findTestObject('CompraConclienteRegistrado/Page_Checkout -/button_Realizar el pedido'), 0)

WebUI.verifyElementVisible(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/span_Enviar a una direccin diferente'))

WebUI.scrollToElement(findTestObject('CompraConclienteRegistrado/Page_Checkout -/label_Nombre'), 2)

WebUI.verifyElementVisible(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/label_Nombre'))

WebUI.verifyElementVisible(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/label_Apellidos'))

WebUI.verifyElementVisible(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/input__billing_first_name'))

WebUI.verifyElementVisible(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/input__billing_last_name'))

WebUI.verifyElementVisible(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/label_Pas  Regin'))

WebUI.verifyElementVisible(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/span_Espaa'))

WebUI.verifyElementVisible(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/label_Direccin de la calle'))

WebUI.verifyElementVisible(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/input__billing_address_1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/input__billing_address_2'))

WebUI.verifyElementVisible(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/label_Poblacin'))

WebUI.verifyElementVisible(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/input__billing_city'))

WebUI.verifyElementVisible(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/label_Regin  Provincia'))

WebUI.verifyElementVisible(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/span_Elige una opcin'))

WebUI.scrollToElement(findTestObject('CompraConclienteRegistrado/Page_Checkout -/label_Cdigo postal'), 2)

WebUI.verifyElementVisible(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/label_Cdigo postal'))

WebUI.verifyElementVisible(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/input__billing_postcode'))

WebUI.verifyElementVisible(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/label_Direccin de correo electrnico'))

WebUI.verifyElementVisible(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/input__billing_email'))

WebUI.verifyElementVisible(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/span_Suscrbete a nuestro boletn'))

WebUI.verifyElementVisible(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/h3_Tu pedido'))

WebUI.verifyElementText(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/th_Producto'), 'Producto')

WebUI.verifyElementText(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/th_Subtotal'), 'Subtotal')

WebUI.verifyElementText(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/h3_Tu pedido'), 'Tu pedido')

WebUI.verifyElementText(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/th_Subtotal'), 'Subtotal')

WebUI.verifyElementText(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/th_Envo'), 'Envío')

WebUI.verifyElementText(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/th_Total'), 'Total')

WebUI.verifyElementText(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/td_139,50'), '139,50 €')

WebUI.verifyElementPresent(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/label_Precio fijo 3,00'), 
    2)

WebUI.verifyElementPresent(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/bdi_0,00'), 2)

WebUI.verifyElementPresent(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/bdi_142,50'), 2)

WebUI.verifyElementText(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/label_Transferencia bancaria directa'), 
    'Transferencia bancaria directa')

WebUI.verifyElementPresent(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/label_Pagos por cheque'), 
    2)

WebUI.verifyElementText(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/label_Contra reembolso'), 
    'Contra reembolso')

WebUI.verifyElementVisible(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/span_Marca aqu para recibir la invitacin de_4e7bcb'))

WebUI.verifyElementText(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/span_He ledo y estoy de acuerdo con los trm_1b4be1'), 
    'He leído y estoy de acuerdo con los términos y condiciones de la web')

WebUI.verifyElementText(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/label_Acepto recibir ofertas, noticias y ot_c16676'), 
    'Acepto recibir ofertas, noticias y otras recomendaciones sobre productos o servicios (opcional)')

WebUI.verifyElementVisible(findTestObject('Object Repository/CompraConclienteRegistrado/Page_Checkout -/button_Realizar el pedido'))

WebUI.scrollToElement(findTestObject('CompraConclienteRegistrado/Page_Checkout -/a_Haz clic aqu para acceder'), 2)


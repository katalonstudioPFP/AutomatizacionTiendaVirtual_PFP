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

WebUI.verifyElementText(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/p_Hola sonia (no eres sonia Cerrar sesin)'), 
    ((('Hola ' + NombreVisible) + ' (¿no eres ') + NombreVisible) + '? Cerrar sesión)')

WebUI.verifyElementClickable(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/a_CerrarSesion'))

WebUI.verifyElementText(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/p_Desde el escritorio de tu cuenta puedes v_98bda8'), 
    'Desde el escritorio de tu cuenta puedes ver tus pedidos recientes, gestionar tus direcciones de envío y facturación y editar tu contraseña y los detalles de tu cuenta.')

WebUI.verifyElementClickable(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/a_pedidos recientes'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/a_DireccionDeEnvioYFacturacion'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/a_editar tu contraseña y los detalles de tu cuenta'))

WebUI.click(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/a_Pedidos'))

WebUI.verifyElementText(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/span_Pedido'), 
    'Pedido')

WebUI.verifyElementText(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/span_Fecha'), 
    'Fecha')

WebUI.verifyElementText(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/span_Estado'), 
    'Estado')

WebUI.verifyElementText(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/span_Total'), 
    'Total')

WebUI.verifyElementText(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/span_Acciones'), 
    'Acciones')

WebUI.verifyTextPresent('Ver', false)

WebUI.click(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/a_Tarjetas regalo'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/svg_Group'))

WebUI.click(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/a_Descargas'))

WebUI.click(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/a_Direcciones'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/h3_Direccin de facturacin'), 
    2)

WebUI.verifyElementText(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/h3_Direccin de facturacin'), 
    'Dirección de facturación')

WebUI.verifyElementText(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/h3_Direccin de envo'), 
    'Dirección de envío')

WebUI.click(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/a_Detalles de la cuenta'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/label_Nombre'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/label_Apellidos'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/input__account_first_name'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/input__account_last_name'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/input__account_display_name'))

WebUI.verifyElementText(findTestObject('Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/label_Nombre visible'), 
    'Nombre visible *')

WebUI.verifyElementText(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/label_Direccin de correo electrnico'), 
    'Dirección de correo electrónico *')

WebUI.verifyElementVisible(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/input__account_email'))

WebUI.scrollToElement(findTestObject('Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/input__account_display_name'), 
    2)

WebUI.verifyElementText(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/legend_Cambio de contrasea'), 
    'Cambio de contraseña')

WebUI.verifyElementText(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/label_Contrasea actual (djalo en blanco par_24ce4a'), 
    'Contraseña actual (déjalo en blanco para no cambiarla)')

WebUI.verifyElementVisible(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/input_Contrasea actual (djalo en blanco par_1c1791'))

WebUI.verifyElementText(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/label_Nueva contrasea (djalo en blanco para_cd8deb'), 
    'Nueva contraseña (déjalo en blanco para no cambiarla)')

WebUI.verifyElementVisible(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/input_Nueva contrasea (djalo en blanco para_348f97'))

WebUI.verifyElementText(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/label_Confirmar nueva contrasea (djalo en b_eb4d30'), 
    'Confirmar nueva contraseña (déjalo en blanco para no cambiarla)')

WebUI.verifyElementVisible(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/input_Confirmar nueva contrasea (djalo en b_f543b5'))

WebUI.verifyElementText(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/label_Suscrbete a nuestro boletn'), 
    'Suscríbete a nuestro boletín')

WebUI.verifyElementText(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/label_Darte de baja de nuestro boletn'), 
    'Darte de baja de nuestro boletín')

WebUI.verifyElementText(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/label_Recibir actualizaciones de pedidos'), 
    'Recibir actualizaciones de pedidos')


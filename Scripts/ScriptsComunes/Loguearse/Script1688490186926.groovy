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

WebUI.click(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Inicio -/a_Mi Cuenta'))

WebUI.verifyElementText(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/h1_Mi Cuenta'), 
    'Mi Cuenta')

WebUI.verifyElementText(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/h2_Acceder'), 
    'Acceder')

WebUI.verifyElementText(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/label_Nombre de usuario o correo electrnico'), 
    'Nombre de usuario o correo electrónico *')

WebUI.verifyElementVisible(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/input__username'))

WebUI.verifyElementText(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/label_Contraseña'), 
    'Contraseña *')

WebUI.verifyElementVisible(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/input__password'))

WebUI.verifyElementText(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/BotonAcceder'), 
    'Acceder')

WebUI.verifyElementText(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/span_Recurdame'), 
    'Recuérdame')

WebUI.verifyElementVisible(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/input__rememberme'))

WebUI.verifyElementText(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/a_Olvidaste la contrasea'), 
    '¿Olvidaste la contraseña?')

WebUI.verifyElementText(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/h2_Registrarse'), 
    'Registrarse')

WebUI.verifyElementText(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/label_Direccin de correo electrnico'), 
    'Dirección de correo electrónico *')

WebUI.verifyElementVisible(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/input__email'))

WebUI.verifyElementText(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/span_Suscrbete a nuestro boletn'), 
    'Suscríbete a nuestro boletín')

WebUI.verifyElementClickable(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/input__mailchimp_woocommerce_newsletter'))

WebUI.verifyElementText(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/p_Sus datos personales se utilizarn para re_ffe051'), 
    'Sus datos personales se utilizarán para respaldar su experiencia en este sitio web, para administrar el acceso a su cuenta y para otros fines descritos en nuestro política de privacidad.')

WebUI.scrollToElement(findTestObject('Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/BotonAcceder'), 
    2)

WebUI.verifyElementText(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/BotonRegistrarse'), 
    'Registrarse')

WebUI.setText(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/input__username'), 
    Usuario)

WebUI.setText(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/input__password'), 
    Password)

WebUI.click(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/BotonAcceder'))


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

WebUI.scrollToElement(findTestObject('Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/BotonGuardarCambios'), 
    2)

WebUI.clearText(findTestObject('Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/input__account_display_name'))

WebUI.setText(findTestObject('Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/input__account_display_name'), 
    NombreVisible)

WebUI.verifyElementVisible(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/BotonGuardarCambios'))

WebUI.verifyElementText(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/BotonGuardarCambios'), 
    'Guardar los cambios')

WebUI.click(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/input_Suscrbete a nuestro boletn_mailchimp__5ffe50'))

WebUI.click(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/input_Darte de baja de nuestro boletn_mailc_aff7e8'))

WebUI.click(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/BotonGuardarCambios'))

WebUI.verifyElementText(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/div_La informacin de cuenta se ha cambiado _f82b81'), 
    'La información de cuenta se ha cambiado correctamente.')

WebUI.verifyElementVisible(findTestObject('Object Repository/Modificación de datos de la cuenta con cliente registrado/Page_Mi Cuenta -/div_La informacin de cuenta se ha cambiado _f82b81'))


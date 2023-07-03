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

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Has buscado -/span_Oferta'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Has buscado -/h2_Pantaln y camisa de hombre'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Has buscado -/h2_Vestido de noche'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Has buscado -/h2_Vestido de playa'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Has buscado -/h2_Gafas de hombre'))

WebUI.scrollToElement(findTestObject('Compra de un grupo de productos con descuentos con cliente registrado/Page_Has buscado -/a_Aadir al carrito'), 2)

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Has buscado -/a_Aadir al carrito'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Has buscado -/a_Aadir al carrito_1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Has buscado -/a_Aadir al carrito_1_2'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Has buscado -/a_Aadir al carrito_1_2_3'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Has buscado -/a_Vista rpida'))

WebUI.click(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Has buscado -/a_Aadir al carrito'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Has buscado -/a_Ver carrito'))

WebUI.click(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Has buscado -/a_Aadir al carrito_1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Has buscado -/a_Ver carrito'))

WebUI.click(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Has buscado -/a_Aadir al carrito_1_2'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Has buscado -/a_Ver carrito'))

WebUI.click(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Has buscado -/a_Aadir al carrito_1_2_3'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Has buscado -/a_Ver carrito'))


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

WebUI.click(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Has buscado -/a_Ver carrito'))

WebUI.verifyElementText(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Carrito -/h1_Carrito'), 'Carrito')

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Carrito -/div_Has recibido una tarjeta regalo de un s_2984de'))

WebUI.scrollToElement(findTestObject('Compra de un grupo de productos con descuentos con cliente registrado/Page_Carrito -/th_Producto'), 2)

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Carrito -/th_Producto'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Carrito -/th_Precio'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Carrito -/th_Cantidad'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Carrito -/th_Subtotal'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Carrito -/td_'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Carrito -/img__attachment-woocommerce_thumbnail size-_5f269b'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Carrito -/a_Pantaln y camisa de hombre'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Carrito -/bdi_25,00'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Carrito -/bdi_22,50'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Carrito -/img__attachment-woocommerce_thumbnail size-_5f269b_1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Carrito -/td_Vestido de noche'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Carrito -/bdi_10,00'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Carrito -/bdi_9,00'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Carrito -/bdi_9,00'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Carrito -/img__attachment-woocommerce_thumbnail size-_5f269b_1_2'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Carrito -/td_Vestido de playa'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Carrito -/bdi_30,00'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Carrito -/bdi_27,00'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Carrito -/bdi_27,00'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Carrito -/img__attachment-woocommerce_thumbnail size-_5f269b_1_2_3'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Carrito -/a_Gafas de hombre'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Carrito -/bdi_90,00'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Carrito -/bdi_81,00'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Carrito -/bdi_81,00'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Carrito -/h2_Total del carrito'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Carrito -/th_Subtotal'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Carrito -/td_139,50'))

WebUI.click(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Carrito -/div_Total del carritoSubtotal139,50EnvoPrec_0a157f'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Carrito -/th_Envo'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Carrito -/label_Precio fijo 3,00'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Carrito -/p_Las opciones de envo se actualizarn duran_c3812c'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Carrito -/a_Calcular envo'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Carrito -/th_Impuestos (estimado para Espaa)'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Carrito -/td_0,00'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Carrito -/th_Total'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Carrito -/td_142,50'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Compra de un grupo de productos con descuentos con cliente registrado/Page_Carrito -/a_Finalizar compra'))


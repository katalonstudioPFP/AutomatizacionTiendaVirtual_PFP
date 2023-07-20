package metodoscomunes

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import com.kms.katalon.core.testobject.SelectorMethod
import internal.GlobalVariable
import com.kms.katalon.core.webui.exception.WebElementNotFoundException


public class MetodosComunes {

	@Keyword
	def clickProducto(String Nombre) {
		//h2[contains(text(),'Pantalón y camisa de hombre')]
		try {//*[@class = 'woocommerce-loop-product__title' and (text() = 'Vestido de playa' or . = 'Vestido de playa')]
			TestObject NombreProducto = new TestObject('NombreProducto')
			NombreProducto.setSelectorValue(SelectorMethod.XPATH,"//*[@class = 'woocommerce-loop-product__title' and (text() = '"+Nombre+"' or . = '"+Nombre +"')]")
			NombreProducto.setSelectorMethod(SelectorMethod.XPATH)
			WebElement producto = WebUI.findWebElement(NombreProducto);
			producto.click()
		} catch (WebElementNotFoundException e) {
			e.println("NO SE ENCONTRO EL PRODUCTO")

		}
	}
}

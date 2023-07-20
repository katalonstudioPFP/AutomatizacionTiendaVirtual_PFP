package analisisdeseguridad

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
import com.kms.katalon.core.configuration.RunConfiguration
import org.zaproxy.clientapi.core.ClientApi
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.LinkOption
import java.nio.file.Path
import java.nio.file.Paths
import com.google.gson.Gson
import com.kms.katalon.core.network.ProxyInformation
import com.kms.katalon.core.network.ProxyOption

import internal.GlobalVariable



public class AnalisisdeSeguridadOAWSPZAP {

	String ZAP_PROXYHOST = "localhost"
	int  ZAP_PROXYPORT = 8050
	String url="http://pruebasqafenix.com"

	//Miramos la configuracion de proxy inicial

	ProxyInformation proxy =RunConfiguration.getProxyInformation()


	@Keyword
	public void ConfigurarNavegadorFirefox() {


		//configuramos el navegador firefox a la manera de katalon
		Map firefoxOptions =[args:"--ignore-certificate-errors"]
		RunConfiguration.setWebDriverPreferencesProperty('moz:firefoxOptions', firefoxOptions)
		RunConfiguration.setWebDriverPreferencesProperty('ACCEPT_SSL_CERTS', true)
		RunConfiguration.setWebDriverPreferencesProperty('ACCEPT_INSECURE_CERTS', true)

	}

	@Keyword
	public void ConfigurarNavegadorChroome() {

		//configuramos el navegador firefox a la manera de katalon
		Map chromeOptions =[args:"--ignore-certificate-errors"]
		RunConfiguration.setWebDriverPreferencesProperty('chromeOptions', chromeOptions)
		RunConfiguration.setWebDriverPreferencesProperty('acceptSSLCerts', true)
		RunConfiguration.setWebDriverPreferencesProperty('acceptInsecureCerts', true)

	}

	@Keyword
	public void ConfigurarProxy() {
		//ponemos la configuracion de proxy nueva
		proxy.setProxyOption(ProxyOption.MANUAL_CONFIG.name())
		proxy.setProxyServerAddress(ZAP_PROXYHOST)
		proxy.setProxyServerPort( ZAP_PROXYPORT)
		Map<String, Object> generalProperties = RunConfiguration.getExecutionGeneralProperties()
		generalProperties.put(RunConfiguration.PROXY_PROPERTY, new Gson().toJson(proxy))
		println(proxy)
	}

	@Keyword
	public void VolverProxyAEstadoInicial(){

		// Switch back to no_proxy
		proxy.setProxyOption(ProxyOption.NO_PROXY.name())
		proxy.setProxyServerAddress("")
		proxy.setProxyServerPort(0)
		Map<String, Object> generalProperties = RunConfiguration.getExecutionGeneralProperties()
		generalProperties.put(RunConfiguration.PROXY_PROPERTY, new Gson().toJson(proxy));
	}


	/*
	 * Se debe arrancar la aplicacion OWASP ZAP y ponerle
	 * en equipo localhost y en puerto 8050
	 */

	@Keyword
	public void GenerarInformeDeSeguridad(String NombreInforme) {

		ClientApi api = new ClientApi(ZAP_PROXYHOST, ZAP_PROXYPORT)

		String Report = new String(api.core.htmlreport(), StandardCharsets.UTF_8);
		System.out.println(System.getProperty("user.dir"));
		Path filePath = Paths.get(System.getProperty("user.dir") + "/scan-results/"+NombreInforme+".html")
		if (!Files.exists(filePath, LinkOption.NOFOLLOW_LINKS)) {
			Files.createFile(filePath);
		}
		Files.write(filePath, Report.getBytes());
	}
}

package semillero;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

//import com.sophos.certificacion.test.navegar;

public class retorno {
	
		public void getDriver(String navegador) throws IOException {
			
			navegar navega=new navegar();
			LeerExcel excel=new LeerExcel();
		
			switch(navegador) {

			case "chrome":
				System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
				WebDriver casemiro = new ChromeDriver();				
				navega.asignarDriver(casemiro,navegador);
				excel.readXLSXFile();
				break;				

			case "firefox":
				System.setProperty("webdriver.gecko.driver","C:\\Driver\\geckodriver.exe");
				WebDriver firefox = new FirefoxDriver();	
				navega.asignarDriver(firefox,navegador);
				excel.readXLSXFile();
				//navega.probar(firefox);   	 
				break;

			case "explorer":
				System.setProperty("webdriver.ie.driver","C:\\Driver\\IEDriverServer.exe");
				WebDriver inter = new InternetExplorerDriver();
				navega.asignarDriver(inter,navegador);
				excel.readXLSXFile();
				//navega.probar(inter);
				break;
			default:
				
				break;
		
		}		
		
	}

}

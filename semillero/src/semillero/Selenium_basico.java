
package semillero;

import java.io.IOException;

/*
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
*/

public class Selenium_basico {

	public static void main(String[] args) throws IOException {
		
		//envia nombre del navegador a usar
		retorno ret= new retorno();		
		ret.getDriver("chrome");
		ret.getDriver("explorer");
		ret.getDriver("firefox");
		
		//captura foto=new captura();		
		
		/*System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe");
		WebDriver casemiro = new ChromeDriver();
   	    
		casemiro.get("http://newtours.demoaut.com/");
		WebElement usuario;
		usuario=casemiro.findElement(By.name("userName"));
		usuario.sendKeys("Sophos");
		casemiro.findElement(By.name("password")).sendKeys("Sophos");
		foto.takeScreenShotTest(casemiro, "Chrome Datos");
		casemiro.findElement(By.name("login")).click();
		foto.takeScreenShotTest(casemiro, "Chrome Error");
		*/
		
	}
}

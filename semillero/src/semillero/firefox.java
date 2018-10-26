package semillero;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class firefox {
	
     public static void main(String[] args) {
    	 
    	 captura foto=new captura();    	 
		
    	 System.setProperty("webdriver.gecko.driver","C:\\Driver\\geckodriver.exe");
    	 WebDriver firefox = new FirefoxDriver();
    	 
    	 firefox.get("http://newtours.demoaut.com/");		
    	 firefox.findElement(By.name("userName")).sendKeys("Sophos");
    	 firefox.findElement(By.name("password")).sendKeys("Sophos");
    	 
    	 foto.takeScreenShotTest(firefox, "firefox Datos");    	 
    	 firefox.findElement(By.name("login")).click();
    	 foto.takeScreenShotTest(firefox, "firefox Error");
    	 
	}
  

}

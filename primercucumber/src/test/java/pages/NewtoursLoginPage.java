package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//import com.codoid.products.exception.FilloException;

public class NewtoursLoginPage {
	
	private static WebDriver driver;
	private static String driverName="";	
	
	private By username=By.name("userName");
	private By password=By.name("password");
	private By loginButton=By.name("login");	
	
	public NewtoursLoginPage() {
		
	}
	
	public NewtoursLoginPage(WebDriver driver,String driverName) {
		this.driver=driver;
		this.driverName=driverName;		
	}
	
	public void loginNewtours(String user, String pass) {			
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		//Screenshooter.takeScreenShotTest(driver,driverName+" Datos");
		driver.findElement(loginButton).click();
		//Screenshooter.takeScreenShotTest(driver,driverName+" Error");
	}
	
	public void writeUserName(String user) {		
		driver.findElement(username).sendKeys(user);
	}
	
	public void writePassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickLoginButton() {		
		driver.findElement(loginButton).click();
	}	

}

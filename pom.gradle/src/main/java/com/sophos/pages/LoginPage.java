package com.sophos.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	By username=By.id("user_login");
	By password=By.xpath(".//*[@id=\"user_pass\"]");//chrome
	//By password=By.xpath(".//*(@id='user_pass')");ejemplo
	//By password=By.xpath(".//*[@id="user_pass"]");Firefox
	By loginButton=By.name("wp-submit");
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void loginToWordpress(String userId,String pass) {
		
		driver.findElement(username).sendKeys(userId);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginButton).click();
	}
	
	public void typeUserName(String uId) {
		
		driver.findElement(username).sendKeys(uId);
	}
	
	public void typrPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickLoginButton() {
		
		driver.findElement(loginButton).click();
	}

}

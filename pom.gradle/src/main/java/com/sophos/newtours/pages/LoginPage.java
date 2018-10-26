package com.sophos.newtours.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	By username=By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[2]/td[2]/input");
	By password=By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input");
	By loginButton=By.name("login");
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
    public void loginToNewtours(String userId,String pass) {
	
	    typeUserName(userId);	
	    typrPassword(pass);
	    clickLoginButton();

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

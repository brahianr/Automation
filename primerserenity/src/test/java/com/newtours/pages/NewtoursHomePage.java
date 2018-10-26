package com.newtours.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://newtours.demoaut.com/")
public class NewtoursHomePage extends PageObject{
	
	WebElementFacade user;
	WebElementFacade pass;
	
//	@FindBy(name="userName")
//	WebElement user;
//	@FindBy(name="password")
//	WebElement pass;
//	@FindBy(name="login")
//	WebElement loginButton;
	

	public void loginValidData(String username,String password) {
		typeInto(user,username);
		typeInto(pass,password);
//		user.sendKeys(username);
//		pass.sendKeys(password);
//		loginButton.click();
	}
	
	

}

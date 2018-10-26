package com.newtours.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.How;

import net.serenitybdd.core.pages.PageObject;

public class FlightFinderPage extends PageObject {
	
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/font")
	WebElement user;
	
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p/font")
	WebElement text;
	
	
	public String getValidLogin() {		
		return user.getText();		
	}
	
	public String getFailedLogin() {
		return text.getText();
	}

}

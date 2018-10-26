package com.newtours.steps;

import com.newtours.pages.FlightFinderPage;
import com.newtours.pages.NewtoursHomePage;

import junit.framework.Assert;
import net.thucydides.core.annotations.Step;


@SuppressWarnings("deprecation")
public class LoginSteps {
	
	NewtoursHomePage newtoursHomePage;
	FlightFinderPage flightFinderPage;
	
    @Step
	public void isOnNewtoursHomePage() {
    	newtoursHomePage.open();		
	}
    
    @Step
	public void loginWithValidData() {
    	newtoursHomePage.loginData("brahianr","1234");
	}
    
    @Step
    public void clickButtonLogin() {
    	newtoursHomePage.clickLoginButton();
    }
    
    @Step
	public void shouldBeOnFlightPage() {
    	//flightFinderPage.setWaitForTimeout(5000);
    	Assert.assertTrue(flightFinderPage.getValidLogin().contains("Use our Flight Finder"));
    	//Assert.assertTrue(flightFinderPage.getTitle().equals("Find a Flight: Mercury Tours: "));	    	
    }
    
    @Step
	public void loginWithInvalidData() {
		newtoursHomePage.loginData("bqw","1234");
    }
    
    @Step
	public void shouldBeOnPageLogin() {
		
		Assert.assertTrue(flightFinderPage.getFailedLogin().contains("Welcome back to"));
	}
    
}

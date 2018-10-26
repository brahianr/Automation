package com.newtours.steps;

import com.newtours.pages.FlightFinderPage;
import com.newtours.pages.NewtoursHomePage;

import junit.framework.Assert;
import net.thucydides.core.annotations.Step;

public class LoginSteps {
	
	NewtoursHomePage newtoursHomePage;
	FlightFinderPage flightFinderPage;
	
    @Step
	public void isOnNewtoursHomePage() {
    	newtoursHomePage.open();		
	}
    
    @Step
	public void loginWithValidData() {
    	newtoursHomePage.loginValidData("brahianr","1234");
	}
    
    @Step
	public void shouldBeOnFlightPage() {
		Assert.assertEquals(flightFinderPage.getTitle(), "Find a Flight: Mercury Tours: ");
	}

}

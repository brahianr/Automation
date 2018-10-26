package step;

import junit.framework.Assert;
import net.thucydides.core.annotations.Step;
import pages.FlightFinderPage;
import pages.NewtoursHomePage;

public class Step_Newtours {
	
	NewtoursHomePage newtoursHomePage;
	FlightFinderPage flightFinderPage;
    
	@Step
	public void openNewtoursPage() {
		newtoursHomePage.open();		
	}
	
	@Step
	public void userEnterData() {
		newtoursHomePage.loginData("brahianr", "1234");		
	}
	
	@Step
	public void userPressClickLoginButton() {
		newtoursHomePage.clickLoginButton();		
	}

	@Step
	public void shouldSeeFindFlightPage() {
		Assert.assertTrue(flightFinderPage.getValidLogin().contains("Use our Flight Finder"));
	}

}

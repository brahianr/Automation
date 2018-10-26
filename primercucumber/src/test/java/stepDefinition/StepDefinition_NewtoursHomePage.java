package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition_NewtoursHomePage {
	
	@Given("Abro chorme")
	public void abro_chorme() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("navegador");
	}

	@When("Voy a Newtours")
	public void voy_a_Newtours() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("New tours");
	}

	@Then("Aparece mensaje")
	public void aparece_mensje() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Mensaje");
	}
	/*
	@Given("User input username")
	public void user_input_username() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("User input password")
	public void user_input_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("Press login button")
	public void press_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("Launch browser")
	public void launch_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("Go to Newtours Home Page")
	public void go_to_Newtours_Home_Page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("I validate the pae flight")
	public void i_validate_the_pae_flight() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
    */

}

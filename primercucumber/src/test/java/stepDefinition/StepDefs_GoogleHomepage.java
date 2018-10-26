package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs_GoogleHomepage {
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Abrir pagina");
	}
	
	@When("I complete action")
	public void i_complete_action() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Abrir navegador");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Busvar boton");
	}

//	@Given("I want to write a step with name{int}")
//	public void i_want_to_write_a_step_with_name(Integer int1) {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("JJ");
//	}
//
//	@When("I check for the {int} in step")
//	public void i_check_for_the_in_step(Integer int1) {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("JJ");
//	}
//
//	@Then("I verify the success in step")
//	public void i_verify_the_success_in_step() {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("JJ");
//	}
//
//	@Then("I verify the Fail in step")
//	public void i_verify_the_Fail_in_step() {
//	    // Write code here that turns the phrase above into concrete actions
//		System.out.println("JJ");
//	}	

}

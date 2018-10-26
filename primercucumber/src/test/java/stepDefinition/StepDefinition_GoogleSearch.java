package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition_GoogleSearch {
	
	@Given("que lanzo el navegador Chrome")
	public void que_lanzo_el_navegador_Chrome() {

	}


	@When("^abro pagina de inicio de Google (Chrome|Firefox|Safari)$")
	public void abro_pagina_de_inicio_de_Google(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("Se muestra chrome");
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.out.println("Se muestra firefox");
		}
		else if(browser.equalsIgnoreCase("safari")) {			
			System.out.println("Se muestra safari");
		}	
	}

	@Then("busco (.*) en Googles")
	public void busco_en_Googles(String string) {

	}

}

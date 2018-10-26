package stepDefinition;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import step.Step_Newtours;

public class StepDefinition_NewtoursLoginPage {
	
	@Managed(driver="chrome")
	WebDriver driver;
	
	@Steps
	Step_Newtours stepNew;

	
	@Given("^el usuario esta en la pagina de inicio de newtours$")
	public void el_usuario_esta_en_la_pagina_de_inicio_de_newtours() {
		stepNew.openNewtoursPage();
	}

	@When("^el usuario ingrese usuario y clave valida$")
	public void el_usuario_ingrese_usuario_y_clave_valida() {
		stepNew.userEnterData();
	}

	@When("^haga click en el boton login$")
	public void haga_click_en_el_boton_login() {
		stepNew.userPressClickLoginButton();
	}

	@Then("^el usuario debera ver la pagina de registrar vuelos$")
	public void el_usuario_debera_ver_la_pagina_de_registrar_vuelos() {
		stepNew.shouldSeeFindFlightPage();
		
	}


}

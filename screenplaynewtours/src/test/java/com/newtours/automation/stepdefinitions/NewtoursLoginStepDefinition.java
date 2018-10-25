package com.newtours.automation.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.newtours.automation.exceptions.FiailLoginNewtoursExceptions;
import com.newtours.automation.models.LoginModel;
import com.newtours.automation.questions.NewtoursResult;
import com.newtours.automation.tasks.Login;
import com.newtours.automation.tasks.OpenTheBrowser;
import com.newtours.automation.userinterfaces.NewtoursHomePage;
import com.newtours.automation.utils.MessageSingOff;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static org.hamcrest.CoreMatchers.hasItem;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class NewtoursLoginStepDefinition {
	
	@Managed(driver="chrome",options="--start-maximized --incognito")
	private WebDriver hisbrowser;
	
	//private LoginModel loginModel;
	
	private Actor brahian= Actor.named("Brahian");
	
	private NewtoursHomePage newtoursHomePage;
	
	@Before
	public void setUp() {
		brahian.can(BrowseTheWeb.with(hisbrowser));
	}
	
	@Given("^that brahian wants login on newtours$")
	public void thatBrahianWantsLoginOnNewtours() {
		//abre el navegador
		brahian.wasAbleTo(OpenTheBrowser.on(newtoursHomePage));
	}
	
	@When("^he enter your username and password$")
	public void heEnterYourUsernameAndPassword(List<LoginModel> user) {
		//revice los valores del feature y los almacena en la lista
		brahian.attemptsTo(Login.with(user.get(0)));
	}

	@Then("^he should see the find flight page$")
	public void heShouldSeeTheFindFlightPage(){
		//Valida que haya cargado la pagina de reservar vuelos
		brahian.should(seeThat(NewtoursResult.displayed(),hasItem(MessageSingOff.FIND_BUTTON)).orComplainWith(FiailLoginNewtoursExceptions.class,FiailLoginNewtoursExceptions.LOGIN_FAIL));
	}

}

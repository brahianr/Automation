package com.newtours.automation.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.hasItem;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.newtours.automation.exceptions.FailLoadRegisterUserPageExceptions;
import com.newtours.automation.models.RegisterUserModel;
import com.newtours.automation.questions.NewtoursLoadRegisterUserPage;
import com.newtours.automation.questions.NewtoursResult;
import com.newtours.automation.tasks.OpenTheBrowser;
import com.newtours.automation.tasks.RegisterUser;
import com.newtours.automation.userinterfaces.NewtoursHomePage;
import com.newtours.automation.utils.MessageSingOff;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;
//import static org.hamcrest.CoreMatchers.hasItem;

public class NewtoursRegisterUserStepDefinition {
	
	@Managed(driver="chrome",options="--start-maximized --incognito")
	private WebDriver hisbrowser;
	
	//private LoginModel loginModel;
	
	private Actor brahian= Actor.named("Brahian");
	
	private NewtoursHomePage newtoursHomePage;
	
	@Before
	public void setUp() {
		//asigna el driver
		brahian.can(BrowseTheWeb.with(hisbrowser));
	}
	
	@Given("^that brahian wants register on newtours$")
	public void thatBrahianWantsRegisterOnNewtours() {
		//abre el navegador
		brahian.wasAbleTo(OpenTheBrowser.on(newtoursHomePage));
	}

	@When("^he clicks on the link register$")
	public void heClicksOnTheLinkRegister() {
		//se da click en el link de regitro
		brahian.attemptsTo(Click.on(newtoursHomePage.REGISTER_BUTTON));
		

	}
	
	@When("^he registers with the following data$")
	public void heRegistersWithTheFollowingData(List<RegisterUserModel> register) {
		//se almacenan los parametros que vienen del feature en una lista
		brahian.attemptsTo(RegisterUser.with(register.get(0)));
		
	}

	@Then("^he should see the message registration successful$")
	public void heShouldSeeTheMessageRegistrationSuccessful() {
		//valida si el registro fue correcto
		brahian.should(seeThat(NewtoursResult.displayed(),hasItem(MessageSingOff.FIND_BUTTON)));
	}

}

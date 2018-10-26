package co.com.bancolombia.certification.screenplaytutorial.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.bancolombia.certification.screenplaytutorial.tasks.GoTo;
import co.com.bancolombia.certification.screenplaytutorial.tasks.OpenTheBrowser;
import co.com.bancolombia.certification.screenplaytutorial.tasks.Translate;
import co.com.bancolombia.certification.screenplaytutorial.userinterfaces.GoogleAppsComponent;
import co.com.bancolombia.certification.screenplaytutorial.userinterfaces.GoogleHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class GoogleTranslateStepDefinition {
	
	
	@Managed(driver="chrome")
	private WebDriver herBrowser;
	
	private Actor susan = Actor.named("Susan");
	
	private GoogleHomePage googleHomePage;
	
	@Before
	public void setUp() {
		susan.can(BrowseTheWeb.with(herBrowser));
	}
	
	@Given("^that susan wants to translate a word$")
	public void thatSusanWantsToTranslateAWord() throws Exception {
		susan.wasAbleTo(OpenTheBrowser.on(googleHomePage),
				GoTo.theApp(GoogleAppsComponent.GOOGLE_TRANSLATE));
	}

	@When("^she translates the word (.*) from English to Spanish$")
	public void sheTranslatesTheWordCheeseFromEnglishToSpanish(String word) throws Exception {
		susan.attemptsTo(Translate.the(word));
	}

	@Then("^she should see the word queso in the screen$")
	public void sheShouldSeeTheWordQuesoInTheScreen() throws Exception {
	}

}

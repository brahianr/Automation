package co.com.bancolombia.certification.steptostep.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.bancolombia.certification.steptostep.models.SearchExpression;
import co.com.bancolombia.certification.steptostep.tasks.OpenTheBrowser;
import co.com.bancolombia.certification.steptostep.tasks.SearchWord;
import co.com.bancolombia.certification.steptostep.userinterfaces.CompuTrabajoHomePage;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class SteptoStepStepDefinitions {
	
	@Managed(driver = "chrome",uniqueSession=true)
	WebDriver hisBrowser;
	
	private Actor vlady= Actor.named("Vlady");
	private CompuTrabajoHomePage computrabajoHomePage;
	
	@Before
	public void setup() {
	   vlady.can(BrowseTheWeb.with(hisBrowser));
	}	

	
	@Given("^that vlady opens his browser at computrabajo Home Page$")
	public void that_vlady_opens_his_browser_at_computrabajo_Home_Page() throws Exception {
		vlady.wasAbleTo(OpenTheBrowser.at(computrabajoHomePage));
	}


	@Given("^he goes to option of search$")
	public void he_goes_to_option_of_search() throws Exception {
		
	}

	@When("^he search the word (.*)$")
	public void he_search_the_word_proyecto(String word) throws Exception {
		vlady.attemptsTo(SearchWord.the(new SearchExpression(word)));
	}

	@Then("^he should see the options of job in the screen$")
	public void he_should_see_the_options_of_job_in_the_screen() throws Exception {
	}

}

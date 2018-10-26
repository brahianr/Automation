package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="resources/features",glue="stepDefinition")
public class TestRunner_NewtoursHomePage {

}

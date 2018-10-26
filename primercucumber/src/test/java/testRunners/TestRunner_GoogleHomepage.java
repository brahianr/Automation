package testRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="resources/features",glue="stepDefinition",plugin= {"pretty","html:target/cucumber-reports"},
                 monochrome=true)
public class TestRunner_GoogleHomepage {
	
	
}

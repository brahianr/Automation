package co.com.bancolombia.certification.steptostep.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features",
                 glue="co.com.bancolombia.certification.steptostep.stepdefinitions") 
public class SteptoStepRunner {

}

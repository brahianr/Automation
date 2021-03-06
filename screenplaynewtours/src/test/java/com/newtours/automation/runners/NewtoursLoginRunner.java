package com.newtours.automation.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/newtours_login.feature",
                 glue="com.newtours.automation.stepdefinitions",tags="@tag1",
                 snippets=SnippetType.CAMELCASE)
public class NewtoursLoginRunner {

}

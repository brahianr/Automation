package com.alibaba.reto.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/alibaba_addtocarproduct.feature",
                 glue="com.alibaba.reto.stepdefinitions",
                 snippets=SnippetType.CAMELCASE)
public class AlibabaAddToCarRunner {

}

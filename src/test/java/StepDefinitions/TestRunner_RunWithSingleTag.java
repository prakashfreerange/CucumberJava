package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureWithTags/tags.feature",
glue= {"StepDefinitions"},
tags = "@Smoke and not (@Regression or @Important)", 
monochrome = true,
plugin = {"pretty","html:target/cucumber-report.html"}
)
public class TestRunner_RunWithSingleTag {

}

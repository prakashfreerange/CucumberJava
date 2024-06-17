package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/BackgroundDemo/backDemo.feature",
glue= {"StepsForBackground"}, 
monochrome = true,
plugin = {"pretty","html:target/cucumber-report.html"}
)
public class TestRunnerForBackgroundDemo {

}

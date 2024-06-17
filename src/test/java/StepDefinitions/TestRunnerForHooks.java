package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/HooksDemo/hooksDemo.feature",
glue= {"StepsForHooks"}, 
monochrome = true,
plugin = {"pretty","html:target/cucumber-report.html"}
)
public class TestRunnerForHooks {

}

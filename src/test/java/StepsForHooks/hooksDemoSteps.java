package StepsForHooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class hooksDemoSteps {
	
	WebDriver driver;

	@Before
	public void browserSetup() {
		System.out.println("I am inside Browser setup");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}

	@After
	public void tearDown() {
		System.out.println("I am inside Tear Down Method.");
		driver.quit();
	}
	
	@BeforeStep
	public static void beforesteps() {
		System.out.println("I am Inside BeforeStep.");
	}
	@AfterStep
	public static void aftersteps() {
		System.out.println("I am Inside AfterStep.");
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() {

	}
	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {

	}
	@And("user clicks on login button")
	public void user_clicks_on_login_button() {

	}
	@Then("user is redirected to home page")
	public void user_is_redirected_to_home_page() {

	}




}

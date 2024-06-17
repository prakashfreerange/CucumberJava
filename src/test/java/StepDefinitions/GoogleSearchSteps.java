package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchSteps {
	
	WebDriver driver = null;

	@Given("browser is open")
	public void browser_is_open() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		System.out.println("Inside Step - Browser is open");
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		
		driver.get("https://www.google.com/");
		
		System.out.println("Inside Step - User is on Google search page");
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		
		driver.findElement(By.name("q")).sendKeys("Anon Consultant");
		
		System.out.println("Inside Step - Users enters text in search box");
	}

	@And("hits enter")
	public void hits_enter() {
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println("Inside Step - User hist enter button");
	}

	@Then("User is navigated to search result")
	public void user_is_navigated_to_search_result() {
		
		driver.getPageSource().contains("Anon Consultants: Home");
		System.out.println("Inside Step - User navigated to google result page");
		driver.close();
	}

}

package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginDemoSteps {
	
	WebDriver driver = null;
	

		@Given("Broweser is open")
		public void broweser_is_open() {
		   WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		}

		@Given("user is on login page")
		public void user_is_on_login_page() {
		    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}

		@When("User enter login details")
		public void user_enter_login_details() {
		    driver.findElement(By.name("username")).sendKeys("Admin");
		    driver.findElement(By.name("password")).sendKeys("admin123");
		    driver.findElement(By.xpath("//button")).click();
		}

		@Then("User navigated to home page")
		public void user_navigated_to_home_page() {
		    driver.findElement(By.xpath("//h6[contains(.,'Dashboard')]")).isDisplayed();
		    driver.quit();
		}

}

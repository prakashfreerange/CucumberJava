package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.loginPage;

public class LoginStepsPOM {
	

//	
//	WebDriver driver;
//	loginPage login;
//
//
//	@Given("browser is open now.")
//	public void browser_is_open() {
//		System.out.println("Insode POM file");
//		WebDriverManager.chromedriver().setup();
//		   driver = new ChromeDriver();
//		   driver.manage().window().maximize();
//		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//	}
//
//	@Given("user is on login page now.")
//	public void user_is_on_login_page() {
//		
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	}
//
//	@When("^enters (.*) and (.*)$")
//	public void user_enters_admin_and_admin123(String un, String pw) {
//		login = new loginPage(driver);
//		login.enterUsername(un);
//		login.enterPassword(pw);
//	}
//
//	@When("clicks on login button now.")
//	public void clicks_on_login_button() {
//
//		login.clickLoginBtn();
//	}
//
//	@Then("user is navigated to the home page now")
//	public void user_is_navigated_to_the_home_page() {
//
//		login.dashboardDisplayed();
//	    driver.quit();
//	}

}

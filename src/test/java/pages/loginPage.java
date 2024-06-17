package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	WebDriver driver;
	
	By username_loginpage = By.name("username");
	
	By password_loginpage = By.name("password");
	
	By loginBtn_loginPage = By.xpath("//button");
	
	By dashboard_text = By.xpath("//h6[contains(.,'Dashboard')]");
	
	
	//This constructor is user to pass the webdriver driver instance
	public loginPage(WebDriver driver) {
		this.driver = driver;
	}

	
	public void enterUsername(String uname) {
		driver.findElement(username_loginpage).sendKeys(uname);
	}
	
	public void enterPassword(String pword) {
		driver.findElement(password_loginpage).sendKeys(pword);
	}
	
	public void clickLoginBtn() {
		driver.findElement(loginBtn_loginPage).click();
	}
	
	public void dashboardDisplayed() {
		driver.findElement(dashboard_text).isDisplayed();
	}
	
//	public void loginWithValidUser(String uname, String pword) {
//		driver.findElement(username_loginpage).sendKeys(uname);
//		driver.findElement(password_loginpage).sendKeys(pword);
//		driver.findElement(loginBtn_loginPage).click();
//	}
	
}

package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage_PF {
	
	
	
	WebDriver driver;
	
	public homePage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h6[contains(.,'Dashboard')]")
	WebElement txt_dashboard;
	
	public void dashboardDisplayed() {
		txt_dashboard.isDisplayed();
	}
	
}

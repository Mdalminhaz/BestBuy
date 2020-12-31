package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AppleSignIn {
	
	public WebDriver driver;
	By User = By.xpath("//input[@id='account_name_text_field']");
	By Enter= By.xpath("//body/div[@id='content']/oauth-init[1]/div[1]/div[1]/oauth-signin[1]/div[1]/apple-auth[1]/div[1]/div[1]/div[1]/sign-in[1]/div[1]/div[1]/button[1]/i[1]");
	By Pass = By.xpath("//input[@id='password_text_field']");
	
	public AppleSignIn(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	public WebElement User() {

		return driver.findElement(User);
	}

	public WebElement Password() {

		return driver.findElement(Pass);
	}
	
	
	public WebElement Enter() {

		return driver.findElement(Enter);
	}

	
}


package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSignIn {


	public WebDriver driver;
	By User = By.xpath("//input[@id='fld-e']");
	By Pass = By.cssSelector("#fld-p1");
	By Sign = By.xpath("//button[contains(text(),'Sign In')]");
	
	public GoogleSignIn(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	public WebElement User() {

		return driver.findElement(User);
	}

	public WebElement Password() {

		return driver.findElement(Pass);
	}
	
	public WebElement Sign() {

		return driver.findElement(Sign);
	}
	
}

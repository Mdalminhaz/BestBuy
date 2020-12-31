package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	public WebDriver driver;
	
	By email = By.xpath("//input[@id='fld-e']");
	By pass = By.cssSelector("#fld-p1");
	By sign = By.xpath("//button[contains(text(),'Sign In')]");

	public Login(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement Email() {

		return driver.findElement(email);
	}

	public WebElement Password() {

		return driver.findElement(pass);
	}

	public WebElement SignIn() {

		return driver.findElement(sign);
	}

}

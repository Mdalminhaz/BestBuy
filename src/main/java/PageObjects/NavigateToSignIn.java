package PageObjects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import Resources.base;

public class NavigateToSignIn extends base{
	public WebDriver driver;


	By account = By.xpath("//span[contains(text(),'Account')]");
	By sign =By.xpath("//button[contains(text(),'Sign In')]");


	public NavigateToSignIn(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	public WebElement Account() {

		return driver.findElement(account);
	}
	
	public WebElement Sign() {

		return driver.findElement(sign);
	}


	

	
}

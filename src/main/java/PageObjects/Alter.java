package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Alter {

	public WebDriver driver;


	By gmail = By.xpath("//body/div[1]/div[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/button[1]");
	By apple = By.xpath("//body/div[1]/div[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]");
	
	public Alter(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	
	
	public WebElement gMail() {

		return driver.findElement(gmail);
	}
	
	public WebElement Apple() {

		return driver.findElement(apple);
	}
	
	
}

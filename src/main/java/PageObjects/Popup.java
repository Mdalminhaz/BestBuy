package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Popup {
	public WebDriver driver;

	By pop = By.xpath("//body/main[1]/div[2]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]");

	public Popup(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement PopUps() {

		return driver.findElement(pop);
	}
	
}

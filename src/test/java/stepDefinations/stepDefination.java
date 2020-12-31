package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;

import org.openqa.selenium.WebDriver;

import PageObjects.Alter;
import PageObjects.AppleSignIn;
import PageObjects.GoogleSignIn;
import PageObjects.Login;
import PageObjects.NavigateToSignIn;
import PageObjects.Popup;
import Resources.base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination extends base {
	
	@Given("^Initilize driver$")
	public void initilize_driver() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver = InitialDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Given("^navigates to \"([^\"]*)\"$")
	public void navigates_to(String Url) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(Url);
	}

	@Given("^Click on Login link in home page to land on Secure sign in Page$")
	public void click_on_Login_link_in_home_page_to_land_on_Secure_sign_in_Page() throws Throwable {
		// Execute
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Popup p = new Popup(driver);
		p.PopUps().click();
		NavigateToSignIn n = new NavigateToSignIn(driver);
		n.Account().click();
		n.Sign().click();

	}

	@When("^User Logs in with \"([^\"]*)\" And \"([^\"]*)\"$")
	public void user_Logs_in_with_And(String User, String Password) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Login l = new Login(driver);
		l.Email().sendKeys(User);
		l.Password().sendKeys(Password);
		l.SignIn().click();
	}

	@Then("^dont allow in \"([^\"]*)\"$")
	public void dont_allow_in(String wrong) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(wrong);

	}

	@Then("^user can sign in with Apple$")
	public void user_can_sign_in_with_Apple() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Alter a = new Alter(driver);
		a.Apple().click();
	}
	
	@Then("^user will put Apple \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_will_put_apple_something_and_something(String User, String Pass) throws Throwable {
		AppleSignIn z= new AppleSignIn(driver);
		z.User().sendKeys(User);
		z.Enter().click();
		z.Password().sendKeys(Pass);;
	}
	
	@When("^user will put Gmail \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_will_put_gmail_something_and_something(String User, String Pass) throws Throwable {
		//i could not sign in with gmail for some reason
		GoogleSignIn g= new GoogleSignIn(driver);
		g.User().sendKeys(User);
		g.Password().sendKeys(Pass);
		
	}

	 @Then("^allow in$")
	    public void allow_in() throws Throwable {
		 GoogleSignIn g= new GoogleSignIn(driver);
		 g.Sign().click();
		 
	    }
	
	
	 @And("^quit Browser$")
	    public void quit_browser() throws Throwable {
		 Thread.sleep(3000);
		 driver.close();
		 
	 }

	 
	 
}

package steps;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.LoginPage;
import util.BrowserFactory;

public class LoginStepDefinition extends BrowserFactory{
	LoginPage loginpage;
	
	@Before
	public void beforeRun() {
		initDriver();
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		driver.get("https://techfios.com/billing/?ng=admin/");
	}
	
	@Given("^User is on the Techfios login page$")
	public void user_is_on_the_Techfios_login_page() throws Throwable {
		
	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username) throws Throwable {
	   loginpage.insertUserName(username);
	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) throws Throwable {
	   loginpage.insertPassword(password);
	}

	@And("^User clicks on signin button$")
	public void user_clicks_on_signin_button() throws Throwable {
	   loginpage.clickSignInButton();
	   this.driver.getWindowHandle();
	  SessionId temp = ((RemoteWebDriver)this.driver).getSessionId();
	}

	@Then("^User should land on dashboard page$")
	public void user_should_land_on_dashboard_page() throws Throwable {
	   Assert.assertEquals("Dashboard- iBilling", loginpage.verifyDashboardPageTitle());
	}
	
	//@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}

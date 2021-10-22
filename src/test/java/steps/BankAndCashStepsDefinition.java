package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BankAndCashPage;
import pages.LoginPage;
import util.BrowserFactory;

public class BankAndCashStepsDefinition {
	WebDriver driver;

	BankAndCashPage bankandcashpage;
	
	@Given("^User is on the dashboard page$")
	public void User_is_on_the_dashboard_page() {
		this.driver = BrowserFactory.initDriver();
		bankandcashpage = PageFactory.initElements(driver, BankAndCashPage.class);
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.insertUserName("demo@techfios.com");
		loginpage.insertPassword("abc123");
		loginpage.clickSignInButton();
		
	}

	@When("^User clicks on Bank and Cash button$")
	public void user_clicks_on_Bank_and_Cash_button() throws Throwable {
		bankandcashpage.click_on_bank_And_Cash();
	}

	@When("^User clicks on New Account$")
	public void user_clicks_on_New_Account() throws Throwable {
		bankandcashpage.click_on_New_Account();
	}

	@And("^User fills out the form$")
	public void user_fills_out_the_form() throws Throwable {
		bankandcashpage.insert_Account_Title();
		bankandcashpage.insert_description();
		bankandcashpage.insert_initial_Balance();
		bankandcashpage.insert_account_Number();
		bankandcashpage.insert_contact_Person();
		bankandcashpage.insert_phone();
		bankandcashpage.insert_internet_Banking_Url();
	}

	@And("^Clicks submit$")
	public void clicks_submit() throws Throwable {
		bankandcashpage.click_submit_Button();
	}

	@Then("^The account should be successfully created$")
	public void the_account_should_be_successfully_created() throws Throwable {

	}

}

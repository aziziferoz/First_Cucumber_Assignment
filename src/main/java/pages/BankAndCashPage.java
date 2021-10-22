package pages;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import util.BrowserFactory;

public class BankAndCashPage {

	WebDriver driver;

	public BankAndCashPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Bank & Cash')]")
	WebElement bank_And_Cash_Element;
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'New Account')]")
	WebElement new_Account_Button_Element;
	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement account_Title_Element_Button;
	@FindBy(how = How.XPATH, using = "//input[@id='description']")
	WebElement description_Button;
	@FindBy(how = How.XPATH, using = "//input[@id='balance']")
	WebElement initial_Balance_Element;
	@FindBy(how = How.XPATH, using = "//input[@id='account_number']")
	WebElement account_Number_Element;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_person']")
	WebElement contact_Person_Element;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_phone']")
	WebElement phone_Element;
	@FindBy(how = How.XPATH, using = "//input[@id='ib_url']")
	WebElement internet_Banking_Url_Element;
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary']")
	WebElement submit_Button_Element;

	Random rnd = new Random();
	int generatedNo = rnd.nextInt(999);
	
	public void click_on_bank_And_Cash() {
		bank_And_Cash_Element.click();		
	}
	
	public void click_on_New_Account() {
		new_Account_Button_Element.click();
	}

	public void insert_Account_Title() {
		account_Title_Element_Button.sendKeys("Techfios2356" +generatedNo);
	}

	public void insert_description() {
		description_Button.sendKeys("Techfios" +generatedNo);
	}

	public void insert_initial_Balance() {
		initial_Balance_Element.sendKeys("1235687" +generatedNo);
	}

	public void insert_account_Number() {
		account_Number_Element.sendKeys("98766465" +generatedNo);
	}

	public void insert_contact_Person() {
		contact_Person_Element.sendKeys(generatedNo+ "Ashraf");
	}

	public void insert_phone() {
		phone_Element.sendKeys("5479863" +generatedNo);
	}

	public void insert_internet_Banking_Url() {
		internet_Banking_Url_Element.sendKeys("www.techfios.com"+generatedNo);
	}

	public void click_submit_Button() {
		submit_Button_Element.click();
	}

}

package objectsRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonPackage.CommonActions;

public class PolicyHolderDetailsPage {

	public PolicyHolderDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "F_PH_FirstName_0")
	WebElement firstName;
	@FindBy(id = "F_PH_MiddleInitial_0")
	WebElement initial;
	@FindBy(id = "F_PH_LastName_0")
	WebElement lastName;
	@FindBy(id = "F_PH_DOB_0")
	WebElement dob;
	@FindBy(id = "F_PH_email_0")
	WebElement email;
	@FindBy(id = "F_street_0")
	WebElement residenceAddress;
	@FindBy(xpath = "//input[@name='F_city']")
	WebElement city;
	@FindBy(id = "F_state_0")
	WebElement state;
	@FindBy(id = "F_zipCode_0")
	WebElement zipcode;
	@FindBy(id = "F_livingYear_0")
	WebElement whatYear;
	@FindBy(id = "_evidon-decline-button")
	WebElement cookiesAccept;
	@FindBy(xpath = "//a[@class='button continue-button']")
	WebElement nextPage;
	@FindBy(xpath = "//span[text()='Continue ']")
	WebElement addressSelect;

	public void enteringFirstName(CommonActions ca, String value) {
		ca.enterText(firstName, value);
	}

	public void enterInitial(CommonActions ca, String value) {
		ca.enterText(initial, value);
	}

	public void enterLastName(CommonActions ca, String value) {
		ca.enterText(lastName, value);
	}

	public void enterDOB(CommonActions ca, String value) {
		ca.enterText(dob, value);
	}

	public void enterEmail(CommonActions ca, String value) {
		ca.enterText(email, value);
	}

	public void enterAddress(CommonActions ca, String value) {
		ca.enterText(residenceAddress, value);
	}

	public void enterCity(CommonActions ca, String value) {
		ca.enterText(city, value);
	}

	public void selectState(CommonActions ca) {
		ca.dropDown(state, "NY");
	}

	public void enterZipCode(CommonActions ca) {
		ca.enterText(zipcode, "14206");
	}

	public void putYear(CommonActions ca) {
		ca.enterText(whatYear, "2020");
	}

	public void cookieAccpt(CommonActions ca) {
		ca.clicking(cookiesAccept);
	}

	public void continueNextpage(CommonActions ca) {
		ca.clicking(nextPage);
	}
	public void selectAddress(CommonActions ca) {
		ca.clicking(addressSelect);
	}

}

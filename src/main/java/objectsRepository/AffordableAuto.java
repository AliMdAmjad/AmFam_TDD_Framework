package objectsRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonPackage.CommonActions;

public class AffordableAuto {

	  public AffordableAuto(WebDriver driver) {
		  PageFactory.initElements( driver,this);
	  }
	
	@FindBy(xpath = "//input[@id='uid_35']") public WebElement zipCode;
	
	@FindBy(xpath = "//select[@id='uid_38']") public WebElement insuranceType;
	
	@FindBy(xpath = "//button[normalize-space(text())='Get a Quote']") public WebElement getQteButton;
	
	public void enterZip(CommonActions ca) {
		ca.enterText(zipCode, "14206");
	}
	public void insuranceSelect(CommonActions ca) {
		ca.dropDown(insuranceType, "A");
	}
	public void clickGtQteButton(CommonActions ca) {
		ca.clicking(getQteButton);
	}
	
	
	
}

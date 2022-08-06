package objectsRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonPackage.CommonActions;

public class Homepage {

	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//button[@class='LeadRouting__select a'])[1]")
	public WebElement car;

	@FindBy(id = "uid_54")
	public WebElement zipCodElement;

	@FindBy(xpath = "(//span[text()=' Start Quoting '])[1]")
	public WebElement startQuoteBtn;

	public void carMethod(CommonActions ca) {
		ca.clicking(car);
	}
	
	public void zipCodeMethod(CommonActions ca) {
		ca.enterText(zipCodElement, "14206");	
	}
	
	public void startQuotingMethod(CommonActions ca) {
		ca.clicking(startQuoteBtn);
	}
	
	

}

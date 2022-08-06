package objectsRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonPackage.CommonActions;

public class GetAQuotePage {
	
	       public GetAQuotePage(WebDriver driver) {
	    	   PageFactory.initElements(driver, this);
	       }
	  
	
	@FindBy(xpath = "//span[text()='Get a Quote']") public WebElement getAQte;
	
	
	  public void getAQuotecliking(CommonActions ca) {
		  ca.clicking(getAQte);
		  
	  }
	
	
	
	

}

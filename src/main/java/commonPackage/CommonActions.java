package commonPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonActions {

	public void clicking(WebElement element) {
		element.click();
	}

	public void enterText(WebElement element, String value) {
		element.sendKeys(value);
	}

	public void dropDown(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}
	
	public String getTheText(WebElement element) {
		return element.getText();
	}

}

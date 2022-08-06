package basePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import commonPackage.CommonActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectsRepository.AffordableAuto;
import objectsRepository.GetAQuotePage;
import objectsRepository.Homepage;
import objectsRepository.PolicyHolderDetailsPage;

public class BaseClass {

	public static WebDriver driver;
	
	public Homepage hp;
	public CommonActions ca;
	public GetAQuotePage gPage;
	public AffordableAuto affordableAuto;
	public PolicyHolderDetailsPage policyHolderDetailsPage;

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amfam.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        initialization();
	}
	
	public void initialization() {
		hp=new Homepage(driver);
		ca=new CommonActions();
		gPage=new GetAQuotePage(driver);
		affordableAuto=new AffordableAuto(driver);
		policyHolderDetailsPage=new PolicyHolderDetailsPage(driver);
		
	}
	
	
	@AfterTest
	public void tearUp() {
	//driver.quit();
	}
	
	
	
	
	

}

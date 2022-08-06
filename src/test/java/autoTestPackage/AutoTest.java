package autoTestPackage;

import org.testng.annotations.Test;

import basePackage.BaseClass;

public class AutoTest extends BaseClass {

	@Test
	public void firstAutoTesting() {
		hp.carMethod(ca);
		hp.zipCodeMethod(ca);
		hp.startQuotingMethod(ca);
		gPage.getAQuotecliking(ca);
		affordableAuto.enterZip(ca);
		affordableAuto.insuranceSelect(ca);
		affordableAuto.clickGtQteButton(ca);
		policyHolderDetailsPage.enteringFirstName(ca, "Md");
		policyHolderDetailsPage.enterInitial(ca, "A");
		policyHolderDetailsPage.enterLastName(ca, "Ali");
		policyHolderDetailsPage.enterDOB(ca, "01/01/1990");
		policyHolderDetailsPage.enterEmail(ca, "ali_33@gmail.com");
		policyHolderDetailsPage.enterAddress(ca, "952 E Lovejoy St");
		policyHolderDetailsPage.enterCity(ca, "New York");
		policyHolderDetailsPage.selectState(ca);
		policyHolderDetailsPage.enterZipCode(ca);
		policyHolderDetailsPage.putYear(ca);
		policyHolderDetailsPage.cookieAccpt(ca);
		policyHolderDetailsPage.continueNextpage(ca);
		policyHolderDetailsPage.selectAddress(ca);
	}
}

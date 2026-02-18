package testcases;

import org.testng.annotations.Test;

import baseclass.ProjectSpecificMethods;
import pages.LoginPage;

public class TC001_CreateLeadFunctionality extends ProjectSpecificMethods {
	@Test
	public void createLead() {
		LoginPage lp = new LoginPage(getDriver());
		lp.enterUsername().enterPassword().clickLoginButton().clickCrmsfa().clickLeadTab().clickCreateLead()
				.enterCompanyName().enterFirstName().enterLastName().clickCreateLeadButton().verifyCreateLead();

	}
}

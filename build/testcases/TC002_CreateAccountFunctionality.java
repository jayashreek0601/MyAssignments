package testcases;

import org.testng.annotations.Test;

import baseclass.ProjectSpecificMethods;
import pages.LoginPage;

public class TC002_CreateAccountFunctionality extends ProjectSpecificMethods {
	@Test
	public void createLead() {
		LoginPage lp = new LoginPage(getDriver());
		lp.enterUsername().enterPassword().clickLoginButton().clickCrmsfa().clickAccountTab().clickCreateAccount()
				.enterAccountname().clickCreateAccountButton().verifyAccountCreated();
	}
}

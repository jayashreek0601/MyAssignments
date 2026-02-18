package pages;

import baseclass.ProjectSpecificMethods;

public class ViewAccountPage extends ProjectSpecificMethods {
	public void verifyAccountCreated() {
		String title = driver.getTitle();
		System.out.println(title);
	}
}

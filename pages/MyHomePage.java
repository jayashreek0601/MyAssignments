package pages;

import org.openqa.selenium.By;

import baseclass.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {
	public MyLeadPage clickLeadTab() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadPage();
	}

	public MyAccountPage clickAccountTab() {
		driver.findElement(By.linkText("Accounts")).click();
		return new MyAccountPage();
	}
}

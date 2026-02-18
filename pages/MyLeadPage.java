package pages;

import org.openqa.selenium.By;

import baseclass.ProjectSpecificMethods;

public class MyLeadPage extends ProjectSpecificMethods {
	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();

	}

}

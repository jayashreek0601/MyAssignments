package pages;

import org.openqa.selenium.By;


import baseclass.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {
	public CreateLeadPage enterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC");
		return this;
	}

	public CreateLeadPage enterFirstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bot Test00001");
		return this;
	}

	public CreateLeadPage enterLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Testing");
		return this;
	}

	public ViewLeadPage clickCreateLeadButton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage();

	}

}

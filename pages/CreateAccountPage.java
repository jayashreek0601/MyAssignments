package pages;

import org.openqa.selenium.By;

import baseclass.ProjectSpecificMethods;

public class CreateAccountPage extends ProjectSpecificMethods{
	public CreateAccountPage enterAccountname() {
		driver.findElement(By.xpath("(//span[text()='Account Name']//following::input)[1]")).sendKeys("Bot Test");
		return this;
	}
	public ViewAccountPage clickCreateAccountButton() {
		driver.findElement(By.className("smallSubmit")).click();
		return new ViewAccountPage();
	}

}

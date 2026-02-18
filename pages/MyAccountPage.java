package pages;

import org.openqa.selenium.By;

import baseclass.ProjectSpecificMethods;

public class MyAccountPage extends ProjectSpecificMethods {

	public CreateAccountPage clickCreateAccount()  {
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		return new CreateAccountPage();
	}
}

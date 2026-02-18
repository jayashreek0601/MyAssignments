package pages;

import org.openqa.selenium.By;

import baseclass.ProjectSpecificMethods;

public class WelcomePage extends ProjectSpecificMethods {
	public MyHomePage clickCrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}

}

package pages;

import org.openqa.selenium.By;

import baseclass.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	public LoginPage enterUsername() {
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		return this;
	}
	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}
	public WelcomePage clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
	}
}

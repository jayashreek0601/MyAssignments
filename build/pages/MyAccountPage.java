package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePage {
	public MyAccountPage(WebDriver driver) {
        super(driver);
    }
	public CreateAccountPage clickCreateAccount()  {
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		return new CreateAccountPage(driver);
	}
}

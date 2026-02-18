package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyHomePage extends BasePage {
	public MyHomePage(WebDriver driver) {
        super(driver);
    }
	public MyLeadPage clickLeadTab() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadPage(driver);
	}

	public MyAccountPage clickAccountTab() {
		driver.findElement(By.linkText("Accounts")).click();
		return new MyAccountPage(driver);
	}
}

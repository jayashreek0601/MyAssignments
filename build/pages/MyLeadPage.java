package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyLeadPage extends BasePage {
	public MyLeadPage(WebDriver driver) {
        super(driver);
    }
	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);

	}

}

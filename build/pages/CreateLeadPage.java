package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateLeadPage extends BasePage {
	public CreateLeadPage(WebDriver driver) {
        super(driver);
    }
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
		return new ViewLeadPage(driver);

	}

}

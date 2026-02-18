package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage extends BasePage{
	public CreateAccountPage(WebDriver driver) {
        super(driver);
    }
	public CreateAccountPage enterAccountname() {
		driver.findElement(By.xpath("(//span[text()='Account Name']//following::input)[1]")).sendKeys("Bot Test");
		return this;
	}
	public ViewAccountPage clickCreateAccountButton() {
		driver.findElement(By.className("smallSubmit")).click();
		return new ViewAccountPage(driver);
	}

}

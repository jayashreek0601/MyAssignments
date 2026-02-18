package pages;

import org.openqa.selenium.WebDriver;

public class ViewAccountPage extends BasePage {
	public ViewAccountPage(WebDriver driver) {
        super(driver);
    }
	public void verifyAccountCreated() {
		String title = driver.getTitle();
		System.out.println(title);
	}
}

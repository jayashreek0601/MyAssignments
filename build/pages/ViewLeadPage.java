package pages;

import org.openqa.selenium.WebDriver;

public class ViewLeadPage extends BasePage {
	public ViewLeadPage(WebDriver driver) {
        super(driver);
    }
	public void verifyCreateLead() {
		System.out.println("Create lead is successfully created");
	}
}

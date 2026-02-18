package pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class WelcomePage extends BasePage {
	public WelcomePage(WebDriver driver) {
        super(driver);
    }
	public MyHomePage clickCrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage(driver);
	}

}

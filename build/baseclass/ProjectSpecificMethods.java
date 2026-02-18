package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethods {
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	public WebDriver getDriver() {
		return driver.get();
	}

	@BeforeMethod
	public void preConditions() {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		driver.set(new ChromeDriver(opt));
		getDriver().manage().window().maximize();
		getDriver().get("http://leaftaps.com/opentaps/control/main");
	}

	@AfterMethod
	public void postConditions() {
		if (getDriver() != null) {
			getDriver().quit();
			driver.remove();
		}
	}
}

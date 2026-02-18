package baseclass;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethods {
	public static WebDriver driver;
	@BeforeMethod
	public void preConditions() {
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("guest");
		driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
	}
	
	@AfterMethod
	public void postConditions() {
		driver.quit();
	}
}

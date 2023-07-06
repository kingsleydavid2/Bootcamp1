package base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseHooks {
	
	 protected WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() throws IOException {
		
		//ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();

		//driver = new ChromeDriver(chromeOptions.);
		
		//WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);

		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		}
	
	@AfterMethod
	public void afterMethod() throws IOException { 
	
		driver.quit();
		
	}

}
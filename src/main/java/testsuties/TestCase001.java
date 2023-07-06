


package testsuties;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseHooks;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestCase001 extends BaseHooks {
	
	
	
@Test (dataProvider="datasendingmethod" ,dataProviderClass= testdata.TestDataProvider.class)
public void testcase001(String[] data) throws InterruptedException {


driver.findElement(By.id("username")).sendKeys(data[0]);
driver.findElement(By.id("password")).sendKeys(data[1]);
driver.findElement(By.id("Login")).click();
//Click on toggle menu button from the left corner -

}




}

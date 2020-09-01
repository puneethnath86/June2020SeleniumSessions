package TestNGSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest 
{
	static WebDriver driver;
	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void GoogleTitleTest() throws InterruptedException {
		String expectedTitle="Google";
		String actualTitle=driver.getTitle();
		Thread.sleep(2000);
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test
	public void googleURLTest() {
		String expectedURL="https://www.google.com/";
		String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}
	
	@AfterTest
	public void Tear_Down() {
		driver.quit();
	}
}

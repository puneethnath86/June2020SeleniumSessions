package SelJun2020Batch.SelJun2020Batch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleAutoSuggestion {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		BrowserUtils bu=new BrowserUtils(driver);
		driver.get("http://www.google.com");
		By googleSearchTextoc=By.name("q");
		driver.findElement(googleSearchTextoc).sendKeys("automation");
		Thread.sleep(2000);
		
		By allAutoSuggestionLoc=By.xpath("//ul[@class='erkvQe']/li//div[@class='sbl1']//span");
		bu.googleAutoSugestionClick(allAutoSuggestionLoc, "automation framework");
		
		
	}
	
	
}

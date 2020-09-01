package SelJun2020Batch.SelJun2020Batch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerConcept {
	
	static WebDriver driver;
	static String browser; 

	public static void main(String[] args) {
		
//		1. It will check if chrome driver.exe is available on the system local or now
//		2. If not available, it will check the browser version and then automatically download the respective exe file
//		This line means setup my chrome driver()
		
		browser="firefox";
		
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		case "ie":
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
			break;
		default:
			System.out.println("Please provide a valid browser name!!");
			break;
		}
		
		driver.get("http://www.google.com");
		System.out.println("Ttile of the page is --> "+driver.getTitle());
		driver.quit();
		
		
	}

}

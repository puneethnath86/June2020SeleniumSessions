package SelJun2020Batch.SelJun2020Batch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTesting 
{
	
	static WebDriver driver;
	 public static void main(String[] args) {
		String browser="chrome";
		
		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\punath\\Documents\\Eclipse Workspace\\NaveenJun\\JavaPrac\\SelJun2020Batch\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\\\punath\\\\Documents\\\\Eclipse Workspace\\\\NaveenJun\\\\JavaPrac\\\\SelJun2020Batch\\\\Drivers\\\\geckodriver.exe");
			driver=new FirefoxDriver();
			break;
			
		default:
			break;
		}
		
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}
}

package SelJun2020Batch.SelJun2020Batch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class WebDriverBasics {

	public static void main(String[] args) {
		String chromeDriverPath="C:\\Users\\punath\\Documents\\Eclipse Workspace\\DriverFile\\ChromeVersion83\\chromedriver_win32\\chromedriver.exe";
		String geckoDriverPath="C:\\Users\\punath\\Documents\\Eclipse Workspace\\NaveenJun\\JavaPrac\\SelJun2020Batch\\Drivers\\geckodriver.exe";
		
		
//		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		System.setProperty("webdriver.gecko.driver", geckoDriverPath);
//		WebDriver driver=new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		String broTitle=driver.getTitle();
		System.out.println(driver.getTitle());
		if(broTitle.equals("Google")) {
			System.out.println("Test is pass and title is same");
		}
		else {
			System.out.println("Title did not match hence test failed");
		}
		
		System.out.println(driver.getCurrentUrl());
		if(broTitle.contains("Goo")) {
			System.out.println("Test is pass and title contains goo");
		}
		else {
			System.out.println("Title did not match hence test failed");
		}
//		System.out.println(driver.getPageSource());
		driver.quit();
	}

}

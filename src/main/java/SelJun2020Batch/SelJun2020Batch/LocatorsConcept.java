package SelJun2020Batch.SelJun2020Batch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://app.hubspot.com/");
		Thread.sleep(9000);
		BrowserUtils bu=new BrowserUtils(driver);
		
		String unameXpath="//input[@id='username']";
		By unameLoc=By.xpath(unameXpath);
		String passXpath="//input[@id='password']";
		By passLoc=By.xpath(passXpath);
		String loginBtnXpath="//i18n-string[text()='Log in']";
		By loginBtnLoc=By.xpath(loginBtnXpath);
		String errMsgXpath="//div[@class='private-alert__inner']";
		By errMsgLoc=By.xpath(errMsgXpath);
		bu.doSendKeys(unameLoc, "test123@gmail.com");
		bu.doSendKeys(passLoc, "Test123");
		bu.doClick(loginBtnLoc);
		Thread.sleep(5000);
		if(bu.checkIsDisplayed(errMsgLoc)) {
			System.out.println("Test is pass");
		}
		else {
			System.out.println("Test is fail");
		}
	}

}

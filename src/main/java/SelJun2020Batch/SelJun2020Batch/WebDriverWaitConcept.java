package SelJun2020Batch.SelJun2020Batch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		BrowserUtils bu=new BrowserUtils(driver);
		driver.manage().window().maximize();
		driver.get("https://app.hubspot.com/");
		By uNameLoc=By.xpath("//input[@id='username']");
		By passLoc=By.xpath("//input[@id='password']");
		By logInLoc=By.xpath("//button[@id='loginBtn']");
		
		/*TITLECONTAINS
		 * waitForTitle method is used to wait for title to be displayed and would wait
		 * for the passed no of seconds(timeout), this would return a boolean value*/
		/*
		if(bu.waitForTitle(5, "Login")) {
			System.out.println("Title is present and wait is working fine");
		}
		else {
			System.out.println("Title is not present and wait is not working fine");
		}
		*/
		
		/**/
		bu.waitForElementsDisplayed(uNameLoc, 10).sendKeys("puneeth@gmail.com");
		
		
		
	}
	
	

}

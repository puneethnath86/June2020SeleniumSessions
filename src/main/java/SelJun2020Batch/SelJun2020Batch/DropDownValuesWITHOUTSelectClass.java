package SelJun2020Batch.SelJun2020Batch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownValuesWITHOUTSelectClass {

static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		BrowserUtils bu=new BrowserUtils(driver);
		
		By loc=By.xpath("//select[@id='Form_submitForm_NoOfEmployees']/option");
		bu.dropdownWithoutSelect(loc, "901 - 1,000");
	}	
}

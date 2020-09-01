package SelJun2020Batch.SelJun2020Batch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassConcept {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		BrowserUtils bu=new BrowserUtils(driver);
		By countryLoc=By.id("Form_submitForm_Country");
		By industryLoc=By.id("Form_submitForm_Industry");
		By empCountLoc=By.id("Form_submitForm_NoOfEmployees");
		
		bu.doSelectByTxt(countryLoc, "India");
		bu.doSelectByValue(industryLoc, "Aerospace");
		bu.doSelectByIndex(empCountLoc, 2);
		
		System.out.println(bu.getEle(empCountLoc).getText());
	}
	
	public static WebElement getEle(By loc) {
		return driver.findElement(loc);
	}
	
	

}

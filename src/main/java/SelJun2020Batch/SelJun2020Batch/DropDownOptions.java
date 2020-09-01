package SelJun2020Batch.SelJun2020Batch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownOptions {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		BrowserUtils bu=new BrowserUtils(driver);
		
		By countryLoc=By.id("Form_submitForm_Country");
		By industryLoc=By.id("Form_submitForm_Industry");
//		By empCountLoc=By.id("Form_submitForm_NoOfEmployees");
		
		System.out.println(bu.getSelectOptionsValue(countryLoc, "India"));
		
//		List<String> countryListVal=bu.getOptionsAllValues(countryLoc);
//		countryListVal.stream().forEach(e -> System.out.println(e));
		
		System.out.println(bu.getSelectOptionsValue(industryLoc, "Automotive"));
		List<String> industryListVal=bu.getOptionsAllValues(industryLoc);
		industryListVal.stream().forEach(e -> System.out.println(e));
	}
	/*
	Author : Puneeth Nath
	Date : 07/25/2020
	getSelectOptionsValue() method will take 2 input args, 
	1. Locator
	2. String (text) that we want to select in the dropdown
	The method would select the text values passed in the select dropdown mentioned in loc and return the text
	value of the selection made 
	static String getSelectOptionsValue(By loc, String text) {
		BrowserUtils bu=new BrowserUtils(driver);
		Select dropDown = initializeDropDown(loc);
		List<WebElement> countryOptions = dropDown.getOptions();
		System.out.println("Size of the Select dropdown is  --> "+countryOptions.size());
		bu.doSelectByTxt(loc, text);
		String txt=dropDown.getFirstSelectedOption().getText();
		return txt;
	}

		Author : Puneeth Nath
	Date : 07/26/2020
	getOptionsAllValues method is used to get the text of all values present in select dropdown, the method will take 
	locator as a parameter and would return the list of <String> consisting of values inside the select dropdown list 
	static List<String> getOptionsAllValues(By loc) {
		List<String> dropDownValues=new ArrayList<String>();
		Select ss = initializeDropDown(loc);
		List<WebElement> options = ss.getOptions();
		for(WebElement e:options) {
			String val=e.getText();
			dropDownValues.add(val);
		}
		return dropDownValues;
	}
	
	static Select initializeDropDown(By loc) {
		BrowserUtils bu=new BrowserUtils(driver);
		Select ss=new Select(bu.getEle(loc));
		return ss;
	}
*/
}

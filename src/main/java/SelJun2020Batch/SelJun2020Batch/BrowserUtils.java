package SelJun2020Batch.SelJun2020Batch;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils 
{
	public static WebDriver driver;
	
	BrowserUtils(WebDriver driver){
		this.driver=driver;
	}
	public static WebElement getElement(By locator) {
		WebElement we=driver.findElement(locator);
		return we;
	}
	public static By getLocator(String locValue) {
		By locator=By.xpath(locValue);
		return locator;
	}	
	public static void doSendKeys(By locator, String txt) {
		getElement(locator).sendKeys(txt);
	}
	public static void doClick(By loc) {
		getElement(loc).click();
	}
	public static boolean checkIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
//	---------S E L E C T     C L A S S       U T I L S----------------
//	------------------------------------------------------------------
	public void doSelectByTxt(By loc, String text) {
		Select s=new Select(getEle(loc));
		s.selectByVisibleText(text);
	}
	
	public void doSelectByIndex(By loc, int i) {
		Select s=new Select(getEle(loc));
		s.selectByIndex(i);
	}
	
	public void doSelectByValue(By loc, String text) {
		Select s=new Select(getEle(loc));
		s.selectByValue(text);
	}
	
	/*WebElement getEle(By loc) {
		return driver.findElement(loc);
	}
	*/
	/*Author : Puneeth Nath
	Date : 07/25/2020
	getSelectOptionsValue() method will take 2 input args, 
	1. Locator
	2. String (text) that we want to select in the dropdown
	The method would select the text values passed in the select dropdown mentioned in loc and return the text
	value of the selection made*/ 
	String getSelectOptionsValue(By loc, String text) {
//		BrowserUtils bu=new BrowserUtils(driver);
//		Select dropDown = initializeDropDown(loc);
		WebElement e=driver.findElement(loc);
		Select dropDown = new Select(e);
		List<WebElement> countryOptions = dropDown.getOptions();
		System.out.println("Size of the Select dropdown is  --> "+countryOptions.size());
		doSelectByTxt(loc, text);
		String txt=dropDown.getFirstSelectedOption().getText();
		return txt;
	}

	/*	Author : Puneeth Nath
	Date : 07/26/2020
	getOptionsAllValues method is used to get the text of all values present in select dropdown, the method will take 
	locator as a parameter and would return the list of <String> consisting of values inside the select dropdown list */
	List<String> getOptionsAllValues(By loc) {
		List<String> dropDownValues=new ArrayList<String>();
		Select ss = initializeDropDown(loc);
		List<WebElement> options = ss.getOptions();
		for(WebElement e:options) {
			String val=e.getText();
			dropDownValues.add(val);
		}
		return dropDownValues;
	}
	
	Select initializeDropDown(By loc) {
		Select ss=new Select(getEle(loc));
		return ss;
	}

	WebElement getEle(By loc) {
		return driver.findElement(loc);
	}
	
//	****************************WITHOUT USING SELECT CLASS********************
	void dropdownWithoutSelect(By loc, String txt) {
		List<WebElement> EmpNoDropdown=driver.findElements(loc);
		System.out.println("Size of the dropdown list is --> "+EmpNoDropdown.size());
		for(WebElement e:EmpNoDropdown) {
			System.out.println(e.getText());
			if(e.getText().equals(txt)) {
				e.click();
				break;
			}
		}	
	}
	static void googleAutoSugestionClick(By loc, String text) {
		List<WebElement> googleAllAutoSuggestion=driver.findElements(loc);
		for(WebElement we:googleAllAutoSuggestion) {
			String txt=we.getText();
			System.out.println(txt);
			if(txt.equals(text)) {
				we.click();
				break;
			}
		}
	}
	
//	*********************** W A I T   U T I L S******************************
	public boolean waitForTitle(int timeOut, String title) {
		WebDriverWait wait=new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.titleContains(title));
	}
	public WebElement waitForElementsDisplayed(By loc, int timeOut) {
		WebElement element=getEle(loc);
		WebDriverWait wait=new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.visibilityOf(element));
	}
}

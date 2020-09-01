package SelJun2020Batch.SelJun2020Batch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassPractice {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		BrowserUtils bu=new BrowserUtils(driver);
		By singleSelectListLoc=By.xpath("//select[@id='select-demo']");
		
		bu.getEle(singleSelectListLoc);
		bu.doSelectByTxt(singleSelectListLoc, "Tuesday");
		
		Select ss=new Select(bu.getEle(singleSelectListLoc));
		List<WebElement> options = ss.getAllSelectedOptions();
		for (WebElement we : options) {
			System.out.println(we.getText());
		}
	}
	
	
	
	

}

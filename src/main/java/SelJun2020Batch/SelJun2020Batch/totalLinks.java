package SelJun2020Batch.SelJun2020Batch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class totalLinks {

	public static WebDriver driver;
	public static void main(String[] args) 
	{
//		Links are consisted in <a> tab
//		In amazon.com, capture all the links and print text of the links
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://www.amazon.co.in");
		
		By amazonAllLinks = By.xpath("//a");
		
		
		List<WebElement> allLinks=driver.findElements(amazonAllLinks);
		System.out.println(allLinks.size());
//		To get name of all links
//		for(int i=0;i<allLinks.size();i++) {
//			WebElement ele=allLinks.get(i);
//			if(!ele.getText().isEmpty()) {
//				System.out.println(i+" --> "+ele.getText());
//				System.out.println(ele.getAttribute("href"));
//			}
//		}
		
//		USING FOR EACH LOOP
//		for(WebElement ele : allLinks) {
//			if(!ele.getText().isEmpty())
//			System.out.println(ele.getText());
//		}
		
////		using LAMBDA EXPRESSION
//		allLinks.stream().
	}

}

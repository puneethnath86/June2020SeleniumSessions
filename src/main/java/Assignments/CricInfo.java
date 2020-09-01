package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;	

public class CricInfo {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/19495/scorecard/1198241/england-vs-pakistan-1st-test-england-v-pakistan-2020");
		driver.manage().window().maximize();
			
		WebElement element=getEle("ball","Pope");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js. executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
//		System.out.println("Value of the requested column for player is : "+element.getText());
	}
	
	public static WebElement getEle(String dataReq, String name) {
		int index=0;
		switch (dataReq) {
		case "run":
			index=2;	break;
		case "ball":
			index=3;	break;
		case "maiden":
			index=4;	break;
		case "4s":
			index=5;	break;
		case "6s":
			index=6;	break;
		case "SR":
			index=7;	break;
		default:
			System.out.println("Plesae enter a valid choice in lower case");	break;
		}
		By loc=By.xpath("//h5[text()='England 1st Innings ']//ancestor::div[@class='Collapsible']//a[contains(text(),'"+name+"')]/..//following-sibling::td["+index+"]");
		WebElement ele=driver.findElement(loc);
		return ele;
	}
}

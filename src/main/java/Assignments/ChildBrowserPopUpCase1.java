package Assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildBrowserPopUpCase1 {

	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://popuptest.com/goodpopups.html");
		
		By popUp1=By.xpath("//a[contains(text(),'Good PopUp #1')]");
		By popUp2=By.xpath("//a[contains(text(),'Good PopUp #2')]");
		By popUp3=By.xpath("//a[contains(text(),'Good PopUp #3')]");
		By popUp4=By.xpath("//a[contains(text(),'Good PopUp #4')]");

		clickElement(popUp1);
		clickElement(popUp2);
		clickElement(popUp3);
		clickElement(popUp4);
		
		Set<String> browserIDs=driver.getWindowHandles();
		for(String s : browserIDs) {
			driver.switchTo().window(s);
			Thread.sleep(2000);
			System.out.println("ID is--> "+s);
			System.out.println("Title of the browser is--> "+driver.getTitle());
			System.out.println();
		}
		Thread.sleep(5000);
		driver.quit();
	}
	
	static void clickElement(By loc) {
		driver.findElement(loc).click();
	}

}

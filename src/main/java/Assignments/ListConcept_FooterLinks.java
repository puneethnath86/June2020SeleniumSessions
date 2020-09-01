package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListConcept_FooterLinks {
	public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://www.amazon.co.in");
		List<WebElement> footerLinks = driver.findElements(By.xpath("//div[@class='navLeftFooter nav-sprite-v1']//a"));
		System.out.println(footerLinks.size());
		footerLinks.stream().forEach(ele->System.out.println(ele.getText()));
		
	}

}

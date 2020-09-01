package SelJun2020Batch.SelJun2020Batch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class totalImagesAmazon {
	public static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://www.amazon.co.in");
		
		By amazonAllImages = By.xpath("//img");
		List<WebElement> allImages = driver.findElements(amazonAllImages);
		System.out.println(allImages.size());
		
		allImages.stream().forEach(ele->System.out.println(ele.getAttribute("src")));
	}

}

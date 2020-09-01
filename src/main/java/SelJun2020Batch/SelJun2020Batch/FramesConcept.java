package SelJun2020Batch.SelJun2020Batch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesConcept {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		BrowserUtils bu=new BrowserUtils(driver);
		driver.get("http://www.Londonfreelance.org/courses/frames/index.html");
		WebElement framePath=driver.findElement(By.xpath("//frame[@name='main']"));
		driver.switchTo().frame(framePath);
		String titleTxt=driver.findElement(By.xpath("//h2")).getText();
		System.out.println(titleTxt);
	}
}

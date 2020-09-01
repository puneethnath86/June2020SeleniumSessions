package SelJun2020Batch.SelJun2020Batch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowserConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--headless");
		WebDriver driver=new ChromeDriver(co);
		driver.get("http://www.google.com");
		System.out.println("Title is-->"+driver.getTitle());
		driver.quit();
	}

}

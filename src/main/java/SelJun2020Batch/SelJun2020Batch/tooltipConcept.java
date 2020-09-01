package SelJun2020Batch.SelJun2020Batch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tooltipConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/tooltip/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	
		WebElement ageText=driver.findElement(By.xpath("//input[@id='age']"));
		WebElement ageTooltip=driver.findElement(By.className("ui-tooltip-content"));
		
		Actions act=new Actions(driver);
		act.moveToElement(ageText).perform();
		System.out.println(ageTooltip.getText());

	}

}

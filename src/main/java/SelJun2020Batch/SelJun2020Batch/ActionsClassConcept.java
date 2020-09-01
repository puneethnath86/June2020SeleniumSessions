package SelJun2020Batch.SelJun2020Batch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClassConcept {

	static WebDriver driver;
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
	By contentMenuLoc=By.xpath("//a[@class='menulink']");
	driver.findElement(contentMenuLoc).click();

	}

}

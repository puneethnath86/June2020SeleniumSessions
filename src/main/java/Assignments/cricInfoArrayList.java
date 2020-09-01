package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cricInfoArrayList {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/19495/scorecard/1198241/england-vs-pakistan-1st-test-england-v-pakistan-2020");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		List<WebElement> playerValues=getPlayerValues("Woakes");
//		playerValues.stream().forEach(ele->System.out.println(ele.getText()));
		for(int i=0;i<playerValues.size();i++) {
			WebElement we=playerValues.get(i);
			System.out.println(we.getText());
		}
	}
	
	static List<WebElement> getPlayerValues(String playerName){
		By loc=By.xpath("//h5[text()='England 1st Innings ']//ancestor::div[@class='Collapsible']//a[contains(text(),'"+playerName+"')]//ancestor::tr//td");
		List<WebElement> weList=driver.findElements(loc);
		weList.remove(1);
		return weList;
	}

}

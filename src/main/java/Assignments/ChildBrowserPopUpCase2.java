package Assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildBrowserPopUpCase2 {

	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://popuptest.com/goodpopups.html");
		
		By popUpLoc1=By.xpath("//a[contains(text(),'Good PopUp #1')]");
		By popUpLoc2=By.xpath("//a[contains(text(),'Good PopUp #2')]");
		By popUpLoc3=By.xpath("//a[contains(text(),'Good PopUp #3')]");
		By popUpLoc4=By.xpath("//a[contains(text(),'Good PopUp #4')]");

//		manageWindowPopUp(popUp1Loc);
		manageWindowPopUp2(popUpLoc1);
		manageWindowPopUp2(popUpLoc2);
		manageWindowPopUp2(popUpLoc3);
		manageWindowPopUp2(popUpLoc4);
		

		System.out.println("Title of parent is -->"+driver.getTitle());
		Thread.sleep(4000);
		driver.close();
		
	}
	
	static void manageWindowPopUp(By loc) throws InterruptedException {
		driver.findElement(loc).click();
		Set<String> windowID=driver.getWindowHandles();
		Iterator<String> itr=windowID.iterator();
//		To get the next windowID(Child window ID)
		String parent=itr.next();
		String child=itr.next();
		driver.switchTo().window(child);
		System.out.println("ID of the browser is--> "+parent);
		System.out.println("Title of the browser is--> "+driver.getTitle());
		driver.close();
		Thread.sleep(1000);
		driver.switchTo().window(parent);
	}
	
	static void manageWindowPopUp2(By loc) throws InterruptedException {
		driver.findElement(loc).click();
		Set<String> windowID=driver.getWindowHandles();
		List<String> windowIDList=new ArrayList<String>(windowID);
		String parentWindow=windowIDList.get(0);
		
		for(int i=1;i<windowIDList.size();i++) {
			String childWindowID=windowIDList.get(i);
			driver.switchTo().window(childWindowID);
			System.out.println("Title of the child window is--> "+driver.getTitle());
			Thread.sleep(2000);
			driver.close();
			driver.switchTo().window(parentWindow);
		}
	}

}

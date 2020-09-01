package app.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FreshWorksTest extends BaseTest
{
	@Test
	public void freshWorksTitleTest() {
		driver.get("https://www.freshworks.com/");
		String expectedTitle="A fresh approach to customer engagement";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test
	public void freshWorksURLTest() {
		String expectedURL="https://www.freshworks.com/";
		String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}
}

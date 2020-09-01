package app.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest 
{	
	@Test
	public void googleTitleTest() {
		driver.get("https://www.google.com/");
		String expectedTitle="Google";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test
	public void googleURLTest() {
		String expectedURL="https://www.google.com/";
		String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}
}

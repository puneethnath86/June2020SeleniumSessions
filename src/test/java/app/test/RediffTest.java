package app.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RediffTest extends BaseTest
{
	@Test
	public void rediffTitleTest() {
		driver.get("https://www.rediff.com/");
		String expectedTitle="Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test
	public void rediffURLTest() {
		String expectedURL="https://www.rediff.com/";
		String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}

}

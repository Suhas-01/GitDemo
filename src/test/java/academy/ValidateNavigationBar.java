package academy;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.baseClass;

public class ValidateNavigationBar extends baseClass{
	
	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}

	
	@Test 
	public void basePageNavigation() throws IOException {	
		
		LandingPage l = new LandingPage(driver);
		
		// compare the text on browser and the expected 
		// and if not as expected fail the test

		Assert.assertEquals(l.getTitleText().getText(), "FEATURED COURSE.S");
		Assert.assertTrue(l.getContactsIcon().isDisplayed());
		
	}	
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
			
}

package academy; 

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.baseClass;

public class homePage extends baseClass{
	
	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
	}

	 
	@Test (dataProvider = "getData")
	public void checkbroswerInitialization(String Username, String Password, String text) throws IOException {	
		
		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		l.getLogin().click();
		LoginPage lp = new LoginPage(driver);
		lp.getemail().sendKeys(Username);
		lp.getpassword().sendKeys(Password);
		lp.clickLogin().click();
		System.out.println(text);
		//l.getTitleText().getText();
		
	}
	
	// now you need to call landindPage class methods.
	// use inheritance or create object.
	
	
	@DataProvider
		public Object[][] getData() {
			Object data[][] = new Object [2][3];
			data[0][0]= "non-restricted@qw.com";
			data[0][1]= "123456";
			data[0][2]= "non- restricted user";
			data[1][0]= "restricted@qw.com";
			data[1][1]= "456789";
			data[1][2]= "restricted user";
			return data;
			}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}


	
			
}

package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By signIn = By.cssSelector("a[href='https://rahulshettyacademy.com/sign_in/']");
	By titleText = By.cssSelector("#content > div > div > h2");
	By ContactsIcon = By.cssSelector("a[href*='ttyaca']");		// rong css. there are multiple.
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getLogin() {
		return driver.findElement(signIn);
	}

	
	  public WebElement getTitleText() { return driver.findElement(titleText); }
	  
	 	public WebElement getContactsIcon() {
		return driver.findElement(ContactsIcon);
	}
}













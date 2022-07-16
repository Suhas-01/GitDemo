import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_04 {
	
	public static void main(String[] args) {
		
	// we will just revise basic selenium things in this class
	
	// Mouse Click & Keyboard Event: Action Class in Selenium Webdriver
	
	System.out.println("Hello World");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SBENAKE\\OneDrive - Capgemini\\Desktop\\Installations\\Chrome_exe\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
    String baseUrl = "http://demo.guru99.com/test/upload/";
    driver.get(baseUrl);           


}}

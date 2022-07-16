import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_03 {
	
	public static void main(String[] args) {
	
	// we will just revise basic selenium things in this class
	
	// How to Upload & Download a File using Selenium Webdriver
	
	System.out.println("Hello World");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SBENAKE\\OneDrive - Capgemini\\Desktop\\Installations\\Chrome_exe\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
    String baseUrl = "http://demo.guru99.com/test/upload/";
    driver.get(baseUrl);           

    WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
    uploadElement.sendKeys("C:\\Users\\SBENAKE\\OneDrive - Capgemini\\Desktop\\LF\\Career_part1\\automation\\Jira.txt");

    driver.findElement(By.id("terms")).click();
    driver.findElement(By.name("send")).click();
  
    // this program is successful.
    
    // download the file - program below.
    
    
}}

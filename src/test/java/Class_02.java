import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SBENAKE\\OneDrive - Capgemini\\Desktop\\Installations\\Chrome_exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        driver.get(baseUrl);


	}

}

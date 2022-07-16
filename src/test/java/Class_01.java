import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Class_01 {

	@Test
	void method_01() {

		System.out.println("Hello World");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SBENAKE\\OneDrive - Capgemini\\Desktop\\Installations\\Chrome_exe\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String baseUrl = "https://www.codeassess.com/";
		driver.get(baseUrl);
		
		driver.manage().window().maximize();
		
		

	}
}
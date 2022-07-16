package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass {
	
	public WebDriver driver = null;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\SBENAKE\\eclipse-workspace1\\ART_01\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			// execute in that driver
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\SBENAKE\\OneDrive - Capgemini\\Desktop\\Installations\\Chrome_exe\\chromedriver.exe");
			driver = new ChromeDriver();

		}
		else if(browserName=="FireFox") {
			// execute in that driver
		}
		else if(browserName=="InternetExplorer") {
			// execute in that driver
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public String getScreenshotPath(String testCaseName, WebDriver driver) throws IOException {
		/*
		 * (TakesScreenshot) ts = (TakesScreenshot) driver; File source =
		 * ts.getScreenshotAs(OutputType.FILE); String destinationFile =
		 * System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		 * FileUtils.copyFile(source, new File(destinationFile));
		 */
	    TakesScreenshot ts =((TakesScreenshot)driver);
	    File SourceFile=ts.getScreenshotAs(OutputType.FILE);
	    String DestFile=System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
	    FileUtils.copyFile(SourceFile, new File(DestFile));
	    return DestFile;
	}
		
	
	

}

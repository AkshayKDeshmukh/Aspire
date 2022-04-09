package resources;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {

	public WebDriver driver;
	public Properties prop;
	public String URL;

	public WebDriver intializeDriver() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\akshay.deshmukh\\eclipse-workspace\\Aspire\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);

		String browserName = prop.getProperty("Browser");
		 URL=prop.getProperty("url");
		System.out.println(browserName);
		System.out.println(URL);
		
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();


		} else if (browserName.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", "F:\\firefox\\geko.exe");
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "F:\\IE\\IE.exe");
			driver = new InternetExplorerDriver();
		}

		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return driver;

	}
	
	public void getScreenshot(String methodName, WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File Source=ts.getScreenshotAs(OutputType.FILE);
		String destinationFile= System.getProperty("user.dir")+"\\reports\\"+methodName+".png";
		FileUtils.copyFile(Source, new File(destinationFile));
	}
}

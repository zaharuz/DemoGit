package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Base {

	protected WebDriver driver;
	String browserType = "chrome";

	@BeforeClass
	public void setUpDriver() {

		if (browserType.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserType.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Webdrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserType.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "C:\\Webdrivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else {
			System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@AfterClass
	public void closeAll() {
		// driver.quit();
	}
}

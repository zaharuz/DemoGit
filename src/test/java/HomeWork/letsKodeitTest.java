package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class letsKodeitTest {

	protected WebDriver driver;
	
	@BeforeClass
	public void setUpDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Webdrivers\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
	@AfterClass
	public void closeAll() {
		driver.quit();
	}
	@Test
	public void pagePractice() throws InterruptedException {
		
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.findElement(By.cssSelector("input#bmwcheck")).click();
		Thread.sleep(2000);
	}
}

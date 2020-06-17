package Class24;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
import utilities.Base;

public class Synchronization extends Base{

	public void implicitWait() {
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}
	public void explicitWait() {
		WebDriverWait wait15 = new WebDriverWait(driver, 15);
		wait15.until(ExpectedConditions.elementToBeClickable(By.xpath("insert xpath here")));
		driver.findElement(By.xpath("insert xpath here")).click();
		
		WebDriverWait wait30 = new WebDriverWait(driver, 30);
		wait30.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("use css selector here")));
		
	}
	
	public void fluentWait() {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		.withTimeout(Duration.ofSeconds(15))
		.pollingEvery(Duration.ofSeconds(5))
		.ignoring(NoSuchElementException.class);
		
		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.id("foo"));
		     }
		});
		String text = driver.findElement(By.id("idblahblah")).getText();
		Assert.assertEquals(text, "Hello World!");
	}
}

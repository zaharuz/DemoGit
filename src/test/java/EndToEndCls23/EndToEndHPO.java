package EndToEndCls23;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utilities.Base;
import utilities.BaseProp;

public class EndToEndHPO extends BaseProp{
	
	@Test
	public void buyingDress() {
	driver.get(prop.getProperty("url"));
	
	//typing in "summer dress" in the top search Box
	driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("summer dress");
	//clicking search button
	driver.findElement(By.xpath("//button[@name='submit_search']")).click();
	//clicking on the 1st option
	driver.findElement(By.xpath("//div[@class='left-block']/div[@class='product-image-container']")).click();
	//choosing a size
	driver.findElement(By.cssSelector("select#group_1")).click();
	//click on add to cart
	//driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
	
	
	}
}

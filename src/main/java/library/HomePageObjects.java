package library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageObjects {
	
	WebDriver driver;
	
	/*
	 * 
	 * Objects
	 * 
	 */
	
	By searchBox = By.xpath("//input[@id='search_query_top']");
	By searchBtn = By.xpath("//button[@name='submit_search']");
	By searchResultOpt1 = By.xpath("//div[@id='best-sellers_block_right']//li[1]/a");

	/*
	 * 
	 * Constructor
	 * 
	 */
	public HomePageObjects(WebDriver driver) {
		this.driver = driver;
	}

	/*
	 * 
	 * Locating search box and typing in search item
	 * 
	 */
	public void insertSearhStr(String searchKey) {
		driver.findElement(searchBox).sendKeys(searchKey);
	}

	/*
	 * 
	 * Clicking on the search icon button
	 * 
	 */
	public void clickSrchBtn() {
		driver.findElement(searchBtn).click();
	}

	/*
	 * 
	 * Clicking on the first option from search results
	 * 
	 */
	public void chooseFirstOption() {
		driver.findElement(searchResultOpt1).click();
	}
}

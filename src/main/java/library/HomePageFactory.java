package library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageFactory {
	WebDriver driver;
	/*
	 * 
	 * Objects
	 * 
	 */
	
	@FindBy(xpath = "//input[@id='search_query_top']")
	WebElement searchBox;
	@FindBy(xpath = "//button[@name='submit_search']")
	WebElement searchBtn;
	@FindBy(xpath = "//div[@id='best-sellers_block_right']//li[1]/a")
	WebElement searchResultOpt1;

	/*
	 * 
	 * Constructor
	 * 
	 */
	public HomePageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * 
	 * Locating search box and typing in search item
	 * 
	 */
	public void insertSearhStr(String searchKey) {
		searchBox.sendKeys(searchKey);
	}

	/*
	 * 
	 * Clicking on the search icon button
	 * 
	 */
	public void clickSrchBtn() {
		searchBtn.click();
	}

	/*
	 * 
	 * Clicking on the first option from search results
	 * 
	 */
	public void chooseFirstOption() {
		searchResultOpt1.click();
	}
}

package online_shopping;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import library.HomePageFactory;
import library.HomePageObjects;
import utilities.Base;
import utilities.BaseProp;

public class SearchTest extends BaseProp{
	
	
	//@Test
	public void testSearch() throws IOException {
				
		//opening the url
		driver.get(prop.getProperty("url"));
		
		HomePageObjects homePageObjs = new HomePageObjects(driver);
		
		//inputting the word: blouse into search box
		homePageObjs.insertSearhStr("shirt");
		//clicking search button
		homePageObjs.clickSrchBtn();
		//clicking on the first option
		homePageObjs.chooseFirstOption();
	}
	
	@Test
	public void homePageFctry() throws IOException {
		
		//opening the url
		driver.get(prop.getProperty("url"));
		
		
		HomePageFactory homePageFctry = new HomePageFactory(driver);
		//inputting the word: blouse into search box
		homePageFctry.insertSearhStr("34576");
		//clicking search button
		homePageFctry.clickSrchBtn();
		//clicking on the first option
		homePageFctry.chooseFirstOption();
	}
//@Test
	public void testProperties() throws IOException {
	Properties prop = new Properties();
	FileInputStream fis = new FileInputStream("src\\main\\java\\properties\\data.properties");
	prop.load(fis);
	System.out.println(prop.getProperty("url"));
	}
}

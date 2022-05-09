package day24.webpagescripts;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import day24.webpages.GoogleSearchPage;
import utilities.SeleniumUtility;

public class GoogleSearchScript {

	@Test
	public void testCase() {
		SeleniumUtility util=new SeleniumUtility();
		WebDriver driver=util.setUp("chrome", "https://www.google.com");
		GoogleSearchPage getGoogleSearchPage=new GoogleSearchPage(driver);
		getGoogleSearchPage.searchText("I am shailesh");
		
	}
}

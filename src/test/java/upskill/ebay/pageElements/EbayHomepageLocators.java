package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayHomepageLocators {

		//Selenium page factory
		// Search text box
	@FindBy(xpath="//input[@placeholder= 'Search for anything']")
	public WebElement txtbxSearch;
		
	// Search Button
	@FindBy(xpath="//input[@value='Search']")
	public WebElement btnSearch;
}

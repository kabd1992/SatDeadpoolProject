package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayCartLocators {
	
@ FindBy(xpath="//select[@aria-label='please select a Size Type']")
public WebElement ddSizeType;

@ FindBy(xpath="//select[@selectboxid='1001']")
public WebElement ddMenSize;

@ FindBy(xpath="//select[@aria-label='Please select a Shade']")
public WebElement ddShade;

@ FindBy(xpath="//input[@id='qtyTextBox']")
public WebElement txtbxQty;

@ FindBy(xpath="//*[text()='Add to cart']")
public WebElement btnAddCart;
}

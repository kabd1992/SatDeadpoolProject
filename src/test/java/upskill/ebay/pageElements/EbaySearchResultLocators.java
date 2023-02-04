package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class EbaySearchResultLocators {

//validate shoes items
@FindBy(xpath= " //span[contains(text(),'shoes')]")
public WebElement txtShoes;

@FindBy(xpath= "//span[contains(text(),'shirts')]")
public WebElement txtShirts;

@FindBy(xpath= "//span[contains(text(),'pants')]")
public WebElement txtPants;

@FindBy(xpath= "//input[@aria-level='Adidas']")
public WebElement cbxBrandAdidas;

@FindBy(xpath= "//input[@aria-level='Nike']")
public WebElement cbxBrandNike;

@FindBy(xpath= "//input[@aria-level='UnBranded']")
public WebElement cbxBrandUnbranded;

//Shirt link
@FindBy(xpath="//span[contains(text(),'Big & Tall Cotton Tee. Sizes 4 XLT to 8XLT. With')]")
public WebElement linkShirtItems;
}

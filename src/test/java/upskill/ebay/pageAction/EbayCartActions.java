package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import upskill.ebay.pageElements.EbayCartLocators;
import upskill.utilities.SetupDrivers;

public class EbayCartActions {
	EbayCartLocators EbayCartLocatorsObj;
	
	public EbayCartActions(){
		EbayCartLocatorsObj = new EbayCartLocators();
		PageFactory.initElements(SetupDrivers.driver,EbayCartLocatorsObj);
	}
	
	public void switchNewWindow(){
		for(String winhandle : SetupDrivers.driver.getWindowHandles()){
		SetupDrivers.driver.switchTo().window(winhandle);}

		}
	public void selectSizeTypeDD() throws Exception{
		Thread.sleep(2000);
		Select dropDown = new Select(EbayCartLocatorsObj.ddSizeType);
		dropDown.selectByVisibleText("Big & Tall");				
		Thread.sleep(2000);
		}
	public void selectMenSizeDD() throws Exception{
		Thread.sleep(2000);
		Select dropDown = new Select(EbayCartLocatorsObj.ddMenSize);
		dropDown.selectByVisibleText("8XLT");				
		Thread.sleep(2000);
		}
	
	public void selectShadeDD() throws Exception{
		Thread.sleep(2000);
		Select dropDown = new Select(EbayCartLocatorsObj.ddShade);
		dropDown.selectByVisibleText("Black");				
		Thread.sleep(2000);
			
		}
	public void enterQuantity() throws Exception{
		Thread.sleep(2000);
		EbayCartLocatorsObj.txtbxQty.clear();
		EbayCartLocatorsObj.txtbxQty.sendKeys("12");	
		}
	public void addToCart()throws Exception{
		Thread.sleep(2000);
			EbayCartLocatorsObj.btnAddCart.click();
			Thread.sleep(2000);
		}
	}
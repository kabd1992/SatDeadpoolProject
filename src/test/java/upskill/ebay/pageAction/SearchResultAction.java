package upskill.ebay.pageAction;


import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import upskill.ebay.pageElements.EbaySearchResultLocators;
import upskill.utilities.SetupDrivers;

public class SearchResultAction {

	EbaySearchResultLocators EbaySearchresultLocatorsObj;
	
	public SearchResultAction(){
		EbaySearchresultLocatorsObj = new EbaySearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver, EbaySearchresultLocatorsObj);
		
	}
	public void verifyShoesItems() throws InterruptedException{
	
		//option 1
				Assert.assertEquals("shoes", EbaySearchresultLocatorsObj.txtShoes.getText());
		
		//option 2
		Assert.assertTrue(EbaySearchresultLocatorsObj.txtShoes.isDisplayed());
	}
	
	public void filterBrand(String brand){
		if(brand.equals("Adidas")){
			EbaySearchresultLocatorsObj.cbxBrandAdidas.click();
			
		} else if(brand.equals("Nike")){
			EbaySearchresultLocatorsObj.cbxBrandNike.click();
			
		}else if (brand.equals("Unbranded")){
			EbaySearchresultLocatorsObj.cbxBrandUnbranded.click();
		}else {
			System.out.println("Brand not found, please implement");
		}
	}
	
	public void verifyBrandItems(String brand){
		if(brand.equals("Adidas")){
			EbaySearchresultLocatorsObj.txtShirts.isDisplayed();
			
		} else if(brand.equals("Nike")){
			EbaySearchresultLocatorsObj.txtShoes.isDisplayed();
			
		}else if (brand.equals("Unbranded")){
			EbaySearchresultLocatorsObj.txtPants.isDisplayed();
		}else {
			System.out.println("Brand not found, please implement");
		}
	}
	public void selectShirt() throws Exception{
		Thread.sleep(2000);
		EbaySearchresultLocatorsObj.linkShirtItems.click();
		Thread.sleep(2000);
	}
}
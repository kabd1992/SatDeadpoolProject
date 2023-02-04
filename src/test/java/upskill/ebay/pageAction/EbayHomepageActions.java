package upskill.ebay.pageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import upskill.ebay.pageElements.EbayHomepageLocators;
import upskill.utilities.SetupDrivers;

public class EbayHomepageActions {
	EbayHomepageLocators EbayHomepagelocatorobj;

		public EbayHomepageActions(){
			EbayHomepagelocatorobj= new EbayHomepageLocators();
			PageFactory.initElements(SetupDrivers.driver,EbayHomepagelocatorobj );
			
		}
		public void loadHomepage(){	
			//selenium wait: 1.Implicit wait(Global), 2. Explicit wait(Conditional)
			//3. Fluent wait(intermittent)
			
			//Implicit wait wait for 10 sec before it failing
			SetupDrivers.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			WebDriverWait wait = new WebDriverWait(SetupDrivers.driver,20);
			//Explicit Wait -wait certain time until it clickable
			wait.until(ExpectedConditions.elementToBeClickable(EbayHomepagelocatorobj.txtbxSearch));
			
			//Fluent wait-it will keep trying and search for the elements
			
}
		public void searchShoes(){
			EbayHomepagelocatorobj.txtbxSearch.sendKeys("shoes");
			EbayHomepagelocatorobj.btnSearch.click();
		}
		public void searchItems(String items){
			EbayHomepagelocatorobj.txtbxSearch.sendKeys(items);
			EbayHomepagelocatorobj.btnSearch.click();
		}
		
		

}

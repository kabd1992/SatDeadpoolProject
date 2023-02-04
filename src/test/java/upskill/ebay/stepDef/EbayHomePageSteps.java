package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbayHomepageActions;

public class EbayHomePageSteps {
	EbayHomepageActions EbayHomepageActionsobj = new EbayHomepageActions();
	@Given("^Open Ebay Homepage")
	public void open_Ebay_Homepage() throws Throwable {
		//EbayHomepageActionsobj.loadHomepage();

	}
	@When("^Search for shoes$")
	public void search_for_shoes() throws Throwable {
		EbayHomepageActionsobj.searchShoes();    
}


@Given("^Search for \"([^\"]*)\"$")
public void search_for(String items) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	EbayHomepageActionsobj.searchItems(items);
}
@Given("^Search for Big Tall Cotton Tee$")
public void search_for_Big_Tall_Cotton_Tee() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	EbayHomepageActionsobj.searchItems("Big Tall Cotton Tee");
}


}

	
	


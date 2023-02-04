package upskill.ebay.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.SearchResultAction;

public class EbaySearchresultSteps {
	
	SearchResultAction SearchResultActionObj = new SearchResultAction();
	
		@Then("^Item list should have only shoes related products$")
		public void item_list_should_have_only_shoes_related_products() throws Throwable {
		Thread.sleep(5000);
			SearchResultActionObj.verifyShoesItems();
			Thread.sleep(3000);
		}
		@When("^Filter by \"([^\"]*)\"$")
		public void filter_by(String brand) throws Throwable {
			SearchResultActionObj.filterBrand(brand);
	    // Write code here that turns the phrase above into concrete actions
	    
	}
		@Then("^Item list should have products of \"([^\"]*)\"$")
		public void item_list_should_have_products_of(String brand) throws Throwable {
			SearchResultActionObj.verifyBrandItems(brand);	
		    // Write code here that turns the phrase above into concrete actions
		     
		}
		@When("^Select the first shirt on item list$")
		public void select_the_first_shirt_on_item_list() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			SearchResultActionObj.selectShirt();
		}
}



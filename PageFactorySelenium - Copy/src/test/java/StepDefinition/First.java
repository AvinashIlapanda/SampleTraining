package StepDefinition;

import org.testng.Assert;

import Browser.browser;
import Locators.page1Objects;
import Pages.page1;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class First {
	@Given("User opens the Browser")
	public void user_opens_the_browser() throws Exception {
	   browser.openBrowser();
	}
	@And("User navigates to the {string} Webpage")
	public void user_navigates_to_the_webpage(String string) throws Exception {
	   browser.navigateToUrl(string);
	}

	@Then("User verifies the title of the Webpage")
	public void user_verifies_the_title_of_the_webpage() {
	    Assert.assertEquals(page1.Title(),"OrangeHRM");
	}
	


	@And("User closes the Browser")
	public void user_closes_the_browser() {
	    browser.closeBrowser();
	}


}

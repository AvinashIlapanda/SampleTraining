package StepDefinition;

import Pages.page1;
import Pages.page2;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class second {
	@When("user enter {string} the username")
	public void user_enter_the_username(String string) throws Exception {
	    page1.userNameEnter("Admin");
	}

	@And("User enters the 'admin123'the password")
	public void user_enters_the_admin123_the_password(String string) throws Exception {
		page1.passwordEnter("admin123");
	}

	@And("User click the login button")
	public void user_click_the_login_button() throws Exception {
	    page1.clickLogin();
	}

	@Then("User verifies the profile account")
	public void user_verifies_the_profile_account() {
	   page2.username();
	}

	


}

package stepDefinations;

import org.openqa.selenium.By;

import Allpages.LoginPage;
import BaseP.baseC;
import GenericMethodP.GenericMethodC;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination {

	@Given("user should be on parabank homepage")
	public void user_should_be_on_parabank_homepage() {
		baseC.browser(baseC.obj.getBrowser(), baseC.obj.getUrl());
	
	}

	@When("user enter the valid username {string}")
	public void user_enter_the_valid_username(String username) {
		LoginPage.username(username);
	}

	@When("user enter the valid password {string}")
	public void user_enter_the_valid_password(String password) {
		LoginPage.password(password);
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		LoginPage.loginSubmit();
	}

	@Then("user should login successfully")
	public void user_should_login_successfully(){
		LoginPage.verify();
	}

	// for multiple data entry----------------------->
	@When("^user enter the valid username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enter_the_valid_username_and_password(String username, String password) {
		LoginPage.username(username);
		LoginPage.password(password);
	}

}

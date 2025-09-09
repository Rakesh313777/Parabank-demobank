package stepDefinations;

import Allpages.RegisterPage;
import BaseP.baseC;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDefination {

	@Given("user should be on parabank Registration page")
	public void user_should_be_on_parabank_registration_page() {

		baseC.browser(baseC.obj.getBrowser(), baseC.obj.getUrl());
		RegisterPage.registerLink();
	}

	@When("user enter the valid firstName {string}")
	public void user_enter_the_valid_first_name(String fname) {
		RegisterPage.firstName(fname);
	}

	@And("user enter the valid lastName {string}")
	public void user_enter_the_valid_last_name(String lname) {
		RegisterPage.lastName(lname);
	}

	@And("user enter the valid address {string}")
	public void user_enter_the_valid_address(String address) {
		RegisterPage.address(address);
	}

	@And("user enter the valid city {string}")
	public void user_enter_the_valid_city(String city) {
		RegisterPage.city(city);
	}

	@And("user enter the valid state {string}")
	public void user_enter_the_valid_state(String state) {
		RegisterPage.state(state);
	}

	@And("user enter the valid zipCode {string}")
	public void user_enter_the_valid_zip_code(String zipcode) {
		RegisterPage.zipcode(zipcode);
	}

	@And("user enter the valid phoneNumber {string}")
	public void user_enter_the_valid_phone_number(String phonenumber) {
		RegisterPage.phoneNUmber(phonenumber);
	}

	@And("user enter the valid ssNumber {string}")
	public void user_enter_the_valid_ss_number(String ssnumber) {
		RegisterPage.ssNumber(ssnumber);
	}

	@And("user enter the valid username1 {string}")
	public void user_enter_the_valid_username1(String username) {
		RegisterPage.username(username);
	}

	@And("user enter the valid password1 {string}")
	public void user_enter_the_valid_password1(String password) {
		RegisterPage.password(password);
	}

	@And("user enter the valid confirmPassword {string}")
	public void user_enter_the_valid_confirm_password(String confirmpassword) {
		RegisterPage.confirmPassword(confirmpassword);
	}

	@And("user clicks on registerButton")
	public void user_clicks_on_register_button() {
		RegisterPage.registerButton();
	}
	
	@Then("Success message should be displayed")
    public void Success_message_should_be_displayed() {
		RegisterPage.successMessage();
	}
    
	// multiple entry---------------------->
	@When("^user enter the valid firstName \"([^\"]*)\" and lastName \"([^\"]*)\" and address \"([^\"]*)\" and city \"([^\"]*)\" and state \"([^\"]*)\" and zipCode \"([^\"]*)\" and phoneNumber \"([^\"]*)\" and ssNumber \"([^\"]*)\" and username \"([^\"]*)\" and password \"([^\"]*)\" and confirmPassword \"([^\"]*)\"$")
	public void user_enter_the_valid_first_name_and_last_name_and_address_and_city_and_state_and_zip_code_and_phone_number_and_ss_number_and_username_and_password_and_confirm_password(
			String fname, String lname, String address, String city, String state, String zipcode, String phonenumber,
			String ssnmuber, String username, String password, String confirmpassword) {

		RegisterPage.firstName(fname);
		RegisterPage.lastName(lname);
		RegisterPage.address(address);
		RegisterPage.city(city);
		RegisterPage.state(state);
		RegisterPage.zipcode(zipcode);
		RegisterPage.phoneNUmber(phonenumber);
		RegisterPage.ssNumber(phonenumber);
		RegisterPage.username(username);
		RegisterPage.password(password);
		RegisterPage.confirmPassword(confirmpassword);

	}

}

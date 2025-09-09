package stepDefinations;

import Allpages.FundTransferPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FundTransferStepDefination {

	@When("user clicks on transfer funds from the menu")
	public void user_clicks_on_transfer_funds_from_the_menu() {
		FundTransferPage.transferFunds();
	}

	@Then("user should be redirected to the fund transfer page")
	public void user_should_be_redirected_to_the_fund_transfer_page() {
		FundTransferPage.verifyFundsPage();
	}

	@When("user select the following accounts to fund transfer {int} and {int}")
	public void user_select_the_following_accounts_to_fund_transfer_and(Integer fromAccountValue,
			Integer toAccoutnValue) {
		FundTransferPage.selectFromAccount(fromAccountValue);
		FundTransferPage.selectToAccount(toAccoutnValue);
	}

	@And("user enter the amount {string}")
	public void user_enter_the_amount(String value) {
		FundTransferPage.accountInputAmount(value);
	}

	@And("clicks on the transfer button")
	public void clicks_on_the_transfer_button() {
		FundTransferPage.clicksOnTransfer();
	}

	@Then("user verify the transfer amount as a confirmation message is displayed")
	public void user_verify_the_transfer_amount_as_a_confirmation_message_is_displayed() {
		FundTransferPage.verifyContext();
	}



}

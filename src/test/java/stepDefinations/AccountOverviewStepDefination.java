package stepDefinations;

import Allpages.AccountOverviewPage;
import Allpages.FundTransferPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountOverviewStepDefination {

	@When("user clicks on account overview")
	public void user_clicks_on_account_overview() {
		AccountOverviewPage.clicksOnOverView();
	}

	@And("user clicks on receiver account number")
	public void user_clicks_on_receiver_account_number() {
		AccountOverviewPage.clicksOnReceiverAccount();
	}

	@Then("user should see the transfered listed in the account details")
	public void user_should_see_the_transfer_listed_in_the_account_details() {
		AccountOverviewPage.verifyTransactionDetails();
	}
}

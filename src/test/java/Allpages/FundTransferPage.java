package Allpages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import BaseP.baseC;
import GenericMethodP.GenericMethodC;

public class FundTransferPage {

	static String accountNo;

	public static String getAccountNo() {
		return accountNo;
	}

	public static void setAccountNo(String accountNo) {
		FundTransferPage.accountNo = accountNo;
	}

	public static By transferLinkXpath = By.xpath("//a[contains(@href,'transfer.htm')]");
	public static By verifyTranferFundPageXpath = By.xpath("//div[@id='showForm']/h1");
	public static By accountinputId = By.xpath("//input[@id='amount']");
	public static By selectFromAccountXpath = By.xpath("//select[@id='fromAccountId']");
	public static By selectToAccountXpath = By.xpath("//select[@id='toAccountId']");
	public static By TransferXpath = By.xpath("//input[@type='submit']");
	public static By verifyContextXpath = By.xpath("//div[@id='showResult']");

	public static By overViewXpath = By.xpath("//a[contains(@href,'overview.htm')]");

	public static By verifyTransactionDetailsXpath = By.xpath("//div[@id='accountActivity']");

	public static void transferFunds() {
		GenericMethodC.explicit_Wait_clickable(transferLinkXpath);
	}

	public static void verifyFundsPage() {
		GenericMethodC.explicit_wait_verifyContainsText(verifyTranferFundPageXpath, "Transfer Funds");
	}

	public static void accountInputAmount(String value) {
		GenericMethodC.explicit_wait_visiblityOfElement(accountinputId, value);
	}

	public static void selectFromAccount(int fromAccountNumber) {
		GenericMethodC.selectUsingByGetOptions(selectFromAccountXpath, fromAccountNumber);

	}

	public static void selectToAccount(int toAccountNumber) {

		List<WebElement> eles = baseC.obj.getDriver().findElements(selectToAccountXpath);
		for (int i = 0; i < eles.size(); i++) {
			if (i == toAccountNumber) {
				eles.get(i).click();
				FundTransferPage.setAccountNo(eles.get(i).getText());
			}
		}

	}

	public static void clicksOnTransfer() {
		GenericMethodC.explicit_Wait_clickable(TransferXpath);
	}

	public static void verifyContext() {		
		GenericMethodC.explicit_wait_verifyContainsText(verifyContextXpath, "Transfer Complete!");
	}

	public static void clicksOnOverView() {
		GenericMethodC.explicit_Wait_clickable(overViewXpath);
	}

	public static void clicksOnReceiverAccount() {
		System.out.println(FundTransferPage.getAccountNo());

		WebDriverWait wait = new WebDriverWait(baseC.obj.getDriver(), Duration.ofSeconds(10));
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//a[contains(@href,'activity.htm?id=" + FundTransferPage.getAccountNo() + "')]")));
		ele.click();

	}

	public static void verifyTransactionDetails() {
		GenericMethodC.explicit_wait_verifyContainsText(verifyTransactionDetailsXpath, "Account Activity");
	}

}

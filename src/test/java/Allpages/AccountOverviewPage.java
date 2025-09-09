package Allpages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseP.baseC;
import GenericMethodP.GenericMethodC;

public class AccountOverviewPage {

	
	
	public static By overViewXpath = By.xpath("//a[contains(@href,'overview.htm')]");

	public static By verifyTransactionDetailsXpath = By.xpath("//div[@id='accountActivity']");

	
	
	public static void clicksOnOverView() {
		GenericMethodC.explicit_Wait_clickable(overViewXpath);
	}

	public static void clicksOnReceiverAccount() {
		System.out.println(FundTransferPage.getAccountNo());

		WebDriverWait wait = new WebDriverWait(baseC.obj.getDriver(), Duration.ofSeconds(10));
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//a[contains(@href,'activity.htm?')]")));
		ele.click();

	}

	public static void verifyTransactionDetails() {
		GenericMethodC.explicit_wait_verifyContainsText(verifyTransactionDetailsXpath, "Account Activity");
	}

}

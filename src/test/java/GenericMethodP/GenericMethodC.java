package GenericMethodP;

import java.io.File;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Allpages.FundTransferPage;
import BaseP.baseC;

public class GenericMethodC extends baseC {

	// TakesScreenshot------------Interface------------------------->

	public static String captureScreenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) baseC.obj.getDriver();
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\chirumalla\\Documents\\narestitxlfiles\\captures\\" + "Screenshot"
				+ System.currentTimeMillis() + ".png");
		FileUtils.copyFile(src, des);
		return des.getAbsolutePath();

	}

	// javaScriptExecutor click
	public static void javaScriptExecutor_click(By elementXpath) {
		WebElement ele = baseC.obj.getDriver().findElement(elementXpath);
		JavascriptExecutor js = (JavascriptExecutor) baseC.obj.getDriver();
		js.executeScript("arguments[0].click();", ele);
	}

	// wait------------------------------------------------------->

	// explicit wait

	public static WebDriverWait wait = new WebDriverWait(baseC.obj.getDriver(), Duration.ofSeconds(10));

	public static void explicit_wait_visiblityOfElement(By elementXpath, String text) {
		WebElement web = baseC.obj.getDriver().findElement(elementXpath);
		wait.until(ExpectedConditions.visibilityOf(web));
		web.clear();
		web.sendKeys(text);
	}

	public static void explicit_wait_visibilityOfElementLocated(By elementXpath) {
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(elementXpath));
		ele.click();
	}

	public static void explicit_Wait_clickable(By elementXpath) {
//		WebElement web = baseC.obj.getDriver().findElement(elementXpath);
		WebElement web = wait.until(ExpectedConditions.elementToBeClickable(elementXpath));
		web.click();
	}

	public static void explicit_wait_verifyContainsText(By elementXpath, String value) {

		WebElement web = baseC.obj.getDriver().findElement(elementXpath);
		wait.until(ExpectedConditions.textToBePresentInElementLocated(elementXpath, value));
		Assert.assertTrue(web.getText().toLowerCase().contains(value.toLowerCase()));
		new Actions(baseC.obj.getDriver()).sendKeys(Keys.ESCAPE).build().perform();

	}

	// Select------------------------->

	// by value
	public static void selectUsingByValue(By elementXpath, String value) {

		WebElement web = baseC.obj.getDriver().findElement(elementXpath);
		Select sc = new Select(web);
		sc.selectByValue(value);
	}

	// By index-----------
	public static void selectUsingByIndex(By elementXpath, int value) {

		WebElement web = baseC.obj.getDriver().findElement(elementXpath);
		Select sc = new Select(web);
		sc.selectByIndex(value);
	}

	public static void selectUsingByGetOptions(By elementXpath, int value) {

		WebElement web = baseC.obj.getDriver().findElement(elementXpath);
		Select sc = new Select(web);
		List<WebElement> eles = sc.getOptions();
		for (int i = 0; i < eles.size(); i++) {
			if (i == value) {
				eles.get(i).click();
			}
		}
	}

}
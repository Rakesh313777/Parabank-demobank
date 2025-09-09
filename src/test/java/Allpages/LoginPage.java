package Allpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import BaseP.baseC;
import GenericMethodP.GenericMethodC;
import net.bytebuddy.description.type.TypeDescription.Generic;

public class LoginPage extends baseC {

	public static By usernameXpath = By.xpath("//input[@name='username']");
	public static By passwordXpath = By.xpath("//input[@name='password']");
	public static By submitXpath = By.xpath("//input[@class='button']");
	public static By verifyXpath = By.xpath("//h2[text()='Account Services']");

	public static void username(String username) {
		GenericMethodC.explicit_wait_visiblityOfElement(usernameXpath, username);
	}

	public static void password(String password) {
		GenericMethodC.explicit_wait_visiblityOfElement(passwordXpath, password);

	}

	public static void loginSubmit() {
		GenericMethodC.explicit_Wait_clickable(submitXpath);
	}

	public static void verify() {
		Assert.assertEquals(baseC.obj.getDriver().findElement(verifyXpath).getText(), "Account Services");
		Assert.assertTrue(baseC.obj.getDriver().findElement(By.xpath("//a[text()='Log Out']")).isDisplayed());

	}

}

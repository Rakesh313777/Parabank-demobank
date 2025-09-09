package Allpages;

import org.openqa.selenium.By;
import org.testng.Assert;

import BaseP.baseC;
import GenericMethodP.GenericMethodC;

public class RegisterPage{

	public static By registerLinkXpath = By.linkText("Register"); // .xpath("//a[text()='Register']");

	public static By firstNameXpath = By.xpath("//input[@id='customer.firstName']");
	public static By lastNameXpath = By.xpath("//input[@id='customer.lastName']");
	public static By addressXpath = By.xpath("//input[@id='customer.address.street']");
	public static By cityXpath = By.xpath("//input[@id='customer.address.city']");
	public static By stateXpath = By.xpath("//input[@id='customer.address.state']");
	public static By zipcodeXpath = By.xpath("//input[@id='customer.address.zipCode']");
	public static By phoneNumberXpath = By.xpath("//input[@id='customer.phoneNumber']");
	public static By ssnXpath = By.xpath("//input[@id='customer.ssn']");
	public static By usernameXpath = By.xpath("//input[@id='customer.username']");
	public static By passwordXpath = By.xpath("//input[@id='customer.password']");
	public static By confirmPasswordXpath = By.xpath("//input[@id='repeatedPassword']");
	public static By registerButtonXpath = By.xpath("//input[@class='button' and @value ='Register']");
	public static By successMesageXpath = By.xpath("//h1/following-sibling::p");

	public static void registerLink() {
		GenericMethodC.explicit_Wait_clickable(registerLinkXpath);
//		driver.findElement(registerLinkXpath).click();
	}

	public static void firstName(String fname) {
		GenericMethodC.explicit_wait_visiblityOfElement(firstNameXpath, fname);
//		driver.findElement(firstNameXpath).sendKeys(fname);
	}

	public static void lastName(String lname) {
		GenericMethodC.explicit_wait_visiblityOfElement(lastNameXpath, lname);
//		driver.findElement(lastNameXpath).sendKeys(lname);
	}

	public static void address(String address) {
		GenericMethodC.explicit_wait_visiblityOfElement(addressXpath, address);
//		driver.findElement(addressXpath).sendKeys(address);
	}

	public static void city(String city) {
		GenericMethodC.explicit_wait_visiblityOfElement(cityXpath, city);
//		driver.findElement(cityXpath).sendKeys(city);
	}

	public static void state(String state) {
		GenericMethodC.explicit_wait_visiblityOfElement(stateXpath, state);
//		driver.findElement(stateXpath).sendKeys(state);
	}

	public static void zipcode(String zipcode) {
		GenericMethodC.explicit_wait_visiblityOfElement(zipcodeXpath, zipcode);
//		driver.findElement(zipcodeXpath).sendKeys(zipcode);
	}

	public static void phoneNUmber(String phonenumber) {
		GenericMethodC.explicit_wait_visiblityOfElement(phoneNumberXpath, phonenumber);
//		driver.findElement(phoneNumberXpath).sendKeys(phonenumber);
	}

	public static void ssNumber(String ssnumber) {
		GenericMethodC.explicit_wait_visiblityOfElement(ssnXpath, ssnumber);
//		driver.findElement(ssnXpath).sendKeys(ssnumber);
	}

	public static void username(String username) {
		GenericMethodC.explicit_wait_visiblityOfElement(usernameXpath, username);
//		driver.findElement(usernameXpath).sendKeys(username);
	}

	public static void password(String password) {
		GenericMethodC.explicit_wait_visiblityOfElement(passwordXpath, password);
//		driver.findElement(passwordXpath).sendKeys(password);
	}

	public static void confirmPassword(String confirmpassword) {
		GenericMethodC.explicit_wait_visiblityOfElement(confirmPasswordXpath, confirmpassword);
//		driver.findElement(confirmPasswordXpath).sendKeys(confirmpassword);
	}

	public static void registerButton() {
		GenericMethodC.explicit_Wait_clickable(registerButtonXpath);

	}

	static String message1 = "Your account was created successfully. You are now logged in.";

	public static void successMessage() {
		Assert.assertEquals(baseC.obj.getDriver().findElement(successMesageXpath).getText(), message1);
	}

}

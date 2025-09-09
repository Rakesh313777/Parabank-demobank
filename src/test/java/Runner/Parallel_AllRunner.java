package Runner;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Allpages.LoginPage;
import BaseP.baseC;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class Parallel_AllRunner extends AbstractTestNGCucumberTests{

	@BeforeClass
	@Parameters("browsertype")
	public static void beforeClass(String browsertype) {
		baseC.obj.setBrowser(browsertype);
		baseC.browser(baseC.obj.getBrowser(), baseC.obj.getUrl());
	}
	
	@Test
	@Parameters({"username","password"})
	public static void beforeMethod(String username,String password) {
		LoginPage.username(username);
		LoginPage.password(password);
	}
	
//	@AfterClass
//	public static void afterClass() {
//		baseC.close_browser();
//	}
	
	
}

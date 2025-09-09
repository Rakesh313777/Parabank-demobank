package BaseP;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseC {

	private WebDriver driver;
	private String browser = "chrome";
	private String url = "https://parabank.parasoft.com";

	public static baseC obj = new baseC();

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public String getBrowser() {
		return browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public static void browser(String browser, String url) {

		switch (browser) {
		case ("chrome"): {
			WebDriverManager.chromedriver().setup();
			obj.setDriver(new ChromeDriver());
			obj.getDriver().get(url);
			break;
		}
		case ("edge"): {
			WebDriverManager.edgedriver().setup();
			obj.setDriver(new EdgeDriver());
			obj.getDriver().get(url);
			break;
		}
		case ("firefox"): {
			WebDriverManager.firefoxdriver().setup();
			obj.setDriver(new FirefoxDriver());
			obj.getDriver().get(url);
			break;
		}
		default: {
			WebDriverManager.chromedriver().setup();
			obj.setDriver(new ChromeDriver());
			obj.getDriver().get(url);
			break;
		}

		}
		obj.getDriver().manage().window().maximize();

	}

	public static void close_browser() {
		obj.getDriver().close();
	}

}

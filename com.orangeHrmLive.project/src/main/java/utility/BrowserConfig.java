package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserConfig {

	private WebDriver driver = null;

//	Browser related configuration (For eg, chrome \ firefox driver)
//	public static void browserLaunch(String browser) {
//		if (browser.equals("chrome")) {
//			WebDriverManager.chromedriver().setup();
//			GlobalVariables.driver = new ChromeDriver();
//		} else {
//			WebDriverManager.firefoxdriver().setup();
//			GlobalVariables.driver = new FirefoxDriver();
//		}
//	}

	public WebDriver browserLaunch(String browserName) {

		switch (browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			driver = new ChromeDriver(options);
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions fireFoxOptions =new FirefoxOptions();
			fireFoxOptions.addArguments("start-maximized");
			driver = new FirefoxDriver(fireFoxOptions);
			break;
		default:
			System.out.println("Browser value missing!");
		}

		return driver;

	}

}
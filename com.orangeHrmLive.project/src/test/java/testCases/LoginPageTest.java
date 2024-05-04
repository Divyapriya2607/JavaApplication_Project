package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pageActions.LoginPageActions;
import utility.BaseClass;
import utility.BrowserConfig;
import utility.GlobalVariables;

public class LoginPageTest {

//	Test cases
	
	private WebDriver driver = null;
	BrowserConfig browserConfig = new BrowserConfig();
	LoginPageActions loginPage;
	BaseClass bc;

	@BeforeSuite
	public void beforeSuite() {
		GlobalVariables.driver = browserConfig.browserLaunch(GlobalVariables.browser);
		this.driver = GlobalVariables.driver;
		loginPage = new LoginPageActions(driver);
		bc = new BaseClass(driver);
	}

	@Test(priority = 1)
	public void launchURL() {
		driver.get(GlobalVariables.URL);
		bc.implicitWait(10);
	}

	@Test(priority = 2)
	public void pageLogin() throws InterruptedException {
		loginPage.enter_Username(GlobalVariables.username);
		loginPage.enter_Password(GlobalVariables.password);
		loginPage.click_Login();
		Thread.sleep(6000);
	}

}
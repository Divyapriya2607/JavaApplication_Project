package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pageActions.AdminPageActions;
import pageActions.LoginPageActions;
import utility.BaseClass;
import utility.BrowserConfig;
import utility.GlobalVariables;

public class AdminPageTest {
	private WebDriver driver = null;
	BrowserConfig browserConfig = new BrowserConfig();
	LoginPageActions loginPage;
	AdminPageActions adminPage;
	BaseClass bc;

	@BeforeSuite
	public void beforeSuite() {
		GlobalVariables.driver = browserConfig.browserLaunch(GlobalVariables.browser);
		this.driver = GlobalVariables.driver;
		loginPage = new LoginPageActions(driver);
		adminPage = new AdminPageActions(driver);
		bc = new BaseClass(driver);
	}

	@Test
	public void launchURL() {
		driver.get(GlobalVariables.URL);
		bc.implicitWait(10);
	}

	@Test(dependsOnMethods = "launchURL")
	public void pageLogin() throws InterruptedException {
		loginPage.enter_Username(GlobalVariables.username);
		loginPage.enter_Password(GlobalVariables.password);
		loginPage.click_Login();
		Thread.sleep(6000);
	}

	@Test(dependsOnMethods = "pageLogin", enabled=false)
	public void pageAdmin() throws InterruptedException {
		adminPage.click_Admin();
		adminPage.click_Add();
		Thread.sleep(2000);
		adminPage.select_UserRole(); 
		adminPage.select_Status();
			 
		adminPage.enter_EmployeeName("HRM Employee");
		adminPage.enter_UserName("Username123");
		adminPage.enter_Password("P@ssword123");
		adminPage.enter_ConfirmPassword("P@ssword123");
	}
	@Test(dependsOnMethods = "pageLogin", enabled=false)
	public void searchUser() throws InterruptedException {
		adminPage.click_Admin();
		adminPage.enter_UserName("Username123");
		adminPage.enter_EmployeeName("HRM Employee");
		adminPage.select_UserRole(); 
		adminPage.select_Status();
		adminPage.click_Search();
		Thread.sleep(2000);
		
		
	}
	@Test(dependsOnMethods = "pageLogin", enabled=false)
	public void editUser() throws InterruptedException {
		adminPage.click_Admin();
		Thread.sleep(2000);
		adminPage.click_Edit();
		/*
		 * adminPage.enter_UserName("Username123");
		 * adminPage.enter_EmployeeName("HRM Employee"); adminPage.select_UserRole();
		 * adminPage.select_Status(); adminPage.click_ChangePassword();
		 */
	}
	@Test(dependsOnMethods="pageLogin")
	public void editGeneralInformation() throws InterruptedException {
		adminPage.click_Admin();
		Thread.sleep(2000);
		adminPage.click_Organisation();
		adminPage.click_GeneralInformation();
		adminPage.click_EditGeneralInformation();
	}
}

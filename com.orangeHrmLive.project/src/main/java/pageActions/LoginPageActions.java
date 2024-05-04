package pageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageObject.LoginPage;
import utility.BaseClass;

public class LoginPageActions {

	LoginPage loginPage;
	BaseClass bc;

	public LoginPageActions(WebDriver driver) {
		PageFactory.initElements(driver, this);
		bc = new BaseClass(driver);
		loginPage = new LoginPage(driver);
	}

	public void enter_Username(String input) {
		bc.textBox(loginPage.textBox_Username, input);
	}

	public void enter_Password(String input) {
		bc.textBox(loginPage.textBox_Password, input);
	}

	public void click_Login() {
		bc.click(loginPage.button_Login);
	}

}
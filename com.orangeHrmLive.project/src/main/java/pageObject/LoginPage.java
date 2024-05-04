package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

//	Web page related locators

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//form//input[@name='username']")
	public WebElement textBox_Username;

	@FindBy(xpath = "//form//input[@name='password']")
	public WebElement textBox_Password;

	@FindBy(xpath = "//form//button[@type='submit']")
	public WebElement button_Login;

}
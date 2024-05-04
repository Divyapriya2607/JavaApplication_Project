package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {

	public UserPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//label[text()='User Role']//following::div[4])[1]")
	public WebElement textBox_UserRole;

	@FindBy(xpath = "(//div[@class='oxd-select-wrapper']//following::div[@role='listbox']//div//span)[1]")
	public WebElement dropdown_UserRole;

	@FindBy(xpath = "(//label[text()='Status']//following::div[4])[1]")
	public WebElement textBox_Status;

	@FindBy(xpath = "(//div[@class='oxd-select-wrapper']//following::div[@role='listbox']//div//span)[1]")
	public WebElement dropdown_Status;

	@FindBy(xpath = "(//label[text()='Employee Name']//following::input)[1]")
	public WebElement textBox_EmployeeName;

	@FindBy(xpath = "(//label[text()='Username']//following::input)[1]")
	public WebElement textBox_UserName;
	
	@FindBy(xpath = "(//div[contains(@class,'oxd-input-group')]//input)[3]")
	public WebElement textBox_Password;

	@FindBy(xpath = "(//div[contains(@class,'oxd-input-group')]//input)[4]")
	public WebElement textBox_ConfirmPassword;
	
	@FindBy(xpath="(//form[@class='oxd-form']/child::div[2]//button[2])[1]")
	public WebElement button_Search;
	
	//@FindBy(xpath="(//div[@class='oxd-table']//div[@class='oxd-table-cell']/child::div//button[2])[2]/i")
	@FindBy(xpath="//*[@id='app']/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div/div[2]/div/div/div[1]/div[2]/div/div/button[2]")
	public WebElement icon_Edit;
	
	@FindBy(xpath="(//label[text()='Change Password ?']//following::input)[1]")
	public WebElement checkBox_ChangePassword;
}

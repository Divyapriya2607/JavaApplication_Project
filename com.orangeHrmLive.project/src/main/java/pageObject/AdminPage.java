package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {

	public AdminPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//ul[@class='oxd-main-menu']//li//a)[1]")
	public WebElement link_Admin;
	
	@FindBy(xpath="(//ul[@class='oxd-main-menu']//li//a//span)[1]")
	public WebElement text_Admin;
	
	@FindBy(xpath="(//div[@class='orangehrm-header-container']//button)[1]")
	public WebElement button_Add;
	
}

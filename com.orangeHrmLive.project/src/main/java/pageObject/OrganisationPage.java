package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationPage {

	public OrganisationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='oxd-topbar-body']//li[3]/span[text()='Organization ']")
	public WebElement element_Organisation;
	
	@FindBy(xpath="(//div[@class='oxd-topbar-body']//li[3]//ul//li[1])[1]")
	public WebElement dropdown_GeneralInformation;
	
	@FindBy(xpath="//label[text()='Edit']/span")
	public WebElement toggle_edit;
	
}

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
	
	@FindBy(xpath="(//form//label[text()='Organization Name']//following::input)[1]")
	public WebElement textBox_OrganisationName;
	
	@FindBy(xpath="(//form//label[text()='Number of Employees']//following::input)[1]")
	public WebElement textBox_NumberOfEmployees;
	
	@FindBy(xpath="(//form//label[text()='Registration Number']//following::input)[1]")
	public WebElement textBox_RegistrationNumber;
	
	@FindBy(xpath="(//form//label[text()='Tax ID']//following::input)[1]")
	public WebElement textBox_TaxID;
	
	@FindBy(xpath="(//form//label[text()='Phone']//following::input)[1]")
	public WebElement textBox_Phone;
	
	@FindBy(xpath="(//form//label[text()='Fax']//following::input)[1]")
	public WebElement textBox_Fax;
	
	@FindBy(xpath="(//form//label[text()='Email']//following::input)[1]")
	public WebElement textBox_Email;
	
	@FindBy(xpath="(//form//label[text()='Address Street 1']//following::input)[1]")
	public WebElement textBox_AddressStreet1;
	
	@FindBy(xpath="(//form//label[text()='Address Street 2']//following::input)[1]")
	public WebElement textBox_AddressStreet2;
	
	@FindBy(xpath="(//form//label[text()='City']//following::input)[1]")
	public WebElement textBox_City;
	
	@FindBy(xpath="(//form//label[text()='State/Province']//following::input)[1]")
	public WebElement textBox_StateProvince;
	
	@FindBy(xpath="(//form//label[text()='Zip/Postal Code']//following::input)[1]")
	public WebElement textBox_ZipPostalCode;
	
	@FindBy(xpath="(//form//label[text()='Notes']//following::textarea)[1]")
	public WebElement textBox_Notes;
	
	
	
	
}

package pageObjects;

import actions.ActionClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	WebDriver driver;

	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='q']")
	public static WebElement searchTextBox;

	@FindBy(xpath = "//div[@class='_1sFryS _2alaMB']//button")
	public static WebElement searchButton;

	@FindBy(xpath = "(//select[@class='Gn+jFg'])[1]")
	public static WebElement selectMinDropDown;

	@FindBy(xpath = "(//select[@class='Gn+jFg'])[2]")
	public static WebElement selectMaxDropDown;
	
	@FindBy(xpath="//div[@class='Cj5b5T']//input")
	public static WebElement searchBrand;
	
	@FindBy(xpath="(//div[@class='ewzVkT _3DvUAf']//input)[1]")
	public static WebElement enableBrandCheckBox;

	public void searchBox(String input) {
		//new ActionClass(driver).click(searchTextBox);
		new ActionClass(driver).textBox(searchTextBox, input);

	}

	public void clickSearchButton() {
		new ActionClass(driver).click(searchButton);
	}

	public void selectMiniumDropdown(int input) {
		new ActionClass(driver).dropDown(selectMinDropDown, input);
	}

	public void selectMaximumDropdown(int input) {
		new ActionClass(driver).dropDown(selectMaxDropDown, input);
	}
	public void enterBrand(String input) {
		new ActionClass(driver).textBox(searchBrand, input);
	}
	public void enableBrandCheckBox() {
		new ActionClass(driver).mouseHoverClick(enableBrandCheckBox);
		new ActionClass(driver).click(enableBrandCheckBox);
	}

}

package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageObjects.SearchPage;

public class Login_TC1 {
	public WebDriver driver;

	public Login_TC1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void search() throws InterruptedException {
		SearchPage search = new SearchPage(driver);
		search.searchBox("Mobiles");
		//search.clickSearchButton();
		Thread.sleep(5000);
		search.selectMiniumDropdown(1);
		search.selectMaximumDropdown(3);
		Thread.sleep(2000);
		search.enterBrand("SAMSUNG");
		Thread.sleep(4000);
		search.enableBrandCheckBox();
	}

}
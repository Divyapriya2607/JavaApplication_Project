package pageActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageObject.AdminPage;
import pageObject.LoginPage;
import pageObject.OrganisationPage;
import pageObject.UserPage;
import utility.BaseClass;

public class AdminPageActions {

	LoginPage loginPage;
	BaseClass bc;
	AdminPage adminPage;
	UserPage userPage;
	OrganisationPage organisationPage;

	public AdminPageActions(WebDriver driver) {
		PageFactory.initElements(driver, this);
		bc = new BaseClass(driver);
		loginPage = new LoginPage(driver);
		adminPage = new AdminPage(driver);
		userPage = new UserPage(driver);
		organisationPage = new OrganisationPage(driver);
	}

	public void click_Admin() {
		bc.click(adminPage.link_Admin);
	}

	public void click_Add() {
		bc.click(adminPage.button_Add);
	}

	public void select_UserRole() {
		bc.click(userPage.textBox_UserRole);
		bc.click(userPage.dropdown_UserRole);

	}

	public void select_Status() {
		bc.click(userPage.textBox_Status);
		bc.click(userPage.dropdown_Status);

	}
	public void click_Organisation() {
		bc.click(organisationPage.element_Organisation);
	}
	public void click_GeneralInformation() {
		bc.click(organisationPage.dropdown_GeneralInformation);
	}
	public void click_EditGeneralInformation() {
		bc.click(organisationPage.toggle_edit);
	}

	public void enter_EmployeeName(String input) {
		bc.textBox(userPage.textBox_EmployeeName, input);
	}

	public void enter_UserName(String input) {
		bc.textBox(userPage.textBox_UserName, input);
	}

	public void enter_Password(String input) {
		bc.textBox(userPage.textBox_Password, input);
	}

	public void enter_ConfirmPassword(String input) {
		bc.textBox(userPage.textBox_ConfirmPassword, input);
	}

	public void click_Search() {
		bc.click(userPage.button_Search);
	}

	public void click_Edit() {
		bc.scrollBy();
		//bc.mouseHoverAction(userPage.icon_Edit);
		bc.click(userPage.icon_Edit);
	}

	public void click_ChangePassword() {
		bc.click(userPage.checkBox_ChangePassword);
	}
	public void enter_OrganisationName(String input) {
		bc.textBox(organisationPage.textBox_OrganisationName,input);
	}
	public void enter_NumberOfEmployees(String input) {
		bc.textBox(organisationPage.textBox_NumberOfEmployees, input);
	}
	public void enter_RegistrationNumber(String input)
	{
		bc.textBox(organisationPage.textBox_RegistrationNumber, input);
	}
	public void enter_TaxID(String input)
	{
		bc.textBox(organisationPage.textBox_TaxID, input);
	}
	public void enter_Phone(String input) {
		bc.textBox(organisationPage.textBox_Phone, input);
	}
	public void enter_Fax(String input) {
		bc.textBox(organisationPage.textBox_Fax, input);
	}
	public void enter_Email(String input) {
		bc.textBox(organisationPage.textBox_Email, input);
	}
	public void enter_AddressStreet1(String input)
	{
		bc.textBox(organisationPage.textBox_AddressStreet1, input);
	}
	public void enter_AddressStreet2(String input)
	{
		bc.textBox(organisationPage.textBox_AddressStreet2, input);
	}
	public void enter_City(String input) {
		bc.textBox(organisationPage.textBox_City, input);
	}
	public void enter_StateProvince(String input) {
		bc.textBox(organisationPage.textBox_StateProvince, input);
	}
	public void enter_ZipPostalCode(String input) {
		bc.textBox(organisationPage.textBox_ZipPostalCode, input);
	}
}

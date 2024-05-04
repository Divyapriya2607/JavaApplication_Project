package actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ActionClass{
	public WebDriver driver;
	public ActionClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void dropDown(WebElement element, int input) {
		Select select=new Select(element);
		select.selectByIndex(input);
		
	}
	public void textBox(WebElement element, String input)
	{
		element.sendKeys(input,Keys.ENTER);
	}
	public void click(WebElement element) {
		element.click();
	}
	public void mouseHoverClick(WebElement element) {
		Actions actions=new Actions(driver);
		actions.moveToElement(element).build().perform();
	}
}

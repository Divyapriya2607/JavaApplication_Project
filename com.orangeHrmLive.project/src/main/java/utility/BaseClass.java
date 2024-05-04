package utility;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass extends GlobalVariables {

//	Selenium related actions

	public BaseClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void dropDown(WebElement element, String input) {
		Select select = new Select(element);
		select.selectByVisibleText(input);

	}

	public void textBox(WebElement element, String input) {
		element.sendKeys(input);
	}

	public void click(WebElement element) {
		element.click();
	}

	public void implicitWait(long timeInSec) {
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeInSec));
	}
	public void mouseHoverAction(WebElement element) {
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
		
	}
	public void webDriverWait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public void scrollIntoView(WebElement element)
	{
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	public void scrollBy()
	{
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)");
	}
	public void javaScript_Click(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}

}
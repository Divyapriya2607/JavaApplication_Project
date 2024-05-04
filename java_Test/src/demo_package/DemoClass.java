package demo_package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import demo_package.DemoClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DemoClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91975\\Documents\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("javatpoint tutorials");
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.CANCEL);
		driver.findElement(By.name("btnk")).click();
		Actions actions=new Actions(driver);
		
		
	}
}
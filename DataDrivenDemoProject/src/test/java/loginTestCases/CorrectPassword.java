package loginTestCases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.time.Duration;

public class CorrectPassword {
	@Test
	@Parameters({"username","password"})
	public void loginWithCorrectPassword(String uName,String pWord) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91975\\Documents\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement userName = driver.findElement(By.xpath("//form//input[@name='username']"));
		userName.sendKeys("Admin1");

		WebElement passWord = driver.findElement(By.xpath("//form//input[@name='password']"));
		passWord.sendKeys("admin123");
		
		WebElement loginButton = driver.findElement(By.xpath("//form//button[@type='submit']"));
		loginButton.click();
		driver.quit();

	}

}

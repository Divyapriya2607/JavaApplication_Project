
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import testCases.Login_TC1;
import utilities.CommonUtility;

public class mainClass extends CommonUtility {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\91975\\Documents\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		Login_TC1 login = new Login_TC1(driver);
		login.search();
	}

}

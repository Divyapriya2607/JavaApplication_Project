package loginTestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Login {
	String[][] data = null;
	WebDriver driver;

	@DataProvider(name = "loginData")
	public String[][] loginDataProvider() throws BiffException, IOException {
		data = getCellData();
		return data;
	}

	public String[][] getCellData() throws BiffException, IOException {
		FileInputStream excel = new FileInputStream("C:\\Users\\91975\\Documents\\TestData.xls");
		Workbook wbook = Workbook.getWorkbook(excel);
		Sheet sheet = wbook.getSheet(0);
		int rowCount = sheet.getRows();
		int columnCount = sheet.getColumns();
		String[][] testData = new String[rowCount - 1][columnCount];
		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j < columnCount; j++) {
				testData[i - 1][j] = sheet.getCell(j, i).getContents();

			}
		}
		return testData;
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91975\\Documents\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

	@Test(dataProvider = "loginData")
	public void loginWithBothCorrect(String uName, String pWord) {

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebElement userName = driver.findElement(By.xpath("//form//input[@name='username']"));
		userName.sendKeys(uName);

		WebElement passWord = driver.findElement(By.xpath("//form//input[@name='password']"));
		passWord.sendKeys(pWord);

		WebElement loginButton = driver.findElement(By.xpath("//form//button[@type='submit']"));
		loginButton.click();
	}
}

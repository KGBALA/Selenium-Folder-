package POM.DESIGN;

import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;

public class LoginTest {

	WebDriver driver;

	
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	}

	@AfterTest
	public void closeUp() {
		driver.quit();
	}

	@Test
	public void login() {
		HomePage loginPage = new HomePage(driver);
		loginPage.fName.sendKeys("Admin");
		loginPage.lName.sendKeys("Admin123");
		loginPage.lButton.click();

	}

	@Test
	public void getAttribute() {
		HomePage loginPage = new HomePage(driver);
		loginPage.fName.sendKeys("Kamoljon");
		loginPage.lName.sendKeys("Krasavchik");
		String str = loginPage.fAttribute.getAttribute("value");
		System.out.println(str);
		String str1 = loginPage.lAttribute.getAttribute("value");
		System.out.println(str1);

	}
	@Test
	public void SecondPage() {
		HomePage loginPage = new HomePage(driver);
		loginPage.fName.sendKeys("Admin");
		loginPage.lName.sendKeys("Admin123");
		loginPage.lButton.click();
		
}
}

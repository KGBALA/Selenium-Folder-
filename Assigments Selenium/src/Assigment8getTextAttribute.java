import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assigment8getTextAttribute {
	
	ChromeDriver driver;

	@BeforeMethod
	public void navigate1() {
		System.setProperty("webdriver.chrome.driver", "../chromedriver/");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Test
	public void navigate() {
		
		driver.get("http://www.way2automation.com/angularjs-protractor/registeration/#/login");
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='btn btn-danger']")));
		driver.findElement(By.name("username")).sendKeys("angular");
		String str1 = driver.findElement(By.cssSelector("[type='text']")).getAttribute("value");
		System.out.println(str1);
		driver.findElement(By.id("password")).sendKeys("password");
		String str2 = driver.findElement(By.cssSelector("[type='password']")).getAttribute("value");
		System.out.println(str2);
		driver.findElement(By.id("formly_1_input_username_0")).sendKeys("angular");
		driver.findElement(By.className("btn-danger")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='ng-scope']:nth-child(3)")));
		String verify=driver.findElement(By.cssSelector("[class='ng-scope']:nth-child(2)")).getText();
		
		if(verify.equals("You're logged in!!")) {
			System.out.println("passed");
		}
		driver.findElement(By.cssSelector("a[href='#/login']")).click();
	
	
	}

//	@AfterTest
//	public void CloseT() {
//		driver.close();
//		driver.quit();
//	}
}

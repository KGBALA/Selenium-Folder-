import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assigment8getTextAttribute2 {
	
	ChromeDriver driver;

	@BeforeMethod
	public void navigate1() {
		System.setProperty("webdriver.chrome.driver", "../chromedriver/");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Test
	public void navigate() {
		
		driver.get("https://www.mgmresorts.com/en.html");
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='icon-building-view hdr']")));
		driver.findElement(By.cssSelector("[id='nav-mlife']")).click();
	    driver.findElement(By.cssSelector("[type='email']")).sendKeys("tester@gmail.com");
	    String str1 = driver.findElement(By.cssSelector("[type='email']")).getAttribute("value");
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("tester123");
		String str2 = driver.findElement(By.cssSelector("[type='password']")).getAttribute("value");
		System.out.println(str1);
		System.out.println(str2);
	}
}
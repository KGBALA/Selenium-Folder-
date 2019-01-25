
import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class Assigment7Synchronization {

	WebDriver driver;

	@BeforeMethod

	public void driverSetUp() {

		System.setProperty("webdriver.chrome.driver", "../chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	}

	@Test

	public void synchTest() {

		System.setProperty("webdriver.chrome.driver", "../chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		WebDriverWait wait = new WebDriverWait(driver, 20);

		driver.findElement(By.cssSelector("[onclick='timedText()']")).click();

		wait.until(ExpectedConditions.textToBe((By.xpath("//*[@id='demo']")), "WebDriver"));

		List<WebElement> links = driver.findElements(By.id("demo"));

// for (WebElement link : links) {

		for (WebElement link : links) {

			if (link.getText().equals("WebDriver")) {

				System.out.println(links.get(0).getText());

			} else {

				System.out.println("not exist");

			}

			driver.close();

			driver.quit();

		}

	}

}
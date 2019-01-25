import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment3BrowserMethod {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.website.com/sign-in/");
		
	driver.findElement(By.name("username")).sendKeys("mike");
	driver.findElement(By.name("password")).sendKeys("abc123");
	driver.findElement(By.cssSelector("[title='Log In']")).click();

		
		

	}

}

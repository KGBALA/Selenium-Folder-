import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assigment5XPATH {
	
	WebDriver driver;
	
	@BeforeMethod
	public void driverSetup() {
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	}

	@Test
	public void salesforceLogin() {
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.cssSelector("[id='username']")).sendKeys("mike");
		driver.findElement(By.cssSelector("[id='password']")).sendKeys("abc123");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		driver.quit();
	}

	@Test
	public void bestbuy() throws InterruptedException {
		driver.get("http://bestbuy.com");
		driver.findElement(By.cssSelector("[class='close']")).click();
	    
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("[id=hf_accountMenuLink]")).click();
		driver.findElement(By.cssSelector("[class='lam-signIn__button btn btn-secondary']")).click();
		driver.findElement(By.cssSelector("[type='email']")).sendKeys("mike@mike.com");
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("abc123");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		driver.close();
		driver.quit();
	}
}

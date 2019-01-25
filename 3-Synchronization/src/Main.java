import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		driver.manage().window().maximize();
		
		//Implicit wait
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		
//		driver.findElement(By.id("H-destination")).sendKeys("nyc");
//		driver.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
//		driver.findElement(By.id("H-destination")).sendKeys(Keys.ENTER);
//		
//		driver.findElement(By.xpath("//a[contains(@href,'Hotels')]")).click();
		
		
		//Explicit wait
		
        WebDriverWait wait = new WebDriverWait(driver,5);
		
		driver.findElement(By.id("H-destination")).sendKeys("nyc");
		driver.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
		driver.findElement(By.id("H-destination")).sendKeys(Keys.ENTER);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href,'Hotels')]")));
		
		driver.findElement(By.xpath("//a[contains(@href,'Hotels')]")).click();
		
		
	}

}

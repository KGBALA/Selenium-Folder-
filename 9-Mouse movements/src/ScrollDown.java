import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.demo.guru99.com/test/guru99home/.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//by pixel
		//js.executeAsyncScript("window.scrollBy(0,1000)");
		
		//scroll to visibility of an element
		WebElement element=driver.findElement(By.id("philadelphia-field-email"));
		js.executeScript("arguments[0].scrollIntoView();",element);
		
	
	}

}

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.johnlewis.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//*[@id='root']/header/nav/ul/li[3]/a"))).build().perform();

		driver.findElement(By.xpath("//*[@id='root']/header/nav/ul/li[3]/div/div[1]/ul/li[2]/div/ul/li[3]/a"))
				.click();

	}

}

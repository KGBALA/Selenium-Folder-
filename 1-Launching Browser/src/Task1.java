import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.close();
		driver.quit();

		System.setProperty("webdriver.chrome.driver", "../firefoxdriver");
		FirefoxDriver driver2 = new FirefoxDriver();
		driver.get("https://www.bestbuy.com/");

	}
}

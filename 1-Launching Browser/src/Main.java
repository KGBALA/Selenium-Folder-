import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");

	}

}

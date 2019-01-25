import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver = new ChromeDriver();
		String title1 = "Computer";
		driver.get("https://www.rediff.com/");
		String title = driver.getTitle();
		if (title.contains("Business")) {
			System.out.println("Verified");
		} else {
			System.out.println("Not Verified");

		}
		driver.quit();
	}

}

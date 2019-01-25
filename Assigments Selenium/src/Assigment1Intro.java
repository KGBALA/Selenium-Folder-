import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment1Intro {
	public static void main(String[] args) {

		// 1- Navigate to: https://shop.honda.com/

		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get(" https://shop.honda.com/");
		String hondaTitle = driver.getTitle();
		System.out.println(hondaTitle);
		
		driver.get(" https://www.ferrari.com/en-US");
		String ferrariTitle = driver.getTitle();
		System.out.println(ferrariTitle);
		// 2- Get the title and keep in the variable called hondaTitle

		System.out.println(hondaTitle+" " +ferrariTitle + " " + "Shop for Ferrari");
		driver.close();
		driver.quit();
		
	}

}

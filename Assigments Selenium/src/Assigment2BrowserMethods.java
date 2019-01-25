import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment2BrowserMethods {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://www.bankofamerica.com/");
		driver.get("http://www.fanniemae.com/portal/index.html");
		driver.get("https://www.bcbs.com/");
		driver.get("https://www.ibm.com/us-en/?lnk=m");
		driver.get("https://www.mcdonalds.com/us/en-us.html");
		
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		
		System.out.println("This is my company " + "https://www.ibm.com/us-en/?lnk=m" );
		driver.close();
		driver.quit();
		
		
		

	}

}

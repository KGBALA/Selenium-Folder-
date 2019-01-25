import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment4IdenElements {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","../chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//driver.get(" http://www.way2automation.com/angularjs-protractor/registeration/#/login");
		driver.get(" https://mail.rediff.com/cgi-bin/login.cgi");
		
		
//		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("angular");
//		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("password");
//		driver.findElement(By.xpath("//*[@id='formly_1_input_username_0']")).sendKeys("angular");
//		driver.findElement(By.xpath("/html/body/div[3]/div/div/div/form/div[3]/button")).click();
		

		driver.findElement(By.id("login1")).sendKeys("mike");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("proceed")).click();

		driver.close();
		driver.quit();
	
	}
}

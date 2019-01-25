
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "../chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[id='button1']")).click();
		driver.findElement(By.cssSelector("[onclick='newMsgWin()']")).click();
		
		Set<String>winIds=driver.getWindowHandles();
		System.out.println(winIds.size());
		
		Iterator<String> it=winIds.iterator();
		
		String mainWindow=it.next();
		String firstWindow=it.next();
		
		System.out.println(mainWindow);
		 
		
		//where we want to go
		driver.switchTo().window(firstWindow);
		String Titlefirst= driver.getTitle();
		System.out.println(Titlefirst);
		
		driver.switchTo().window(mainWindow);
		String maintitle= driver.getTitle();
		System.out.println(maintitle);
		
		driver.quit();
		
		
	}
	

}

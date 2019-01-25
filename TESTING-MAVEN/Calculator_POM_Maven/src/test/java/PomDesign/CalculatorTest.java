package PomDesign;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.HomePage;

import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalculatorTest {

	WebDriver driver;
	Xls_Reader xl=new Xls_Reader("/Users/edilmasimov/Desktop/SELENIUM/TESTING-MAVEN/Calculator_POM_Maven/src/test/resources/testData.xlsx");
	

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/gas-mileage-calculator.html");
	}

	@AfterTest
	public void closeUp() {
		driver.quit();
	}

	@Test
	public void login() {
		HomePage mainPage = new HomePage(driver);

//		double currentOr = 3456;
//		double previousOr = 2345;
//		double gas = 30;
//		int num=3;
		
		int rowcount=xl.getRowCount("data");
		
		for(int i=2;i<=rowcount;i++) {
			String currentOr=xl.getCellData("data", "CurrentOr", i);
			String previousOr=xl.getCellData("data", "PreviousOr", i);
			String gas=xl.getCellData("data", "Gas", i);
//			String expected=xl.getCellData("Data, "Expected", i);
//		    String actual=xl.getCellData("Data, "Actual", i);
		}
        
		mainPage.CurrentOdo.clear();
		mainPage.CurrentOdo.sendKeys(currentOr);
		
		mainPage.PreviousOdo.clear();
		mainPage.PreviousOdo.sendKeys(previousOr);
		
		mainPage.gasTank.clear();
		mainPage.gasTank.sendKeys((gas));
		
		mainPage.calcButton.click();
		String str = mainPage.result.getText();

		
		String[] actualResult=mainPage.result.getText().split(" ");
		System.out.println(actualResult[0]);
		
		double expectedResult =(currentOr-previousOr)/gas;
		DecimalFormat df=new DecimalFormat("0.00");
		String expectedResult2=String.valueOf(df.format(expectedResult));
		
		if(actualResult[0].equals(expectedResult2)) {
		      System.out.println("Pass");
		    }else {
		      System.out.println("Fail");
		    }

	}
}
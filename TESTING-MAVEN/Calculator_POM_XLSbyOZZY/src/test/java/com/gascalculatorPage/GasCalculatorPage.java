package com.gascalculatorPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GasCalculatorPage {
	
	public GasCalculatorPage(WebDriver driver) {
	       PageFactory.initElements(driver, this);
	   }

	   @FindBy(id="uscodreading")
	   public WebElement currentOdometer;

	   @FindBy(id="uspodreading")
	   public WebElement previousOdometer;

	   @FindBy(id="usgasputin")
	   public WebElement gas;

	   @FindBy(xpath="//*[@id=\"standard\"]/tbody/tr[5]/td/input")
	   public WebElement calculate;

	   @FindBy(xpath="//*[@id='content']/font/b")
	   public WebElement result;
	   
	   public void printResult() {

			 String result1=result.getText();
			 result1=result1.replaceAll("miles per gallon", "");
			 System.out.println(result1);

			 }
}

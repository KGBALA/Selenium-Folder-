package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
  
  public HomePage(WebDriver driver) {
    PageFactory.initElements(driver, this);
  }
  
  
  @FindBy(id="txtUsername")
  public WebElement fName;
  
  @FindBy(css="[id='txtPassword']")
  public WebElement lName;
  
  @FindBy(css="[name='Submit']")
  public WebElement lButton;
  
  @FindBy(css="[type='text']")
  public WebElement fAttribute;
  
  @FindBy(css="[type='password']")
  public WebElement lAttribute;
  
  @FindBy(css="[placeholder='Company Email Address']")
  public WebElement LegendTxt;
}


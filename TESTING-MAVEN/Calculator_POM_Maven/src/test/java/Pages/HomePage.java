package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
  
  public HomePage(WebDriver driver) {
    PageFactory.initElements(driver, this);
  }
  
  
  @FindBy(id="uscodreading")
  public WebElement CurrentOdo;
  
  @FindBy(id="uspodreading")
  public WebElement PreviousOdo;
  
  @FindBy(id="usgasputin")
  public WebElement gasTank;
  
  @FindBy(id="usgasprice")
  public WebElement gasPrice;
  
  @FindBy(xpath="//*[@id='standard']/tbody/tr[5]/td/input")
  public WebElement calcButton;
  
  @FindBy(xpath="//*[@id='content']/font/b")
  public WebElement result;
 
}

package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
       //Declaration
	   @FindBy(xpath="//input[@name='field-keywords']")
	   private WebElement searchtxtbox;
	   
	   @FindBy(xpath="//input[@class='nav-input']")
	   private WebElement searchbtn;
	   
	   //initialize
	   public Homepage(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	   
	   //utilize
	   public void searchtextbox(String product)
	   {
		   searchtxtbox.sendKeys(product);
	   }
	   
	   public void searchbutton()
	   {
		   searchbtn.click();
	   }
}


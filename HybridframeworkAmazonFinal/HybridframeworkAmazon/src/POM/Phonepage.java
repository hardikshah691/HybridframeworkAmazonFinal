package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Phonepage {
     //Declaration
	 @FindBy(xpath="(//h2[contains(@data-attribute,'Phone')])[1]")
	 private WebElement selectphone;
	 
	 //initialize
	 public Phonepage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	 
	 //utilize
	 public void clickphone()
	 {
		 selectphone.click();
	 }
}
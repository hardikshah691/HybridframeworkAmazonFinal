package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage {

	//Declaration
	@FindBy(id="add-to-cart-button")
	private WebElement cartbutton;
	
	//initialize
	public Cartpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilize
	public void clickcartbutton() 
	{
		cartbutton.click();
	}
}

package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
    //Declaration
	
	@FindBy(xpath="//span[.='Hello. Sign in']")
	private WebElement signinhover;
	
	@FindBy(name="email")
	private WebElement emailaddress;
	
	@FindBy(id="ap_password")
	private WebElement password;
	
	@FindBy(id="signInSubmit")
	private WebElement loginbtn;
	
	
	
	
   //initialization
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilize
	
	public void signinarea() 
	{
		signinhover.click();
	}
	public void emailtextbox(String name)
	{
		emailaddress.sendKeys(name);
	}
	public void passwordtextbox(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void loginbutton()
	{
		loginbtn.click();
	}
	
}

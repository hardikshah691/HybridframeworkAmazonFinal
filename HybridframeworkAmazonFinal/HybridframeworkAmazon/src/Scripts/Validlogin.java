package Scripts;

import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.Constant;
import Generic.Excel;
import Generic.Property;
import POM.Cartpage;
import POM.Homepage;
import POM.Loginpage;
import POM.Phonepage;


public class Validlogin extends Basetest {
    @Test
	public void validlogin() {
        Loginpage l=new Loginpage(driver);
		
		String us=Excel.getdata(excelpath,"Sheet1",1,0);
		String pwd=Excel.getdata(excelpath,"Sheet1",1,1);
		
		l.signinarea();
		l.emailtextbox(us);
		l.passwordtextbox(pwd);
	    l.loginbutton();
		
		Homepage h=new Homepage(driver);
		String product=Excel.getdata(excelpath,"Sheet1",1,2);
		h.searchtextbox(product);
		h.searchbutton();
		
		Phonepage p=new Phonepage(driver);
		p.clickphone();
		
		Cartpage c=new Cartpage(driver);
		c.clickcartbutton();
 
    	
	}
		
	
	
		

	}



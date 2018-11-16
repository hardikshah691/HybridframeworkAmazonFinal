package Scripts;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.Excel;
import POM.Cartpage;
import POM.Homepage;
import POM.Loginpage;
import POM.Phonepage;

public class Invalidlogin extends Basetest{
       @Test
       public void invalid() {
    	Loginpage l=new Loginpage(driver);
   		
   		String us=Excel.getdata(excelpath,"Sheet1",1,0);
   		String pwd=Excel.getdata(excelpath,"Sheet1",1,1);
   		
   		l.signinarea();
   		l.emailtextbox(us);
   		l.passwordtextbox(pwd);
   	    l.loginbutton();
   		
   		
       }
}

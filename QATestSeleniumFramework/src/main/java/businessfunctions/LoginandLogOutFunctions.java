package businessfunctions;

import pagerepos.HomePage;
import pagerepos.LoginPage;

public class LoginandLogOutFunctions extends BaseClass


{
 public static void login() {
	 
	 LoginPage.enterUserName();
	 LoginPage.enterPassword();
	 LoginPage.clickLoginbutton();
 }
 
 public static void logout()
 {
	 HomePage.clickWelcome();
		HomePage.clickLogout();
 }
	
	
	
	
}

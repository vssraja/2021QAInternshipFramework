package pagerepos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import businessfunctions.BaseClass;
import configuration.Configer;

public class LoginPage extends BaseClass
{
	//static WebDriver driver =null;
	
	public static By txtUserName = By.id("txtUsername");
	
	public static By txtPassword =By.id("txtPassword");
	
	public static By btnLogin =By.name("Submit");
	
	public static void  enterUserName()
	{
		driver.findElement(txtUserName).sendKeys(Configer.getPropertyValue("username"));			
	}
	
	public static void enterPassword() 
	{
		driver.findElement(txtPassword).sendKeys(Configer.getPropertyValue("password"));	
	}
	
	public static void clickLoginbutton()
	{
	 driver.findElement(btnLogin).click();	
	}
	
	
	

}

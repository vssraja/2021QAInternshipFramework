package test;

import java.util.concurrent.TimeUnit;


//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import businessfunctions.*;
import pagerepos.HomePage;
import pagerepos.LoginPage;

public class LoginAndLogoutTest extends BaseClass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub


		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\vssra\\eclipse-workspace\\QATestSeleniumFramework\\src\\main\\java\\drivers\\chromedriver.exe");

		//WebDriver driver = new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		BaseClass.OpenBrowser();
		
		//driver.findElement(By.id("C")).sendKeys("Admin");
		//driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//driver.findElement(By.name("Submit")).click();
		
		//LoginPage.enterUserName();
		//LoginPage.enterPassword();
		//LoginPage.clickLoginbutton();
		
		//LoginandLogOutFunctions.login();
		//LoginandLogOutFunctions.logout();
		    
		LoginandLogOutFunctions.login();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		LoginandLogOutFunctions.logout();
		
		
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		
		BaseClass.CloseBrowser();
		
		
		
		
		
		
		
		
		
		
		
		//HomePage.clickWelcome();
		//HomePage.clickLogout();
		
		//BaseClass.CloseBrowser();
		
		
		
		//driver.findElement(By.partialLinkText("Welcome")).click();
		
		//driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		//driver.findElement(By.linkText("Logout")).click();
		
		//driver.close();
		//driver.quit();
		
		
		


	}

}

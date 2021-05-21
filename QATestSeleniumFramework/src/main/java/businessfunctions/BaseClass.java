package businessfunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import configuration.Configer;

public class BaseClass 
{
	public static WebDriver driver ;


	
	
   public static void OpenBrowser() 
   {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\vssra\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		driver.get(Configer.getPropertyValue("url"));  
   }
   
   
   public static void CloseBrowser() {
	   driver.close();
	   driver.quit();
   }
}

package configuration;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Configer {
	public static String getPropertyValue(String PropertyName) {

		FileReader input=null;
		
		try {
			   input = new FileReader("C:\\Users\\vssra\\eclipse-workspace\\QATestSeleniumFramework\\src\\main\\java\\configuration\\configuration");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Properties p = new Properties();
		try {
			p.load(input);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(p.getProperty("username"));
		//System.out.println(p.getProperty("password"));
		return p.getProperty(PropertyName);
		
	}

	//public static String getPropertyValue(String propertyName) {
		// TODO Auto-generated method stub
		//return null;
	//}

}

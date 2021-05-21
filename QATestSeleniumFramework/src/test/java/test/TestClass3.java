package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestClass3


{
@DataProvider(name="testdata")	//

public Object[][]dataProvFunc()

{
	return new Object[][] {
			
		{"Viji"},{"Raj"},{"san"}	
};

}
	
	
@Test	(dataProvider = "testdata")
public void test5(String names)
{
	System.out.println("test5 exected");
	System.out.println(names);
	
}
	
	
	
}

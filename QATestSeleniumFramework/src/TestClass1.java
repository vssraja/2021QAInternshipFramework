package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass1 
{
	
	
	
	
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("Before suite executed");
	}
	
	
	
	@BeforeTest
	
	public void beforetest() 
	{
		System.out.println("I am running before  test");
	}
	
	@BeforeMethod
	public void method()
	{
		System.out.println("before each method executed");
	}
	
	
	@AfterMethod
	  public void aftermethod()
	  {
		  System.out.println("after each method executed");
	  }
	
	
	
  @Test	(groups = {"smoke","regression"})
  public void test1()
  {
	System.out.println("test1 is executed");  
  }
  
  @Test(groups = {"regression"})
  
  public void test2()
  {
	  System.out.println("test2 is executed");
  }
  
  
  
  @AfterTest
	
	public void aftertest()
	{
		System.out.println("I am running after test");
	}
  
  
  @AfterSuite
  public void aftersuite()
  {
	  System.out.println("After suite executed");
  }
  
  
  
  
}





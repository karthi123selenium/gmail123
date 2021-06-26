package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 
{
	@Test(priority = 2)
	public void test()
	{
		Reporter.log("execute test method");
	}
	
	@Test(priority = 4)
	public void best()
	{
		Reporter.log("execute best method",false);
	}
	
	@Test(priority = 1)
	public void rest()
	{
		Reporter.log("execute rest method",true);
	}
	
	@Test(priority = 3)
	public void zest()
	{
		Reporter.log("execute zest method",true);
	}
	
	@Test(priority = 5)
	public void nest()
	{
		Reporter.log("Execute nest method");
	}
	

}

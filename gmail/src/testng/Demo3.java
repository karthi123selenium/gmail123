package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3
{
	@Test(priority  = 5, invocationCount = 4)
	public void lust()
	{
		Reporter.log("execute lust method");
	}
	
	@Test(invocationCount = 2, priority = 4)
	public void test()
	{
		Reporter.log("execute test method", true);
	}
	
	@Test(priority = 1, invocationCount = 0)
	public void rest()
	{
		Reporter.log("execute rest method");
	}
	
	@Test(invocationCount = 3, priority = 2)
	public void bust()
	{
		Reporter.log("execute bust method");
	}
	
	@Test(invocationCount = 1, priority = 3)
	public void must()
	{
		Reporter.log("execute must method",true);
	}

}

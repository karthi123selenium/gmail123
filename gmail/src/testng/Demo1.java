package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1
{
	@Test
	public void test()
	{
		System.out.println("welcome to TestNG");
	}
	@Test
	public void test1()
	{
		Reporter.log("print in reporter",false);
	}
	@Test
	public void test2()
	{
		Reporter.log("print in reporter and console",true);
	}

}

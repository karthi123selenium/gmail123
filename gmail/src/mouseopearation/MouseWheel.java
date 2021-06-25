package mouseopearation;

import java.awt.AWTException;
import java.awt.Robot;

public class MouseWheel
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		Thread.sleep(3000);
		Robot r1 = new Robot();
		r1.mouseWheel(100);
		Thread.sleep(3000);
		r1.mouseWheel(-100);
	}

}
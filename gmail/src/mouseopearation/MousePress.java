package mouseopearation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class MousePress
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		Thread.sleep(3000);
		Robot r1 =  new Robot();
		r1.mousePress(InputEvent.BUTTON1_MASK);
		r1.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(3000);
				
	}

}

package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CloseAllChildWindows 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.naukri.com/");
		String pwid = driver.getWindowHandle();//parent window id//
		Set<String> windows = driver.getWindowHandles();//all the windows//
		
		for(String win:windows)
		{
			if(!win.equals(pwid))
			{
				driver.switchTo().window(win);
				driver.close();
			}
		}
		
	}

}

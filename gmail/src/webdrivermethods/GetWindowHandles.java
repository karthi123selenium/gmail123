package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetWindowHandles
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.naukri.com/");
		Set<String> windowID = driver.getWindowHandles();
		//System.out.println(windowID);
		driver.quit();
		
		for(String win:windowID)
		{
			System.out.println(win);
		}
			
	}

}

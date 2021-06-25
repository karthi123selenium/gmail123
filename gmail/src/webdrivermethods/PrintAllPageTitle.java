package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintAllPageTitle 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		Set<String> windowids = driver.getWindowHandles();
		System.out.println(windowids);
		
		for(String win : windowids)
		{
			driver.switchTo().window(win);
			String title = driver.getTitle();
			System.out.println(title);
			driver.close();
		}
	}

}

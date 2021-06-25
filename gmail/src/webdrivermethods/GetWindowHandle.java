package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetWindowHandle
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.naukri.com/");
		String windowID = driver.getWindowHandle();
		System.out.println(windowID);
		driver.close();
	}

}

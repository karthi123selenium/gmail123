package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClosingalltheBrowsers 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		String pageurl = driver.getCurrentUrl();
		System.out.println(pageurl);
		//driver.close();//
		driver.quit();
		
	}

}

package polymorphism;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class genericmethodtoLaunchandCloseBrowser
{
	public static void generic(WebDriver driver)
	{
		driver.close();
	}
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		
		generic(new ChromeDriver());
		generic(new FirefoxDriver());
		generic(new InternetExplorerDriver());
		generic(new EdgeDriver());
		
	}

}

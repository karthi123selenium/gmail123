package javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBarMove1 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://skillrary.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window, scrollBy(0, 600)");
		
		Thread.sleep(5000);
		
		js.executeScript("window, scrollBy(100, 900)");
		
		Thread.sleep(3000);
		
		js.executeScript("window, scrollBy(0, -500)");
		
		
	}

	
}

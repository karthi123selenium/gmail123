package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(10000);
		driver.get("https://www.actitime.com");
		Thread.sleep(5000);
		Navigation navi = driver.navigate();
		
		navi.back();
		Thread.sleep(2000);
		navi.forward();
		Thread.sleep(2000);
		navi.to("https://www.yahoo.com");
		navi.refresh();
		Thread.sleep(2000);
		driver.close();	
	}

}

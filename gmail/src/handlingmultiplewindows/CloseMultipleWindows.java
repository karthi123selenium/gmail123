package handlingmultiplewindows;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CloseMultipleWindows
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions notify = new ChromeOptions();
		notify.addArguments("--disable-notification");
		

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(notify);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://demo.actitime.com/login.do");
		String parent = driver.getWindowHandle();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[contains(@href, 'www.actitime.com')]")).click();
		Set<String> allwindows = driver.getWindowHandles();
		Thread.sleep(5000);
		
		
		
		for(String win:allwindows)
		{
			if(win.equals(parent))
			{
				driver.switchTo().window(win);
				System.out.println(win);
				Thread.sleep(5000);
			}
			else
			{
				System.out.println(win);
				driver.switchTo().window(win).close();
			}
		}
		driver.switchTo().window(parent);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(5000);
		driver.quit();
		
	}

}

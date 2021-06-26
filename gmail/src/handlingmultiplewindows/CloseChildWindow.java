package handlingmultiplewindows;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildWindow 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.naukri.com/");
		Set<String> list = driver.getWindowHandles();
		
		for(String  win : list)
		{
			driver.switchTo().window(win);
			if(driver.getTitle().contains("Tech Mahindra"))
			{
				driver.findElement(By.xpath("//img[@alt = 'Tech Mahindra']")).click();
				Thread.sleep(3000);
			}
		}
		driver.quit();
		
	}

}

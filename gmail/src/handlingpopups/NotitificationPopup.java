package handlingpopups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class NotitificationPopup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions notification = new ChromeOptions();
		notification.addArguments("--disable-notification");
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(notification);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://facebook.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("button[title='Accept All']")).click();
		
		driver.findElement(By.id("email")).sendKeys("anitha.s123@yahoo.com");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("october08");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
	}

}

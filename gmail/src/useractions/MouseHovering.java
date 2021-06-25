package useractions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.skillrary.com/");
		Thread.sleep(5000);
				
		WebElement gears = driver.findElement(By.xpath("//span[.='GEARS']"));
		
		Actions mouse = new Actions(driver);
		mouse.moveToElement(gears).perform();
		
		driver.findElement(By.linkText("Typing Speed Test")).click();
		
		}

}

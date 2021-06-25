package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitlyWait 
{
		public static void main(String[] args) 
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			driver.get("https://uk.mail.yahoo.com");
			driver.findElement(By.id("login-username")).sendKeys("karthimdu@ymail.com");
			driver.findElement(By.cssSelector("label[for='persistent']")).click();
			driver.findElement(By.id("login-signin")).click();
			driver.findElement(By.className("password")).sendKeys("*******");
			driver.findElement(By.name("verifyPassword")).click();		
			
			boolean isDisplayed = driver.findElement(By.xpath("//span[@role='presentation']")).isDisplayed();
			
			if(isDisplayed)
			{
				System.out.println("home page is displayed");
				driver.quit();
			}
			else
			{
				System.out.println("home page is not diplayed");
				driver.quit();
			}
		}
}

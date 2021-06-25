package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com/");
		driver.findElement(By.id("login-username")).sendKeys("karthimdu@ymail.com");
		driver.findElement(By.cssSelector("label[for='persistent']")).click();
		driver.findElement(By.id("login-signin")).click();
		driver.findElement(By.id("login-passwd")).sendKeys("******");
		driver.findElement(By.name("verifyPassword")).click();
		String expectedtitle = "Yahoo UK | News, email and search";
		System.out.println(driver.getTitle());
		
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.titleIs(expectedtitle));
		
		String actualtitle = driver.getTitle();
		
		if(expectedtitle.equals(actualtitle))
		{
			System.out.println("pass page displayed");
		}
		else
		{
			System.out.println("fail page not displayed");
		}
	}

}


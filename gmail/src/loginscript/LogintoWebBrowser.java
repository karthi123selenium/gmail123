package loginscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogintoWebBrowser 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://uk.mail.yahoo.com");
		driver.findElement(By.id("login-username")).sendKeys("karthimdu@ymail.com");
		driver.findElement(By.cssSelector("label[for='persistent']")).click();
		driver.findElement(By.id("login-signin")).click();
		driver.findElement(By.className("password")).sendKeys("jallikattu2016");
		driver.findElement(By.name("verifyPassword")).click();
		
		//Thread.sleep(10000);//
		//String expectedtitle = "karthimdu@ymail.com - Yahoo Mail";
		//String title = driver.getTitle();
		//System.out.println(title);
		Boolean isdisplayed = driver.findElement(By.xpath("//span[.='Karthikeyan']")).isDisplayed();
		
		
		if(isdisplayed)
		{
			System.out.println("welldone");
		}
		else
		{
			System.out.println("tryagain");
		}
		
		driver.findElement(By.cssSelector("span[role='presentation']")).click();
		driver.findElement(By.xpath("//span[.='Sign out']")).click();
		driver.quit();
		
		//driver.findElement(By.xpath("//div[.='I agree']")).click();
		//driver.findElement(By.linkText("Sign in")).click();
		//driver.findElement(By.id("identifierId")).sendKeys("karthikeyanuk123@gmail.com");
		//driver.findElement(By.className("VfPpkd-RLmnJb")).click();
		
		//String expectedtitle = driver.
		//String actualtitle = driver.getTitle();
		
		
	}

}

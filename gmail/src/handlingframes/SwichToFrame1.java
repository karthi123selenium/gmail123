package handlingframes; // wrong programme//

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SwichToFrame1 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//div[.='I agree']")).click();
		
		WebElement open = driver.findElement(By.name("q"));
		open.sendKeys("https://www.facebook.com/");
		
		Actions act = new Actions(driver);
		act.keyDown(Keys.ENTER).perform();
		
		//Thread.sleep(2000);
		//driver.switchTo().frame("cookie_banner_title");
		//driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		//driver.close();
	}

}

package useractions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyDownOpenNewPage
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.ebay.co.uk/");
		WebElement homegarden = driver.findElement(By.linkText("Home & Garden"));
		
		Actions action =  new Actions(driver);
		action.keyDown(Keys.CONTROL).click(homegarden).keyUp(Keys.CONTROL).perform();
		
		Thread.sleep(5000);
		driver.quit();		
	}

}

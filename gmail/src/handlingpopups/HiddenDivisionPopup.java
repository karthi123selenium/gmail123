package handlingpopups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HiddenDivisionPopup 
{
	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://en.wikipedia.org/wiki/River_Itchen,_Hampshire");
		Thread.sleep(5000);
		
		WebElement neareast = driver.findElement(By.linkText("Special Area of Conservation"));
		
		Actions river = new Actions(driver);
		river.moveToElement(neareast).perform();
		Thread.sleep(3000);
		driver.findElement(By.className("mwe-popups-settings-icon")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(5000);
		driver.close();
	}

}

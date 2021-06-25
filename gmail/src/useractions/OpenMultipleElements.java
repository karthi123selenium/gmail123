package useractions; // the elements not opening in new window also not showing any error//

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenMultipleElements 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.sainsburys.co.uk/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[.='Accept All Cookies']")).click();
		
		List<WebElement> link = driver.findElements(By.className("NavItemstyles__NavLinkListItem-tj0ono-1 bIynIA"));
		
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL);
				
		for(WebElement links : link)
		{
			action.click(links);
			
		}
		action.keyUp(Keys.CONTROL);
		action.perform();
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
	}

}

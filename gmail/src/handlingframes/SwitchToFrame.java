package handlingframes; //not working in testing website//

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SwitchToFrame
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.naukri.com/");
		Thread.sleep(5000);
		driver.switchTo().frame("viewport");
		Thread.sleep(5000);
		
		driver.findElement(By.className("Bz112c Bz112c-r9oPif")).click();
		
		
	}

}

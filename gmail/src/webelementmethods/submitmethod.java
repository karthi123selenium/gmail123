package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class submitmethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://login.yahoo.com/");
		driver.findElement(By.id("login-username")).sendKeys("karthimdu@ymail.com");
		driver.findElement(By.id("login-signin")).submit();
		//Thread.sleep(10000);
		//WebElement driver1 = driver.findElement(By.name("username"));
		//driver1.sendKeys(Keys.CONTROL+"a");
		//driver1.sendKeys(Keys.DELETE);
	}

}

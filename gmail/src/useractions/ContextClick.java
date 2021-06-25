package useractions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://skillrary.com/");
		
		Actions action = new Actions(driver);
		action.contextClick().perform();
		
		Thread.sleep(5000);
		
		driver.close();
		
		
		
	}

}

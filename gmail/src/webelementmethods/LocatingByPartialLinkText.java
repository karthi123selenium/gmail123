package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatingByPartialLinkText 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.gov.uk/");
		driver.findElement(By.partialLinkText("Crown")).click();
		
	}

}

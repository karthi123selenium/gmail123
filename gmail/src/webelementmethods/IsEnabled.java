package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class IsEnabled 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.gov.uk/");
		boolean isEnabled = driver.findElement(By.xpath("//body[@ class ='mainstream homepage js-enabled']")).isEnabled();
		if(isEnabled)
		{
			System.out.println("it is enabled");
		}
		else
		{
			System.out.println("not enabled");
		}
	}
}

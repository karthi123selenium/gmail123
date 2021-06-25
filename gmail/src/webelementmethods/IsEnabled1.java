package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class IsEnabled1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://live.skillrary.com/testing-app/");
		boolean isenabled = driver.findElement(By.className("form-control")).isEnabled();
		if(isenabled)
		{
			System.out.println("it is enabled");
		}
		else
		{
			System.out.println("its not enabled");
		}
		
	}

}

package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WindowMaximize 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.close();
		
	}

}

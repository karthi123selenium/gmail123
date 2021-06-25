package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GetAttributeValue 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://login.yahoo.com/");
		WebElement username = driver.findElement(By.id("login-username"));
		username.sendKeys("karthimdu@ymail.com");
		String attvalue = username.getAttribute("value");
		System.out.println(attvalue);
		if(attvalue.isEmpty())
		{
			System.out.println("the attribute field is empty");
		}
		else
		{
			System.out.println("the attribute field is not empty");
		}
		
	}

}

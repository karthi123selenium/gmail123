package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class IsSelected 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://login.yahoo.com/");
		driver.findElement(By.id("login-username")).sendKeys("karthimdu@ymail.com");
		WebElement checkbox = driver.findElement(By.cssSelector("label[for='persistent']"));
		checkbox.click();
		Boolean isSelected = checkbox.isSelected();
		if(isSelected)
		{
			System.out.println("checkboxselected");
		}
		else
		{
			System.out.println("checkbox not selected");
		}
	}
}

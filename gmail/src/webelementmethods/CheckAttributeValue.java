package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckAttributeValue 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com/");
		String checkbox = driver.findElement(By.id("keepLoggedInCheckBox")).getAttribute("type");
		if(checkbox.equals("checkbox"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
//WebElement box =  driver.findElement(By.id("keepLoggedInCheckBox"));
//String checkbox = box.getAttribute();

package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ChecktheAlignmentofGivenElements 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement username = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.name("pwd"));
		int usernameStartY = username.getLocation().getX();
		int passwordStartY = password.getLocation().getX();
		if(usernameStartY == passwordStartY && username.getSize().getWidth()== password.getSize().getWidth())
		{
			System.out.println("left and right alignment are same");
		}
		else
		{
			System.out.println("left and right alignment are not same");
		}
			
	}
	

}

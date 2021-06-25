package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTopAlignment
{
	public static void main(String[] args) 
	{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://demo.actitime.com/login.do");
			WebElement username = driver.findElement(By.id("username"));
			WebElement password = driver.findElement(By.name("pwd"));
			
			Rectangle rect = username.getRect();
			int startY = rect.getY();
			int height = rect.getHeight();
			int space = 5;
			int areaofusername = startY+height+space;
			
			int passwordstartY = password.getLocation().getY();
			//int passwordstartY = password).getY();
			
			if(passwordstartY>areaofusername)
			{
				System.out.println("correctly alligned");
			}
			else
			{
				System.out.println("not correctly alligned");
			}
	}

}

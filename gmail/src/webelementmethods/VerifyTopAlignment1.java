package webelementmethods;//********NEEDS TO BE CORRECTED ON LINE16******//////

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTopAlignment1
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://uw.co.uk/");
		driver.findElement(By.name("main")).click();
		
		WebElement username = driver.findElement(By.id("usernameInput"));
		WebElement password = driver.findElement(By.id("passwordInput"));
		
		Rectangle rect = username.getRect();
		int height = rect.getHeight();
		int startY = rect.getY();
		int space = 5;
		int areaofusername = height + startY + space;
		
		int areaofpassword = password.getLocation().getY();
		
		if(areaofpassword>areaofusername)
		{
			System.out.println("correctly aligned");
		}
		else
		{
			System.out.println("not correctly aligned");
		}
		
		
	}

}

package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatingByCSSselector 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		//driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("karthi");
		//driver.findElement(By.cssSelector("input[id = 'username']")).sendKeys("admin");
		//driver.findElement(By.cssSelector("input#username")).sendKeys("admin");//
		driver.findElement(By.cssSelector("input.textfield")).sendKeys("admin");
	}

}

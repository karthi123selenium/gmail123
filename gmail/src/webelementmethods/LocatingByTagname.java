package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatingByTagname
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/");
		driver.findElement(By.id("identifierId")).sendKeys("karthikeyanuk123@gmail.com");
		driver.findElement(By.cssSelector("class=['VfPpkd-RLmnJb']")).click();
		
	}

}
//not working as the facebook has a child window to popup first
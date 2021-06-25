package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTagName
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://sabarimalaonline.org/");
		String tag = driver.findElement(By.cssSelector("img[src='assets\\images\\Logo_2.png']")).getTagName();
		if(tag.equals("img"))	
		{
			System.out.println("its an image");
		}
		else
		{
			System.out.println("its not an image");
		}
	}
	
}

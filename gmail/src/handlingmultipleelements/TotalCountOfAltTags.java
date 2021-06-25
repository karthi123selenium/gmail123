package handlingmultipleelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TotalCountOfAltTags 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//div[.='I agree']")).click();
		List<WebElement> imagecount = driver.findElements(By.tagName("img"));
		System.out.println(imagecount.size());
		for(WebElement link:imagecount)
		{
			System.out.println(link);
		}
	}
	

}

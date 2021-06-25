package handlingmultipleelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TotalLimksCountInWebPage 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://uk.yahoo.com/");
		driver.findElement(By.name("agree")).click();
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		for(WebElement alllink:link)
		{
			System.out.println(alllink);
			System.out.println(alllink.getText());
		}
	}
}

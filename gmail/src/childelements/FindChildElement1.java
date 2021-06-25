package childelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindChildElement1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://mobile.twitter.com/login");
		WebElement mainelement = driver.findElement(By.cssSelector("form[action='/sessions']"));
		
		List<WebElement> TagName = mainelement.findElements(By.tagName("input"));
		
		for(WebElement ListValues :TagName)
		{
			System.out.println(ListValues.getAttribute("name"));
		}
	}

}

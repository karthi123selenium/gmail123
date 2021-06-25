package childelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindChildElement
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://zoom.us/signin/");
		
		WebElement find = driver.findElement(By.id("login-form"));
		
		List<WebElement> inputTags = find.findElements(By.tagName("input"));
		
		for(WebElement TagValue : inputTags)
		{
			System.out.println(TagValue.getAttribute("name"));
		}	
	}

}

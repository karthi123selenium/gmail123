package handlinglistbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionFromDropDown
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("file:///C:/Users/karth/OneDrive/Documents/new.html");
		
		WebElement listbox = driver.findElement(By.id("single"));
		
		Select sel = new Select(listbox);
		List<WebElement> show = sel.getOptions();
		
		for(WebElement list : show)
		{
			sel.selectByVisibleText(list.getText());
			Thread.sleep(5000);
		}
		for(WebElement list : show)
		{
			sel.selectByValue(list.getAttribute("value"));
			Thread.sleep(5000);
		}
		for(int i = 0; i <= show.size(); i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(5000);
		}
				
	}

}

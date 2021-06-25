package handlinglistbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckMultipleOrNot 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver =  new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("file:///C:/Users/karth/OneDrive/Documents/new.html");
		
		WebElement listbox = driver.findElement(By.id("multi"));
		
		Select sel = new Select(listbox);
		List<WebElement> usethelist = sel.getOptions();
		
		if(sel.isMultiple())
		{
			System.out.println("it is multiple selection dropdown box");
			for(WebElement option : usethelist)
			{
				sel.selectByVisibleText(option.getText());
				System.out.println(option.getText());
			}
		}
		else
		{
			System.out.println("its not multiple selection dropdown box");
		}
		
		driver.close();	
	}
}

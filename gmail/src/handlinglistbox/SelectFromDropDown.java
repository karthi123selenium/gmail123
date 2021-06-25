package handlinglistbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectFromDropDown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("file:///C:/Users/karth/OneDrive/Documents/new.html");
		
		WebElement listbox = driver.findElement(By.id("single"));
		
		Select sel = new Select(listbox);
		sel.selectByVisibleText("sql");
		Thread.sleep(5000);
		
		sel.selectByIndex(3);
		Thread.sleep(5000);
		
		sel.selectByValue("m");
		Thread.sleep(5000);
		driver.close();
		
		
		
		
		
		
	}

}

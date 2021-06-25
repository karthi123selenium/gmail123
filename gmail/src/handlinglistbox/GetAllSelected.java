package handlinglistbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelected 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver =  new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("file:///C:/Users/karth/OneDrive/Documents/new.html");
		WebElement usemultibox = driver.findElement(By.id("multi"));
		
		Select sel = new Select(usemultibox);
				
		for(int i = 0; i <= 2; i++)
		{
			sel.selectByIndex(i);
		}
		
		List<WebElement> show = sel.getAllSelectedOptions();
		for(WebElement all : show)
		{
			System.out.println(all.getText());
		}
		driver.close();
	}

}

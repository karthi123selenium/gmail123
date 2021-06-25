package handlinglistbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSelectedOption
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("file:///C:/Users/karth/OneDrive/Documents/new.html");
		
		WebElement listbox = driver.findElement(By.id("single"));
		
		Select sel = new Select(listbox);
		WebElement firstselected = sel.getFirstSelectedOption();
		
		System.out.println(firstselected.getText());
		
		sel.selectByIndex(4);
		firstselected = sel.getFirstSelectedOption();
		
		System.out.println(firstselected.getText());
		driver.close();		
		
		
		
	}

}

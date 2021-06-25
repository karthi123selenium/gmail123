package handlinglistbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class FetchDataAtDropDown1
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://mobile.twitter.com/i/flow/signup");
		driver.findElement(By.name("name")).sendKeys("puvi karthikeyan");
		WebElement month = driver.findElement(By.id("Month"));
		WebElement day = driver.findElement(By.id("Day"));
		WebElement year = driver.findElement(By.id("Year"));
		
		Select monthListBox = new Select(month);
		Select dayListBox = new Select(day);
		Select yearListBox = new Select(year);
		
		monthListBox.selectByVisibleText("September");
		dayListBox.selectByVisibleText("26");
		yearListBox.selectByVisibleText("2016");
		
		driver.close();
	}

}

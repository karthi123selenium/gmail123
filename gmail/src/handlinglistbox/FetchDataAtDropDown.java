package handlinglistbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class FetchDataAtDropDown
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://login.yahoo.com/account/create");
		Thread.sleep(5000);
		
		WebElement monthS = driver.findElement(By.id("usernamereg-month"));
		WebElement dayS = driver.findElement(By.id("usernamereg-day"));
		WebElement yearS = driver.findElement(By.id("usernamereg-year"));
		Thread.sleep(5000);
		
		Select monthListBox = new Select(monthS);
		Thread.sleep(5000);
		
		monthListBox.selectByVisibleText("November");
		dayS.sendKeys("28");
		yearS.sendKeys("1975");
		//useday.selectByVisibleText("28");
		//useyear.selectByVisibleText("1975");
		
		
	}

}

package useractions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropActions
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		
		WebElement block2 = driver.findElement(By.xpath("//h1[.='Block 2']"));
		WebElement block3 = driver.findElement(By.xpath("//h1[.='Block 3']"));
		
		Actions action = new Actions(driver);
		//action.dragAndDrop(block2, block3).perform();
		action.clickAndHold(block2).moveToElement(block3).pause(Duration.ofSeconds(3)).release().perform();//alternative for drag and drop//
		
		Thread.sleep(5000);
		
		driver.quit();		
		
	}

}

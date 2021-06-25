package handlingpopups; // no windows popping up in lic india//

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcceptOrClearPopup
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("http://marimallappawomenscollege.org/contactus.php?current=contactus");
		WebElement click = driver.findElement(By.name("Send"));
		Thread.sleep(5000);
		click.click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert(); 
		System.out.println(alert.getText());
		alert.dismiss();
		driver.close();
	}
	

}

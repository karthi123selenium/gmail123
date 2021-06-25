package handlingpopups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopup
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.trivago.co.uk/");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("span[class='icon-ic dealform-button__icon']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[.='June 2021']//..//..//..//..//span[.='26'])[2]")).click();
		Thread.sleep(5000);
		
		
	}

}

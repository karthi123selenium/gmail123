package handlingpopups;/*incomplete programme*/

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectSameDayNextYear
{
	public static void main(String[] args) throws InterruptedException
	{
		LocalDateTime ltd = LocalDateTime.now().plusYears(1);
		int day = ltd.getDayOfMonth();
		String month = ltd.getMonth().name();
		int year = ltd.getYear();
		
		month = month.substring(0, 1).toUpperCase() + month.substring(1).toLowerCase();
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.trivago.co.uk/");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("span[class='icon-ic dealform-button__icon']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[.='"+month+"']/../../../..//span[.='"+day+"'])[2]")).click();
		Thread.sleep(5000);
	}

}

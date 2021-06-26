package handlingpopups; /*https://peter.sh/experiments/chromium-command-line-switches/*/

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUp1
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeOptions notification = new ChromeOptions();
		notification.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(notification);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.southalltravel.co.uk/");
	}

}
/*https://peter.sh/experiments/chromium-command-line-switches/
to get all the commands for chrome driver//
For firefox = about : config  */

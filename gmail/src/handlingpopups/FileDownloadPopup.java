package handlingpopups;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownloadPopup 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.xpath("(//a[.='Download'])[4]")).click();/*(By.linktext("Download")).get(4).click;*/
		Thread.sleep(5000);
		
		Runtime.getRuntime().exec("C:\\Users\\karth\\OneDrive\\Desktop\\AutoiITscript\\downloadpopupscript.au3");
		
	}

}

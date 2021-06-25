package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchingbrowser
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.uk/");
		driver.findElement(By.className("EM1Mrb")).click();
		Thread.sleep(5000);
		String pagetitle = driver.getTitle();
		String pageurl = driver.getCurrentUrl();
		System.out.println(pagetitle);
		System.out.println(pageurl);
		//driver.close();	
	}

}

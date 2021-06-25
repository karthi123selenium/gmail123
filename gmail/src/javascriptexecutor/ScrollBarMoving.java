package javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBarMoving
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		
		driver.get("https://www.qspiders.com/");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 700);");
		
		Thread.sleep(5000);
		
		js.executeScript("window.scrollBy(0, 1000);");
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0, -800);");
	}

}

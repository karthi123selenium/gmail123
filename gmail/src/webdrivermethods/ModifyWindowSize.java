package webdrivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ModifyWindowSize 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		Dimension dim = driver.manage().window().getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		System.out.println(height);
		System.out.println(width);
		Dimension dim1 = new Dimension(400,500);
		driver.manage().window().setSize(dim1);
		Thread.sleep(10000);
		driver.close();
	}

}

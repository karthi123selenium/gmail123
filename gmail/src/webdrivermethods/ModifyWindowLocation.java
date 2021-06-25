package webdrivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ModifyWindowLocation 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		Dimension dim = driver.manage().window().getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		System.out.println(height);
		System.out.println(width);
		
		
		Dimension dim1 = new Dimension(300,500);
		driver.manage().window().setSize(dim1);
		
		Point pt = driver.manage().window().getPosition();
		int startx = pt.getX();
		int starty = pt.getY();
		System.out.println(startx);
		System.out.println(starty);
		
		Point pt1 = new Point(200,350);
		driver.manage().window().setPosition(pt1);
		Thread.sleep(10000);
		driver.close();
		
		
	}

}

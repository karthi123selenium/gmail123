package webdrivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetWindowLocation 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		Dimension dim = new Dimension(400,500);
		driver.manage().window().setSize(dim);
		
		Point pt  = driver.manage().window().getPosition();
		int startx = pt.getX();
		int starty = pt.getY();
		System.out.println(startx);
		System.out.println(starty);
		driver.close();
	}

}

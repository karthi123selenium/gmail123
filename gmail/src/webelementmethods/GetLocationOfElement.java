package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GetLocationOfElement
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://login.yahoo.com/");
		WebElement nextbutton =driver.findElement(By.id("login-signin"));
		Point p1 = nextbutton.getLocation();
		int startx = p1.getX();
		int starty = p1.getY();
		System.out.println("the start point of X coordinate" + startx);
		System.out.println("the start point of Y coordinate" + starty);
	}
}

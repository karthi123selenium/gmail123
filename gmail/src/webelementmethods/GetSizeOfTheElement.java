package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeOfTheElement 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/");
		WebElement nextbutton = driver.findElement(By.xpath("//div [@ class = 'VfPpkd-RLmnJb']"));
		Dimension dim = nextbutton.getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		System.out.println("the size of the height is" + height);
		System.out.println("the size of the width is" + width);
	}

}

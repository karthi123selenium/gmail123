package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAttributeLogoEquals 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.uk/");
		driver.findElement(By.xpath("//div[.='I agree']")).click();
		WebElement image = driver.findElement(By.className("lnXdpd"));
		String logoname = image.getAttribute("alt");
		if(logoname.equals("Google"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
	}

}

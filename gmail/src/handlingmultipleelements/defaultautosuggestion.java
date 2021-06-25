package handlingmultipleelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class defaultautosuggestion 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//div[.='I agree']")).click();
		driver.switchTo().activeElement().click();
		List<WebElement> suggestion = driver.findElements(By.xpath("//li[@class='sbct'and not(@id = 'sbt')]"));
		for(WebElement defaultsuggestion:suggestion)
		{
			if(defaultsuggestion.getText().equals("selenium"))
			{
				defaultsuggestion.click();
				break;
			}
		}
		
	}

}

package handlingmultipleelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestions
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//div[.='I agree']")).click();
		driver.findElement(By.name("q")).sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement> suggestion = driver.findElements(By.xpath("//li[@class='sbct'and not(@id = 'sbt')]"));
		System.out.println(suggestion.size());
		Thread.sleep(3000);

		for(WebElement autosuggestion :suggestion)
		{
			System.out.println(autosuggestion.getText());
			//`Thread.sleep(3000);
			if(autosuggestion.getText().equals("selenium webdriver"))
			{
				autosuggestion.click();
				break;
			}
			
		}	
		
	}

}

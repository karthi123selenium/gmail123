package webelementmethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetScreenShot 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.uk/");
		driver.findElement(By.xpath("//div[.='I agree']")).click();
		File srcfile = driver.findElement(By.className("lnXdpd")).getScreenshotAs(OutputType.FILE);
		File destfile = new File("./errorshots/logo.jpg");
		FileUtils.copyFile(srcfile, destfile);
	}

}

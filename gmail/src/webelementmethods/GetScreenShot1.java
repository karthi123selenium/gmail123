package webelementmethods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetScreenShot1
{
	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://uk.yahoo.com/");
		driver.findElement(By.name("agree")).click();
		File srcfile = driver.findElement(By.id("header-logo")).getScreenshotAs(OutputType.FILE);
		File destfile = new File("./errorshots/logo.jpg");
		FileUtils.copyFile(srcfile, destfile);
	}

}

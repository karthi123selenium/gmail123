package TakePageScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScreenShot
{
	public static void main(String[] args) throws IOException 
	{
		LocalDateTime ldt = LocalDateTime.now();
		String timeslat = ldt.toString().replace(':', '-');
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.microsoft.com/");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);//to take the screenshot//
		File destfile = new File("./errorshots/" + timeslat + "failure2.png");//to store the screenshot and its path//
		FileUtils.copyFile(srcfile, destfile);//copy the screenshot from source to destination//
	}

}

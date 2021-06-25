package takingscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class localdatetime 
{
	public static void main(String[] args) throws IOException
	{
		LocalDateTime ldt = LocalDateTime.now();
		String timefile = ldt.toString().replace(':','-');
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.microsoft.com/");
		File scrfile = driver.findElement(By.id("uhfLogo")).getScreenshotAs(OutputType.FILE);
		File destfile = new File("./errorshots/"+ timefile +"failure1.jpg");
		FileUtils.copyFile(scrfile, destfile);
	}

}

package basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launchingchromebrowser 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	}

}

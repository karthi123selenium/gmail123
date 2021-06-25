package basics;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchingIEBrowser
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
	}

}

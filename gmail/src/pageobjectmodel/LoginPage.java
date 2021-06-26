package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{
	//writing webelements//
	@FindBy(id = "login-username")
	private WebElement username;
	
	@FindBy(id = "login-signin")
	private WebElement login;
	
	@FindBy(xpath = "//label[@for='persistent']")
	private WebElement checkbox;
	
	@FindBy(id = "mbr-forgot-link")
	private WebElement forgotusername;
	
	//writing all the actions on webelements via methods//
	public void login(String un)
	{
		username.sendKeys(un);
		login.click();
	}
	public void remembercheckbox()
	{
		checkbox.click();
	}
	public void clickForgotusername()
	{
		forgotusername.click();
	}
}

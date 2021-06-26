package pageobjectmodel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PasswordPage 
{
	@FindBy(name = "password")
	private WebElement password;
	
	@FindBy(id = "login-signin")
	private WebElement loginbutton;
	
	@FindBy(id = "mbr-forgot-link")
	private WebElement forgotpassword;
	
	public void secret(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void nextbutton()
	{
		loginbutton.click();
	}
	public void clickforgotpwd()
	{
		forgotpassword.click();
	}

}

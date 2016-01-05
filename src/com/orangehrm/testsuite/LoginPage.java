package com.orangehrm.testsuite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Constants {
	@FindBy(id="txtUsername")
	WebElement username;
	public void username()
	{
		username.clear();
	}
	@FindBy(id="txtPassword")
	WebElement password;
	public void password()
	{
		password.clear();
	}
	@FindBy(id="btnLogin")
	WebElement login;
	public void setup(String u,String p)
	{
		username.sendKeys(u);
		password.sendKeys(p);
		login.click();
	}
}

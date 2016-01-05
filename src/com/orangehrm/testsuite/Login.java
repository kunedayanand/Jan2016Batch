package com.orangehrm.testsuite;

import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login extends Constants{
	@Parameters("browser")
	@Test
	public void loginTest(String b) throws IOException
	{
		DesiredCapabilities cap=null;
		if(b.equals("firefox"))
		{
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		
		//driver=new FirefoxDriver();
		driver1= new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		driver1.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver1.get("http://opensource.demo.orangehrm.com");
		driver1.manage().window().maximize();
		LoginPage lp=PageFactory.initElements(driver1,LoginPage.class);
		String runmode=eo.getCellData(dataengine,0,1,2);
		if(runmode.equals("N"))
		{
			throw new SkipException("Login test case skipped");
		}
		else
		{
			lp.setup("Admin","admin");
		}
		
	}
	

}

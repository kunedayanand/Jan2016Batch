package com.orangehrm.testsuite;

import java.io.IOException;

import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Screenshot extends Constants {
	@Test
	public void screenshotTest() throws IOException
	{
		String runmode=eo.getCellData(dataengine,0,3,2);
		if(runmode.equals("N"))
		{
			throw new SkipException("Screenshot test case skipped");
		}
		else
		{	
			Sleeper.sleepTight(2);
			scr.takescreenshot(driver1,screenpath+"\\Addemployee.png");
			Sleeper.sleepTight(2);
		}
	}

}

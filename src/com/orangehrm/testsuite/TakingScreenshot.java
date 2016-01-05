package com.orangehrm.testsuite;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class TakingScreenshot {
	public void takescreenshot(WebDriver driver,String screenpath) throws IOException
	{
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile,new File(screenpath));
		
	}

}

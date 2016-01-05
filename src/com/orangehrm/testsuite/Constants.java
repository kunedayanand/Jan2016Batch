package com.orangehrm.testsuite;




//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Constants {
	//static FirefoxDriver driver=null;
	static RemoteWebDriver driver1=null;
	String path="D:\\Leela\\OrangeHRM\\src\\com\\orangehrm\\excelfiles\\Emplist.xlsx";
	ExcelOperations eo=new ExcelOperations();
	TakingScreenshot scr=new TakingScreenshot();
	 String screenpath="D:\\Leela\\OrangeHRM\\src\\com\\orangehrm\\screenshots";
	 String dataengine="D:\\Leela\\OrangeHRM\\src\\com\\orangehrm\\dataengine\\DataEngine.xlsx";
}

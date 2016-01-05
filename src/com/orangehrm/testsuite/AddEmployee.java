package com.orangehrm.testsuite;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class AddEmployee extends Constants {
	@Test
	public void addEmployeeTest() throws IOException
	{
		String runmode=eo.getCellData(dataengine,0,2,2);
		if(runmode.equals("N"))
		{
			throw new SkipException("Login test case skipped");
		}
		else
		{
			AddEmployeePage aep=PageFactory.initElements(driver1,AddEmployeePage.class);
		int rowcount=eo.getRowCount(path,0);
		for(int i=1;i<=rowcount;i++)
		{
		
			Row r=eo.getRow(path, 0,i);
			Sleeper.sleepTight(2);
			aep.menu.pim();
			Sleeper.sleepTight(2);
			aep.addEmplopyee.click();
			Sleeper.sleepTight(2);
			aep.addEmployee(r);
		}
		}
	}

}

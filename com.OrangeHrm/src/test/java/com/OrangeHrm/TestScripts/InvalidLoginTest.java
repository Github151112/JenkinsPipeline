package com.OrangeHrm.TestScripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Orange.genericLib.BaseTest;
import com.Orange.genericLib.CustomListener;
import com.Orange.pompages.HomePage;
import com.Orange.pompages.LoginPage;


@Listeners(CustomListener.class)
public class InvalidLoginTest extends BaseTest {
	
	
	@DataProvider(name = "TestData")
	public Object[][] invalidTestData()
	{
		Object[][] o = new Object[6][2];
		o[0][0]  = "Aman";
		o[0][1] = "Singh";
		
		o[1][0]  = "Amanjdbcu";
		o[1][1] = "Singhjhdbcuv";
		
		o[2][0]  = "Amanijdcuid";
		o[2][1] = "Singhfhuyhguf";
		
		o[3][0]  = "Amanuihiv";
		o[3][1] = "Singhufgcyt";
		
		o[4][0]  = "Amanjnuchd";
		o[4][1] = "Singhjnhjbdsuhfvyg";
		
		o[5][0]  = "Amahjdbcjhbdscnjnuchd";
		o[5][1] = "Singjhbdckdhhjnhjbdsuhfvyg";
		return o;
	}
	
	@Test(dataProvider = "TestData",groups = "FT")
	public void InvalidLoginIntoDemoWebShop(String username, String password) throws InterruptedException
	{
		//click on login link
		HomePage hp = new HomePage(driver);
		hp.getLoginLink().click();
		//invalid login
		LoginPage lp = new LoginPage(driver);
		lp.invalidloginIntoDemoWebShop(username, password);
	}
	
	
	
	

}

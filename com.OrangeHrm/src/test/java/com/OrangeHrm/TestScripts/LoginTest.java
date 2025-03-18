package com.OrangeHrm.TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Orange.genericLib.BaseTest;
import com.Orange.genericLib.CustomListener;
import com.Orange.genericLib.Reusablity;
import com.Orange.pompages.HomePage;
import com.Orange.pompages.LoginPage;


@Listeners(CustomListener.class)
public class LoginTest extends BaseTest {

	@Test(description = "Verify the user is able to login or not",groups = {"ST","RT"})
	public void login() throws EncryptedDocumentException, IOException, InterruptedException {

		Reusablity r = new Reusablity();
		String username = r.getDataFromExcelSheet(EXCEL_PATH, LOG_SHEET, 1, 0);
		String password = r.getDataFromExcelSheet(EXCEL_PATH, LOG_SHEET, 1, 1);
		// click on login link
		HomePage hp = new HomePage(driver);
		hp.getLoginLink().click();
		LoginPage lp = new LoginPage(driver);
		lp.loginIntoDemoWebShop(username, password);
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop","Home page displayed");
	}

}

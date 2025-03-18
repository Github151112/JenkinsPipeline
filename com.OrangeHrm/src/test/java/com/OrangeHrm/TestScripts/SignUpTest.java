package com.OrangeHrm.TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Orange.genericLib.BaseTest;
import com.Orange.genericLib.Reusablity;
import com.Orange.genericLib.WorkLib;
import com.Orange.pompages.HomePage;
import com.Orange.pompages.RegisterPage;

public class SignUpTest extends BaseTest {
	
	String email = "aman"+WorkLib.getRandomNo()+"@gmail.com";
	

	@Test(description = "verify the user is able to register or not",groups = "IT")
	public void signUp() throws EncryptedDocumentException, IOException, InterruptedException {

		// fetching all the data from excel file
		Reusablity r = new Reusablity();
		String fn = r.getDataFromExcelSheet(EXCEL_PATH, SHEET_NAME, 1, 0);
		String ln = r.getDataFromExcelSheet(EXCEL_PATH, SHEET_NAME, 1, 1);
		//String email = r.getDataFromExcelSheet(EXCEL_PATH, SHEET_NAME, 1, 2);
		String password = r.getDataFromExcelSheet(EXCEL_PATH, SHEET_NAME, 1, 3);
		// click on register link
		HomePage hp = new HomePage(driver);
		hp.getRegisterLink().click();
		
		//using hard assert to verify the registration page
		//Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Register","signup page should be displayed");
		
		//using softassert to verify the resgistration page
		SoftAssert s = new SoftAssert();
		s.assertEquals(driver.getTitle(), "Demo Web Shop. Register","signup page is displayed");
		
		
		// register into the application
		RegisterPage rp = new RegisterPage(driver);
		rp.registerIntoDemoWebShop(fn, ln, email, password);
		
		//use hard assert
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop","Home Page is displayed");
		
		//one cumplosry method in soft assert
		s.assertAll();
		

	}
}

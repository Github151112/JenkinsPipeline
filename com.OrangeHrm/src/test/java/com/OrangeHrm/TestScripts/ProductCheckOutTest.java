package com.OrangeHrm.TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.Orange.genericLib.BaseTest;
import com.Orange.genericLib.Reusablity;
import com.Orange.pompages.CheckOutPage;
import com.Orange.pompages.HomePage;
import com.Orange.pompages.LoginPage;
import com.Orange.pompages.ShoppingCartPage;

public class ProductCheckOutTest  extends BaseTest{
	
	@Test(groups = "RT")
	public void checkOutTest() throws InterruptedException, EncryptedDocumentException, IOException
	{
		//login operation
		Reusablity r = new Reusablity();
		String username = r.getDataFromExcelSheet(EXCEL_PATH, LOG_SHEET, 1, 0);
		String password = r.getDataFromExcelSheet(EXCEL_PATH, LOG_SHEET, 1, 1);
		// click on login link
		HomePage hp = new HomePage(driver);
		hp.getLoginLink().click();
		LoginPage lp = new LoginPage(driver);
		lp.loginIntoDemoWebShop(username, password);
		
		//add the product into cart
		HomePage h = new HomePage(driver);
		h.getProductAddToCartButton().click();
		
		//click on shopping cart Link
		h.getShoppingCartLink().click();
		
		//click on checkbox
		ShoppingCartPage scp = new ShoppingCartPage(driver);
		scp.getTermsOfServicesCheckBox().click();
		scp.getCheckOutButton().click();
		
		//check out operation
		CheckOutPage cop = new CheckOutPage(driver);
		cop.checkOperation();
		
		
		
	}

}

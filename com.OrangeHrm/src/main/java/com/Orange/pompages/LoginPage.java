package com.Orange.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="Email")
	private WebElement emailTextField;
	
	
	@FindBy(id = "Password")
	private WebElement passwordTextField;
	
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;


	public WebElement getEmailTextField() {
		return emailTextField;
	}


	public WebElement getPasswordTextField() {
		return passwordTextField;
	}


	public WebElement getLoginButton() {
		return loginButton;
	}
	
	//business operations
	public void loginIntoDemoWebShop(String username, String password) throws InterruptedException
	{
		emailTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
	}

	public void invalidloginIntoDemoWebShop(String username, String password) throws InterruptedException
	{
		emailTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
		emailTextField.clear();
	}

}

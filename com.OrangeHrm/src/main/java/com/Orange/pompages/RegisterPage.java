package com.Orange.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BaseClass {

	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "gender-male")
	private WebElement maleRadioButton;

	@FindBy(id = "gender-female")
	private WebElement femaleRadioButton;

	@FindBy(id = "FirstName")
	private WebElement firstNameTextField;

	@FindBy(id = "LastName")
	private WebElement lastNameTextField;

	@FindBy(id = "Email")
	private WebElement emailTextField;

	@FindBy(id = "Password")
	private WebElement passwordTextField;

	@FindBy(id = "ConfirmPassword")
	private WebElement confirmPasswordTextField;

	@FindBy(id = "register-button")
	private WebElement registerButton;
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;

	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getConfirmPasswordTextField() {
		return confirmPasswordTextField;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

	// business operations

	public void registerIntoDemoWebShop(String fn, String ln, String email, String password)
			throws InterruptedException {
		maleRadioButton.click();
		firstNameTextField.sendKeys(fn);
		lastNameTextField.sendKeys(ln);
		emailTextField.sendKeys(email);
		Thread.sleep(5000);
		passwordTextField.sendKeys(password);
		confirmPasswordTextField.sendKeys(password);
		registerButton.click();
		continueButton.click();
	}

}

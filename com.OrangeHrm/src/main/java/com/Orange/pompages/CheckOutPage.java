package com.Orange.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BaseClass {

	public CheckOutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(xpath = "//input[@onclick='Billing.save()']")
	private WebElement billingContinueButton;
	
	@FindBy(xpath = "//input[@onclick='Shipping.save()']")
	private WebElement shippingContinueButton;
	
	@FindBy(xpath = "//input[@onclick='ShippingMethod.save()']")
	private WebElement shippingMethodContinueButton;
	
	@FindBy(xpath = "//input[@onclick='PaymentMethod.save()']")
	private WebElement paymentMethodContinueButton;
	
	@FindBy(xpath = "//input[@onclick='PaymentInfo.save()']")
	private WebElement paymentInfoContinueButton;
	
	@FindBy(xpath = "//input[@value='Confirm']")
	private WebElement confirmOrderButton;

	public WebElement getBillingContinueButton() {
		return billingContinueButton;
	}

	public WebElement getShippingContinueButton() {
		return shippingContinueButton;
	}

	public WebElement getShippingMethodContinueButton() {
		return shippingMethodContinueButton;
	}

	public WebElement getPaymentMethodContinueButton() {
		return paymentMethodContinueButton;
	}

	public WebElement getPaymentInfoContinueButton() {
		return paymentInfoContinueButton;
	}

	public WebElement getConfirmOrderButton() {
		return confirmOrderButton;
	}
	
	
	//business operation
	public void checkOperation()
	{
		billingContinueButton.click();
		shippingContinueButton.click();
		shippingMethodContinueButton.click();
		paymentMethodContinueButton.click();
		paymentInfoContinueButton.click();
		confirmOrderButton.click();
	}
	
}

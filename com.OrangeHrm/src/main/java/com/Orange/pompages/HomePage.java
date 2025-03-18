package com.Orange.pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	// register link
	@FindBy(className = "ico-register")
	private WebElement registerLink;

	// log in link
	@FindBy(className = "ico-login")
	private WebElement loginLink;

	// shopping cart
	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shoppingCartLink;

	// wishlist
	@FindBy(xpath = "//span[text()='Wishlist']")
	private WebElement wishListLink;

	// Product
	@FindBy(xpath = "//a[text()='14.1-inch Laptop']/ancestor::div[@class='item-box']/descendant::input[@value='Add to cart']")
	private WebElement productAddToCartButton;

	public WebElement getProductAddToCartButton() {
		return productAddToCartButton;
	}

	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}

	public WebElement getWishListLink() {
		return wishListLink;
	}

}

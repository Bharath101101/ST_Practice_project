package com.sportyShoe.SeleniumCucumberScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath="//input[@id='email']")
	WebElement loginemail;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement loginpwd;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbutn;
	
	@FindBy(linkText="Cart")
	WebElement clickCart;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void user_login() {
		loginemail.sendKeys("Yoru@gmail.com");
		loginpwd.sendKeys("yoru@val");
		loginbutn.click();
	}
	public void click_cart() {
		clickCart.click();
	}
}

package com.sportyShoe.SeleniumCucumberScripts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RegisterPage extends TestBase{
	@FindBy(xpath="//input[@name='name']")
	WebElement registername;
	@FindBy(xpath="//input[@name='email']")
	WebElement registeremail;
	@FindBy(xpath="//input[@name='password']")
	WebElement registerpassword;

	@FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement registerbutton;
	
	@FindBy(xpath="//div[@class='mt-4 p-5 bg-primary text-white rounded']/descendant::p[3]")
	WebElement userText;
	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void register_user() {
		registername.sendKeys("yoru");
		registeremail.sendKeys("Yoru@gmail.com");
		registerpassword.sendKeys("yoru@val");
		registerbutton.click();
		
	}
	public String validate_reg_URL() {
		String register_Url=driver.getCurrentUrl();
		return register_Url;
		
	}
	public String validate_reg_text() {
		String user_name=userText.getText();
		return user_name;
	}
	
}

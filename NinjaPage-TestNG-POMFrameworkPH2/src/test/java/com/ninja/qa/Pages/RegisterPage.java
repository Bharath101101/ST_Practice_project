package com.ninja.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement firstname;
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement lastname;
	@FindBy(xpath="//input[@id='input-email']")
	WebElement email;
	@FindBy(xpath="//input[@name='telephone']")
	WebElement telephone;
	@FindBy(xpath="//input[@id='input-password']")
	WebElement passwd;
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement confirmpasswd;
	@FindBy(xpath="(//input[@name='newsletter'])[1]")
	WebElement subbutton;
	@FindBy(xpath="//input[@name='agree']")
	WebElement polocycheckbox;
	@FindBy(xpath="//input[@type='submit']")
	WebElement continuebttn;
	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void registeruser(String fname,String lname,String emailid,String phone,String password,String cpass) throws InterruptedException {
		firstname.clear();
		firstname.sendKeys(fname);
		lastname.clear();
		lastname.sendKeys(lname);
		email.clear();
		email.sendKeys(emailid);
		telephone.clear();
		telephone.sendKeys(phone);
		passwd.clear();
		passwd.sendKeys(password);
		confirmpasswd.clear();
		confirmpasswd.sendKeys(cpass);
		subbutton.click();
		Thread.sleep(1500);
		continuebttn.click();
	}
}

package com.ninja.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ninja.qa.Base.TestBase;

public class Homepage extends TestBase{
	Actions a =  new Actions(driver);
	@FindBy(xpath="//span[text()='My Account']")
	WebElement myaccount;
	
	@FindBy(xpath="//a[text()='Register']")
	WebElement register;
	
	@FindBy(xpath="//a[text()='Login']")
	WebElement login;
	
	@FindBy(xpath="//a[text()='(//li[@class='dropdown'])[2]/child::a']")
	WebElement desktop;
	
	@FindBy(linkText="Mac (1)")
	WebElement macdropdown;
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	public void gettitle() {
		String title =driver.getTitle();
		System.out.println(title);
	}
	public void clickonmyAccount() {
		myaccount.click();
	}
	public void clickonLogin() {
		login.click();
	}
	public void clickonRegister() {
		register.click();
	}
	public void clickonMac() throws InterruptedException {
		a.moveToElement(desktop).build().perform();
		Thread.sleep(1500);
	}
}
	


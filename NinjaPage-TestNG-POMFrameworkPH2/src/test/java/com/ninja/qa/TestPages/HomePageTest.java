package com.ninja.qa.TestPages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ninja.qa.Base.TestBase;
import com.ninja.qa.Pages.Homepage;

public class HomePageTest extends TestBase{
	Homepage hp;
	
	@BeforeMethod
	public void OpenApp() {
		openBrowser();
		hp=new Homepage(driver);
	}
	@AfterMethod
	public void closeApp() {
		driver.quit();
	}
	@Test(priority='1')
	public void testTitle() {
		hp.gettitle();
	}
	@Test(priority='2')
	public void testRegister() {
		hp.clickonmyAccount();
		hp.clickonRegister();
		hp.gettitle();
	}
	
	@Test(priority='3')
	public void testLoginLink() {
		hp.clickonmyAccount();
		hp.clickonRegister();
		hp.gettitle();
	}
	@Test(priority='4')
	public void testMacLink() throws InterruptedException {
		hp.clickonMac();
		hp.gettitle();
	}

}

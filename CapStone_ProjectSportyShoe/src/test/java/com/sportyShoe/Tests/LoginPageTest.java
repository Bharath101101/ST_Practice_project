package com.sportyShoe.Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

import com.sportyShoe.SeleniumCucumberScripts.HomePage;
import com.sportyShoe.SeleniumCucumberScripts.LoginPage;
import com.sportyShoe.SeleniumCucumberScripts.RegisterPage;
import com.sportyShoe.SeleniumCucumberScripts.TestBase;

public class LoginPageTest extends TestBase {
	HomePage hp;
	RegisterPage rp;
	LoginPage lp;
	@BeforeTest
	public void start_browser() {
		OpenBrowser("Chrome");
		hp=new HomePage(driver);
		rp=new RegisterPage(driver);
		lp=new LoginPage(driver);
	}
	@Test(priority='1')
	public void test_login()
	{
		lp.user_login();
	}
	@Test(priority='2')
	public void test_getTitle() {
		String expected="http://localhost:9010/login";
		String actual= hp.getURL(driver);
		Assert.assertEquals(actual, expected);
	}
}

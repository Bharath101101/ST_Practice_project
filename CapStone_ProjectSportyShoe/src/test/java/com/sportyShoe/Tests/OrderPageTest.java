package com.sportyShoe.Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sportyShoe.SeleniumCucumberScripts.HomePage;
import com.sportyShoe.SeleniumCucumberScripts.LoginPage;
import com.sportyShoe.SeleniumCucumberScripts.OrderPage;
import com.sportyShoe.SeleniumCucumberScripts.RegisterPage;
import com.sportyShoe.SeleniumCucumberScripts.TestBase;

public class OrderPageTest extends TestBase{
	HomePage hp;
	RegisterPage rp;
	LoginPage lp;
	OrderPage op;
	
	@BeforeTest
	public void start_browser()
	{
		OpenBrowser("Chrome");
		hp = new HomePage(driver);
		rp = new RegisterPage(driver);
		lp = new LoginPage(driver);
		op = new OrderPage(driver);
	}

	
	@Test(priority='1')
	public void test_login()
	{
		lp.user_login();
	}
	
	@Test(priority='2')

	public void test_click_orders()
	{
		op.click_orderPage();
	}

	
	@Test(priority='3')
	public void test_getTitle_page()
	{
		String expected = "http://localhost:9010/orders";
		String Actual = hp.getURL(driver);
		Assert.assertEquals(Actual, expected);
		
	}
}

package com.sportyShoe.Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sportyShoe.SeleniumCucumberScripts.AddingToCart;
import com.sportyShoe.SeleniumCucumberScripts.HomePage;
import com.sportyShoe.SeleniumCucumberScripts.LoginPage;
import com.sportyShoe.SeleniumCucumberScripts.RegisterPage;
import com.sportyShoe.SeleniumCucumberScripts.TestBase;

public class AddingToCartTest extends TestBase{
	HomePage hp;
	RegisterPage rp;
	LoginPage lp;
	AddingToCart ac;
	
	@BeforeTest
	public void start_browser()
	{
		OpenBrowser("Chrome");
		hp = new HomePage(driver);
		rp = new RegisterPage(driver);
		lp = new LoginPage(driver);
		ac = new AddingToCart(driver);
	}
	
	@Test(priority='1')
	public void test_login()
	{
		lp.user_login();
	}
	

	@Test(priority='2')
	public void test_add_product_to_cart() throws InterruptedException
	{
		ac.add_product_to_cart();
	}
	
	@Test(priority='3')
	public void test_validate_success_message()
	{
		String expected = "Message:Shoe BlueWave Running Shoes Added Successfully to Cart";
	String actualText=	ac.validate_success_message();
	Assert.assertEquals(actualText, expected);
	}

}

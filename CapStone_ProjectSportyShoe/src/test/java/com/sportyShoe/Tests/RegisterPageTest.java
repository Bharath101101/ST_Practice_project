package com.sportyShoe.Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import com.sportyShoe.SeleniumCucumberScripts.HomePage;
import com.sportyShoe.SeleniumCucumberScripts.RegisterPage;
import com.sportyShoe.SeleniumCucumberScripts.TestBase;

public class RegisterPageTest extends TestBase{
	HomePage hp;
	RegisterPage rp;
	
	@BeforeTest
	public void start_browser() {
		OpenBrowser("Chrome");
		hp=new HomePage(driver);
		rp=new RegisterPage(driver);
	}
	@Test
	public void test_click_reg_link() throws InterruptedException {
		Thread.sleep(1500);
		hp.click_reg_link();
	}
	@Test
	public void test_getTitle() {
		String expected="http://localhost:9010/register";
		String actual=hp.getURL(driver);
		Assert.assertEquals(actual, expected);
		
	}
	@Test(priority='3')
	public void Test_register_user()
	{
		rp.register_user();
	}
	
	@Test(priority='4')
	public void Test_validate_registration_URL()
	{
		String expected = "http://localhost:9010/register-user";
		String Actual = rp.validate_reg_URL();
		assertEquals(Actual, expected);
	}
	
@Test(priority='5')
	
	public void Test_validate_registration_Text()
	{
		String expected = "Hello yoru !";
		String actualText = rp.validate_reg_text();
		Assert.assertEquals(actualText, expected);
	}
}

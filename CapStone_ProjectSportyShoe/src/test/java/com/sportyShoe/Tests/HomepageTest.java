package com.sportyShoe.Tests;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import com.sportyShoe.SeleniumCucumberScripts.HomePage;
import com.sportyShoe.SeleniumCucumberScripts.TestBase;



public class HomepageTest extends TestBase{
	HomePage hp;
	@BeforeTest
	public void start_browser() {
		OpenBrowser("Chrome");
		hp=new HomePage(driver);
	}
	@Test(priority='1')
	public void test_getTitle_page() throws InterruptedException {
		String expected="http://localhost:9010/";
		String actual=hp.getURL(driver);
		assertEquals(actual, expected);
		Thread.sleep(2000);
	}
	
	@Test(priority='2')
	public void Test_validate_text_on_page() {
		String expected="Powered By Simplilearn";
		String actualText=hp.Validate_text();
		assertEquals(actualText,expected);
	}
	@Test(priority='3')
	public void test_click_register_link() throws InterruptedException
	{
		Thread.sleep(1500);
		hp.click_reg_link();
	}
}

package com.app.TestNG.ExtentReports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends BaseTest{
	@Test
	public void  method() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%3ASign+up");
		
		Thread.sleep(1000);
		String expected="Wiki Login";
		String actual=driver.getTitle();
		Assert.assertEquals(actual, expected,"They donot match");
		
	}
	@Test
	public void  method2() {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input#email")).sendKeys("admin@gmail.com");
		extenttest.info("Entered valid URL");
		
	}
	@Test
	public void  method3() {
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		extenttest.info("Navigated to the URL");
		driver.findElement(By.id("login1")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("Admin");
		
	}
}

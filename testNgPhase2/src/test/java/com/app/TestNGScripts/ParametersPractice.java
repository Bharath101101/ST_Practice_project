package com.app.TestNGScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersPractice {
	WebDriver driver;
	@BeforeTest
	public void openBrowser(String browser) {
		if(browser=="Chrome") {
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get("");
	}
	@Parameters({"username","password"})
	@Test
	public void login(String username,String password) {
		driver.findElement(By.id("idName1")).sendKeys(username);
		driver.findElement(By.id("idPassword1")).sendKeys(password);
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}

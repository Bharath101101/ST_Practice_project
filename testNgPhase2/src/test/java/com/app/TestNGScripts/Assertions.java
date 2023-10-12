package com.app.TestNGScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Assertions {
	WebDriver driver;
	@BeforeClass
	public void openBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
	}
	@Test(priority='1')
	public void GetTitle() {
		String expectedtitle="Your Store";
		String actualtitle=driver.getTitle();
		Assert.assertEquals(actualtitle, expectedtitle, "The Title do not match");
		boolean search =driver.findElement(By.name("search")).isDisplayed();
		Assert.assertTrue(search);
		driver.findElement(By.name("search")).sendKeys("Mac");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
	}
	
}

package com.app.PhaseEndProject;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class AmazonAutomation {
WebDriver driver;
	
	@BeforeAll
	public void startbrowser()
	{
        driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	@ParameterizedTest(name="CSV Source {arguments}")
	@CsvSource({"Admin,1234",
				"Admin2,123424",
				"Admin3,23245",
				"Admin4,34350"})
	public void Testmethod(String username,String pwd)
	{
        driver.findElement(By.cssSelector("input#email")).sendKeys(username);
		
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys(pwd);
		driver.findElement(By.cssSelector("input#email")).clear();
		driver.findElement(By.cssSelector("input[name='pass']")).clear();
	}

	
	@AfterAll
	public void closebrowser()
	{
		driver.close();
	}
	
}


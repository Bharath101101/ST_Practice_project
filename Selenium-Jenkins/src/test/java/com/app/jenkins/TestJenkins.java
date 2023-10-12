package com.app.jenkins;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestJenkins {
	public class Seleniumtest1 {
		
		@Test
		public void method1() throws InterruptedException
		{

			
			WebDriver driver = new ChromeDriver();
			
			// Maximize the browser window
			
			driver.manage().window().maximize();
			
			//1. Open the url on the browser
			
			driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
			
			driver.findElement(By.xpath("//div[@class='floatL leftwidth']/descendant::input[3]")).click();
			
			Thread.sleep(3000);
			
			Alert a= driver.switchTo().alert();
			
			System.out.println(	a.getText());
			
			Thread.sleep(2000);
			
			a.accept();  
			
			driver.findElement(By.xpath("//div[@class=\"table\"]/descendant::input[1]")).clear();
			driver.findElement(By.xpath("//div[@class=\"table\"]/descendant::input[1]")).sendKeys("Bharath");	
		

		}

	}
}

package Node_Hub;


import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class base {
	WebDriver driver;
	@Test
	public void Grid1() throws MalformedURLException, InterruptedException {
		ChromeOptions cap=new ChromeOptions();
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		driver.manage().window().maximize();
		driver.get(" http://demowebshop.tricentis.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("//input[@id='gender-male']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Admin@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("123456");
		Thread.sleep(2000);
		driver.close();
		
	}

}

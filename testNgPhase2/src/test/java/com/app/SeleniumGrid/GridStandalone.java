package com.app.SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridStandalone {
	WebDriver driver;
	@Test
	public void Grid1() throws MalformedURLException {
		ChromeOptions cap=new ChromeOptions();
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		String title = driver.getTitle();
		System.out.println(title);
	}
}
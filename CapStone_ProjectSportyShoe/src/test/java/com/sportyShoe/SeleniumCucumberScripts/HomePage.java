package com.sportyShoe.SeleniumCucumberScripts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends TestBase {
	WebDriver driver;
	@FindBy(xpath = "//div[@class='container mt-3']/descendant::p[1]")
	WebElement text;
	@FindBy(linkText="New User? Register Here")
	WebElement registerlink;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public String getURL(WebDriver driver) {
		this.driver = driver;
		String URL = driver.getCurrentUrl();
		return URL;
	}
	public String Validate_text() {
		String pageText=text.getText();
		return pageText;
		}
	public void click_reg_link() {
		registerlink.click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * @Test(priority='1') public void openbrowser() { driver= new ChromeDriver();
	 * driver.get("http://localhost:9010/"); driver.manage().window().maximize(); }
	 * 
	 * @Test(priority='2') public void loginPage() {
	 * driver.findElement(By.xpath("//input[@id='email']")).sendKeys(
	 * "sample@gmail.com");
	 * driver.findElement(By.xpath("//input[@id='password']")).sendKeys("sample");
	 * driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click(); }
	 */
}

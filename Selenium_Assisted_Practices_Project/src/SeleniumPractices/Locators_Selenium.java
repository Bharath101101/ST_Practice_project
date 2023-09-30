package SeleniumPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Selenium {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// Open a Chrome browser
		//Webdriver -- is an interface
		//chromeDriver ==> implementing class of WebDriver
		//Driver is the object
		
	WebDriver driver = new ChromeDriver(); // open the browser
	driver.manage().window().maximize();
	
	// In the browser ==> enter a URL
	// For any automation on webpage-- selenium gives lots of methods
	// Browser related methods
	// 1. get("url"): this method will enter the URL in the browser window
	
     driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%25253ASign+up");
     
     boolean displayed= driver.findElement(By.id("wpName2")).isDisplayed();
     System.out.println(displayed);
     boolean enabled=driver.findElement(By.id("wpName2")).isEnabled();
     System.out.println(enabled);
     driver.findElement(By.id("wpName2")).sendKeys("Admin");
     
     WebElement password=driver.findElement(By.id("wpPassword2"));
     
     displayed=password.isDisplayed();
     System.out.println(displayed);
     enabled=password.isEnabled();
     System.out.println(enabled);
     password.sendKeys("Admin@120");
     
     WebElement Confirmpassword=driver.findElement(By.name("retype"));
     Confirmpassword.isDisplayed(); 
     Confirmpassword.isEnabled();
     Confirmpassword.sendKeys("Admin@120");
     
     WebElement email=driver.findElement(By.name("email"));
     email.sendKeys("Admin@120");
     
	}

}

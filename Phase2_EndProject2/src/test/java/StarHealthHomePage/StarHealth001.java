package StarHealthHomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class StarHealth001 {

	WebDriver driver;
	
@BeforeTest
public void startbrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.starhealth.in/");
	}
@Test(priority='1')
public void valLogo() { 
	WebElement logo=driver.findElement(By.xpath("//img[@alt='Star Health Logo']"));
	String actual=logo.getAttribute("alt");
	Assert.assertEquals(actual,"Star Health Logo");
	System.out.println("Logo syncs with alt");
}
@Test(priority='2')
public void hoverovertoPlans() {
	WebElement hover=driver.findElement(By.xpath("//div[@class='flex cursor-pointer pr-30 cursor-pointer nav-link flex']"));
	Actions a=new Actions(driver);
	a.moveToElement(hover).perform();
	driver.findElement(By.xpath("(//div[@class='mb-20 flex align-center cursor-pointer menu-links'])[2]/child::*[2]")).click();
	
}
@Test(priority='3')
@Parameters({"name","mobile","pincode"})
public void fillingForm(String name,String mobile,String pincode) throws InterruptedException {
	WebElement Name1=driver.findElement(By.id("name"));
	Name1.sendKeys(name);
	WebElement Phone1=driver.findElement(By.id("phoneNumber"));
	Phone1.sendKeys("mobile");
	WebElement Pin1=driver.findElement(By.id("pinCode"));
	Pin1.sendKeys("pincode");
	Thread.sleep(5000);
	//a[@class='mr-4 mr-10-xs'][1]
}

@AfterTest
public void close_all_the_browsers() {
   driver.close();
}

}

package SeleniumPractices;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Alert a= driver.switchTo().alert();
		a.accept();
		Thread.sleep(1500);
		driver.findElement(By.id("login1")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("Admin@123");

	}

}

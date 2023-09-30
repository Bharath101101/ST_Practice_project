package SeleniumPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextPartialText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		
	     driver.get("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%25253ASign+up");
	     
	     driver.findElement(By.linkText("Log in")).click();
	     driver.findElement(By.id("wpName1")).sendKeys("Admin");
	     driver.findElement(By.id("wpPassword1")).sendKeys("Admin@1020");
	     driver.findElement(By.name("wpRemember")).click();
	     Thread.sleep(1500);
	     driver.findElement(By.name("wploginattempt")).click();
	     Thread.sleep(1500);
	     driver.findElement(By.partialLinkText("account")).click();
	     
	}

}

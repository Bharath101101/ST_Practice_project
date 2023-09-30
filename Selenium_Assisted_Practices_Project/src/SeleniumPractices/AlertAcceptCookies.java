package SeleniumPractices;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertAcceptCookies {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.get("https://opera.com/download");
		//driver.findElement(By.xpath("//div[@class='text-level-5']/descendant::span[1]")).click();	
		driver.get("https://www.flipkart.com/");
		WebElement e1=driver.findElement(By.xpath("//input[@class='_18u87m _3WuvDp']"));
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='_18u87m _3WuvDp']")));
		e1.sendKeys("3434353666");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();

	}

}

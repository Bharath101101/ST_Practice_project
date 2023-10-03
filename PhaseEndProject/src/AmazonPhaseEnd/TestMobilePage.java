package AmazonPhaseEnd;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMobilePage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method 
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13");
		
		driver.findElement(By.id("twotabsearchtextbox")).submit();
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("(//div[@class='a-section'])[2]/descendant::span[11]")).click();
		 ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			
			
			driver.switchTo().window(tabs.get(1));
			
			Thread.sleep(1500);
			
			
			driver.findElement(By.id("wishlistButtonStack")).click();
			Thread.sleep(5000);
			
			driver.quit();
		
		

	}

}

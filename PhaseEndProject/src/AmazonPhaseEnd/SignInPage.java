package AmazonPhaseEnd;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SignInPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		
		WebElement e1 = driver.findElement(By.xpath("//*[@class='nav-line-2 ']"));
		Actions a = new Actions(driver);
		a.moveToElement(e1).perform();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id(("ap_email"))).sendKeys("7416290609");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ap_password")).sendKeys("Admin@123");
		driver.findElement(By.id("signInSubmit")).click();
		String text=driver.findElement(By.xpath("//div[@class='a-box-inner a-alert-container']/descendant::span")).getText();
		System.out.println(text);
		driver.close();

	}

}

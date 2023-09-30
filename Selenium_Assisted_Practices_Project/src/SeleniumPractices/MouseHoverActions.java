package SeleniumPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		driver.get("https://www.simplilearn.com/");
		WebElement e1=driver.findElement(By.xpath("//div[@id='menu-button']/descendant::span[2]"));
		Actions a=new Actions(driver);
		a.moveToElement(e1).perform();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//div[@class='menu-master-prg']/descendant::a")).click();
	}

}

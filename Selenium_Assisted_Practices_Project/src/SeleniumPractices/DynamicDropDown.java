package SeleniumPractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://in.search.yahoo.com/");
		driver.findElement(By.xpath("//input[@id='yschsp']")).sendKeys("Simplilearn");
		Thread.sleep(2000);
		
		List<WebElement> li= driver.findElements(By.xpath("//ul[@class='sa-list']/descendant::li"));
		System.out.println(li.size());
		for(int i=0;i<li.size();i++) {
			String text=li.get(i).getText();
			System.out.println(text);
			if(text.contains("free courses")) {
				li.get(i).click();
			}
		}

	}

}

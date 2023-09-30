package SeleniumPractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathPractices {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		
	     driver.get("https://ironspider.ca/forms/dropdowns.htm");
	     
	     WebElement e1= driver.findElement(By.xpath("//select[@name='coffee']"));
	     
	     Select dd = new Select(e1);
	     
	     dd.selectByIndex(1);
	     Thread.sleep(1500);
	     dd.selectByValue("cream");
	     Thread.sleep(1500);
	     dd.selectByVisibleText("Crisp (har har...)");
	     
	     List<WebElement> li =dd.getOptions();
	     System.out.println(li.size());
	     
	     for(WebElement l: li) 
		 {
			 System.out.println(l.getText());
		 }
	}

}

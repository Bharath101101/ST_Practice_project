package SeleniumPractices;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTabs {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		driver.get("https://www.simplilearn.com/");
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		ArrayList<String> a1= new ArrayList<String>(driver.getWindowHandles());
		System.out.println(a1);
		driver.switchTo().window(a1.get(1));
		driver.get("https://www.facebook.com/");
		Thread.sleep(1200);
		driver.close();
		

	}

}

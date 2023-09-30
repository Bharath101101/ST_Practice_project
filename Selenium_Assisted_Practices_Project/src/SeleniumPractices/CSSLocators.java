package SeleniumPractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input#email")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("admin@123");
		Thread.sleep(1500);
		driver.get("https://en.wikipedia.org/w/index.php?title=Special:UserLogin&returnto=Wikipedia%25253ASign+up");
		String innertext=driver.findElement(By.cssSelector("#userloginForm > form > div > div.mw-htmlform-field-HTMLTextField.loginText.mw-userlogin-username.mw-ui-vform-field > label")).getText();
		System.out.println(innertext);
		
	}
	

}

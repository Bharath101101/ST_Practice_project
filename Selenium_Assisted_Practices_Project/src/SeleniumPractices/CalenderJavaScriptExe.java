package SeleniumPractices;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderJavaScriptExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		//driver.get("https://www.redbus.com/");
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("document.getElementById('datepicker').value='09/08/2024'");
		//js.executeScript("document.getElementById('onward_cal').value='09/08/2024'");
		
			}

}

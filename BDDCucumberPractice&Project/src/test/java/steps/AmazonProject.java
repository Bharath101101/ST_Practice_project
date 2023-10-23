package steps;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AmazonProject {
	WebDriver driver;
	@Given("user enters the amazon web page")
	public void user_enters_the_amazon_web_page() {
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in");
	}
	@Then("User hovers on some elements")
	public void user_hovers_on_some_elements() {
		WebElement e1 = driver.findElement(By.xpath("//*[@class='nav-line-2 ']"));
		Actions a = new Actions(driver);
		a.moveToElement(e1).perform();
	}


	@Then("user clicks on signin")
	public void user_clicks_on_signin() {
		driver.findElement(By.linkText("Sign in")).click();
	}
	@Then("User enters Mobile Number")
	public void User_enters_Mobile_Number(DataTable dataTable) {
List<List<String>> userList = dataTable.asLists(String.class);
		
		for(List<String> e : userList)
		{
			// System.out.println(e);
			driver.findElement(By.id(("ap_email"))).sendKeys(e.get(0));
			driver.findElement(By.xpath("//input[@id='continue']")).click();
			driver.findElement(By.id("ap_password")).sendKeys(e.get(1));
		}
			 
		}

	@Then("user clicks on Sign in")
	public void user_clicks_on_Sign_in() {
		driver.findElement(By.id("signInSubmit")).click();
	}
	@Then("Print Error message")
	public void print_Error_message() {
		String text=driver.findElement(By.xpath("//div[@class='a-box-inner a-alert-container']/descendant::span")).getText();
		System.out.println(text);
	}

	@Then("Close the Browser")
	public void close_the_browser() {
	    driver.close();
	}
}

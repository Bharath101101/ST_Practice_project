package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HookStepDemo {
	@Given("User is on main page")
	public void user_is_on_main_page() {
		System.out.println("Yes,im on the main page");
	    
	}

	@Then("User Enters username")
	public void user_enters_username() {
		BaseHooks.driver.findElement(By.xpath("")).sendKeys("Admin");
	    
	}

	@Then("User Enters password")
	public void user_enters_password() {
		BaseHooks.driver.findElement(By.xpath("")).sendKeys("Admin@1233");
	}

	@When("User clicks on login page")
	public void user_clicks_on_login_page() {
		BaseHooks.driver.findElement(By.xpath("(//span[text()='Log in'])[1]")).click();
	}

	@Then("User clicks on check box on login page")
	public void user_clicks_on_check_box_on_login_page() {
		BaseHooks.driver.findElement(By.xpath("//input[@name='wpRemember']")).click();
	}

	@Then("User clicks on forgot your passowrd Link")
	public void user_clicks_on_forgot_your_passowrd_link() {
		BaseHooks.driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
	}

}

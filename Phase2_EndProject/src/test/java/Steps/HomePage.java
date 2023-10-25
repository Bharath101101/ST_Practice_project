package Steps;



import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;

import java.util.List;

import org.junit.Assert;





public class HomePage {
	WebDriver driver;

	@Test
	public void user_on_main_page() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.starhealth.in/");
	
	}
	
	@Test
	public void user_clicks_on_buy_now() {
	   driver.findElement(By.xpath("//span[@class='btn-text']")).click();
	}

	@Test
	public void user_enters_following_details(DataTable dataTable ) {

List<List<String>> userList = dataTable.asLists(String.class);
		
		for(List<String> e : userList)
		{
			// System.out.println(e);
			driver.findElement(By.xpath("//input[@id='name']"))
			.sendKeys(e.get(0));
			driver.findElement(By.xpath("//input[@id='contact_no']"))
			.sendKeys(e.get(1));
			driver.findElement(By.xpath("//input[@id='pinCode']"))
			.sendKeys(e.get(2));
			
			 
		}
	}

	@Test
	public void user_selects_from_dropdown() {
		driver.findElement(By.xpath("//div[@id='grouped-select']")).click();
		driver.findElement(By.xpath("//li[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button']")).click();
	    
	}
	@Test
	public void validate_the_user_mobile_number() {
		String Actualval=driver.findElement(By.xpath("//input[@id='contact_no']")).getAttribute("value");
	    String Expectedval="9848223311";
	    Assert.assertEquals(Actualval, Expectedval);
	    
	}

	@Test
	public void user_clicks_on_the_star_health_logo() {
		driver.findElement(By.cssSelector("jss341")).click();
;	}
	@Test
	public void close_all_the_browsers() {
	   driver.close();
	}
}

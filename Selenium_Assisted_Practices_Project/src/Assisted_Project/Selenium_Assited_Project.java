package Assisted_Project;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium_Assited_Project {

	public static void main(String[] args) throws InterruptedException, IOException, SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.redbus.com");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		//JDBC Connection to selenium scripts which takes title & URL into the database
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		String dburl = "jdbc:mysql://localhost:3306/seleniumtest";
		String username = "root";
		String password = "12345";
		Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(dburl,username,password);
			PreparedStatement ps = con.prepareStatement("insert into webtest values(?,?)"); // execute query
			ps.setString(1,title);
			ps.setString(2,url);
			ps.executeUpdate();
		
		//Finding the webElements and sending the values to it.
		driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[1]")).sendKeys("London, United Kingdom");
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//div[@class='autoFill autosuggest-ul rdc-src']/descendant::li[3]")).click();
		//driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[2]")).clear();
		driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[2]")).sendKeys("Mumbai, Maharashtra, India");
		//driver.findElement(By.xpath("//div[@class='autoFill autosuggest-ul rdc-dest']/descendant::li[3]")).click();
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("document.getElementById('onward_cal').value='5/10/2023'");
		Thread.sleep(1500);
		
		driver.findElement(By.id("date-box")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='DatePicker__CalendarContainer-sc-1x9sb82-0 bkhtIz']/descendant::span[41]")).click();
		driver.findElement(By.id("search_butn")).click();
		
		//driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		//Taking Screenshots Of the elements through the selenium.
		File srcfile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination =new File("./ProjectScreenShots/P1.png");
		FileUtils.copyFile(srcfile,destination);
			
		//Performing Hover actions on the elements.
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement e1 = driver.findElement(By.xpath("//*[@class='nav-line-2 ']"));
		Actions a = new Actions(driver);
		a.moveToElement(e1).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='nav-text'])[7]")).click();
		
		
		//Uploading Files via AutoIt 
		driver.get("https://www.remove.bg/");
		title= driver.getTitle();
		
		url = driver.getCurrentUrl();
		
		ps = con.prepareStatement("insert into webtest values(?,?)"); // execute query
		ps.setString(1,title);
		ps.setString(2,url);
		ps.executeUpdate();
		con.close();
		
		Thread.sleep(2000);
		WebElement e2=driver.findElement(By.xpath("//div[@class='mx-auto w-full px-8 max-w-5xl relative']/descendant::button[1]"));
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='mx-auto w-full px-8 max-w-5xl relative']/descendant::button[1]")));
		e2.click();
		Runtime.getRuntime().exec("C:\\Users\\bhara\\Desktop\\AutoIt1st.exe");
	}

}

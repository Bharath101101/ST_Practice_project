package StarHealthHomePage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class StarHealth002 {
	WebDriver driver;

    @BeforeTest
    public void printStarHealthLinks() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.starhealth.in/");
    }
        @Test
        public void links() {
        List<WebElement> links = driver.findElements(By.tagName("a"));
        for (WebElement link : links) {
            System.out.println("Link Text: " + link.getText());
            System.out.println("URL: " + link.getAttribute("href"));
            System.out.println("------------------------");
        }
  }
@AfterTest
public void teadrdown() {
        driver.quit();
    }
}

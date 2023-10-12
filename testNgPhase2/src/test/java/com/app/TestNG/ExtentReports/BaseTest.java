package com.app.TestNG.ExtentReports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseTest {
	public static WebDriver driver;
	public static ExtentReports extentrepo;
	public static ExtentTest extenttest;
	
	@BeforeTest
	public void openBrowser(ITestContext context) {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		extenttest = extentrepo.createTest(context.getName());
	}
	@AfterTest
	public void closebrowser() {
		driver.quit();
		
	}
	@BeforeSuite
	public void initializeExtentReport() {
		ExtentSparkReporter sparkrepo =new ExtentSparkReporter("report3.html");
		extentrepo =new ExtentReports();
		extentrepo.attachReporter(sparkrepo);
		extentrepo.setSystemInfo("OS", System.getProperty("os.name"));
		extentrepo.setSystemInfo("JAVA", System.getProperty("java.version"));
	}
	@AfterSuite
	public void generatereport() throws IOException {
		extentrepo.flush();
		Desktop.getDesktop().browse(new File("report3.html").toURI());
	}

	@AfterMethod
	public void generateTestStatus(Method m,ITestResult result)
	{
		if(result.getStatus() == ITestResult.FAILURE )
		{
			System.out.println("Capture Screenshot");
			extenttest.fail(result.getThrowable());
		}
		else if (result.getStatus() == ITestResult.SUCCESS) {
			extenttest.pass(m.getName() + " is passed");
		}
	}
}

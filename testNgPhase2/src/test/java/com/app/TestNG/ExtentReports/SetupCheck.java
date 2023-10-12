package com.app.TestNG.ExtentReports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class SetupCheck {
	public void extentdemo() {
		ExtentReports ex=new ExtentReports();
		ExtentSparkReporter sparkreporter = new ExtentSparkReporter("C:\\Users\\bhara\\eclipse-workspace\\testNgPhase2\\extentReport\\report.html");
		ex.attachReporter(sparkreporter);
		ex.flush();
	}
	@Test
	public void extentdemo2() throws IOException {
		ExtentReports ex=new ExtentReports();
		File file=new File("reprt2.html");
		ExtentSparkReporter sparkreporter = new ExtentSparkReporter(file);
		ex.attachReporter(sparkreporter);
		ex.flush();
		Desktop.getDesktop().browse(new File("report1.html").toURI());
		
	}

}

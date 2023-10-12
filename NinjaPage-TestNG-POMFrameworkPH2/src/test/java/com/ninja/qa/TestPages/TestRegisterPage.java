package com.ninja.qa.TestPages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ninja.qa.Base.TestBase;
import com.ninja.qa.Pages.Homepage;
import com.ninja.qa.Pages.RegisterPage;
import com.ninja.qa.Utitlites.Xls_DataProvider;

public class TestRegisterPage extends TestBase{
	Homepage hp;
	RegisterPage rp;
		@BeforeMethod
		public void OpenApp()
		{
			openBrowser();
			hp = new Homepage(driver);
			rp = new RegisterPage(driver);
		}
		
		
		@AfterMethod
		public void CloseApp()
		{
			driver.quit();
		}
		
		
		@Test(priority='1', dataProvider="Testdata1")
		public void testregisterUser(String name,String lname,String email,String ph,String password,String cpasswd) throws InterruptedException
		{
			hp.clickonmyAccount();
			hp.clickonRegister();
			rp.registeruser(name,lname,email,ph,password,cpasswd);
		}
		
		@DataProvider(name="Testdata1")
		public Object[][] datasupplier() throws EncryptedDocumentException, IOException
		{
			
			Object[] [] input = Xls_DataProvider.getTestData("Sheet1");
			return input;
			
		}}

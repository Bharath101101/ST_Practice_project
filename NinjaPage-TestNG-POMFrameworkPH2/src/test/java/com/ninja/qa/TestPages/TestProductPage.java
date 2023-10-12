package com.ninja.qa.TestPages;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.ninja.qa.Base.TestBase;
import com.ninja.qa.Pages.ProductPage;
import com.ninja.qa.Pages.SearchPage;

public class TestProductPage extends TestBase{
	
	SearchPage sp;
	ProductPage pp;
	
	@BeforeMethod
	public void OpenApp() {
		openBrowser();
		sp=new SearchPage(driver);
		pp=new ProductPage(driver);
		
		
	}
	@AfterMethod
	public void CloseApp() {
		driver.quit();
	}

public void testproduct_addtocart() throws InterruptedException {
	sp.searchproduct();
	Thread.sleep(1500);
	sp.selectproduct();
	Thread.sleep(1500);
	pp.addtocart();
}}
package com.app.TestNGScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions2 {
	@Test
	public void method1() {
		String expected="Selenium";
		String actual="Selenium TestNG";
		Assert.assertNotEquals(expected, actual);
	}
	@Test
	public void method2() {
		String actual="Selenium";
		Assert.assertNotNull(actual);
		
	}
}

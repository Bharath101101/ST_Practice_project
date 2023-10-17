package com.app.JunitPractice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DisplayNameOrderAnnot {
	@Order(4)
	@DisplayName("4 SignIn")
	@Test
	public void method1() {
		System.out.println("Testing Signin feature");
	}
	@Order(1)
	@DisplayName("1 Username")
	@Test
	public void method2() {
		System.out.println("Testing username");
	}
	@Order(2)
	@DisplayName("2 Password")
	@Test
	public void method3() {
		System.out.println("Testing password field");
	}
	@Order(3)
	@DisplayName("3 Forgot password")
	@Test
	public void method4() {
		System.out.println("Testing Forgot password field");
	}
	
}

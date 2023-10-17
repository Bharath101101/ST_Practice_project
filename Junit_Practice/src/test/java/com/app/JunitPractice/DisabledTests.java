package com.app.JunitPractice;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("Functionality,ignoring the test")
public class DisabledTests {
	@Test
	public void method1() {
		System.out.println("executing method 1 of code");
	}
	@Test
	@Disabled
	public void method2() {
		System.out.println("executing method 2 of code");
	}
	@Test
	@Disabled
	public void method3() {
		System.out.println("executing method 3 of code");
	}
	@Test
	public void method4() {
		System.out.println("executing method 4 of code");
	}
	@Test
	public void method5() {
		System.out.println("executing method 5 of code");
	}
	

}

package com.app.JunitPractice;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BeforeAfterEachAnnot {
	JavaOperations obj;
	@BeforeEach
	public void init() {
		System.out.println("Start DB");
		obj = new JavaOperations();
		System.out.println("Initalization DB");
	}
	@AfterEach
	public void teardown() {
		System.out.println("Close DB");
	}
	@Test
	public void test1() {
		System.out.println("Execute the test using methods of java operations");
	}
	@Test
	public void test2() {
		System.out.println("Close DB");
	}
}

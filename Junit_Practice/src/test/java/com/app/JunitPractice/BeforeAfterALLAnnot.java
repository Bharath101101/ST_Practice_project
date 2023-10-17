package com.app.JunitPractice;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BeforeAfterALLAnnot {
	static JavaOperations obj;
	@BeforeAll
	public  void init() {
		System.out.println("Start the Db");
		obj = new JavaOperations();
		System.out.println("Initalization done");
	}
	@AfterAll
	public  void teardown() {
		System.out.println("Stop the DB");
	}
	@Test
	public void method() {
		System.out.println("executing method 1 of code");
	}
	@Test
	public void method2() {
		System.out.println("close DB");
	}
}

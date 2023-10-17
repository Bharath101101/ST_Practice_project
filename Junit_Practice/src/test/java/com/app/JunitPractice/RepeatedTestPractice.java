package com.app.JunitPractice;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class RepeatedTestPractice {
	@RepeatedTest(3)
	@DisplayName("repeatedtest")
	public void repeatmessage() {
		System.out.println("Junit");
	}
	@Test
	public void Assumptions1() {
		boolean isDBServerUp =true;
		Assumptions.assumeTrue(isDBServerUp,"Server is not");
		System.out.print("create table & Insertdata");
	}
}

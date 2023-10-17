package com.app.JunitPractice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class ExtensionsConditions {
	@Test
	@EnabledOnOs(OS.MAC)
	public void conditions() {
		System.out.println("Executed Test Cases on mac");
		
	}
	@Test
	@EnabledOnJre(JRE.JAVA_14)
	public void conditionJRE() {
		System.out.println("Executed Test cases for my java version");
	}
	@Test
	@EnabledForJreRange(min = JRE.JAVA_11,max = JRE.JAVA_20)
	public void conditionJRErange() {
		System.out.println("Executed Test cases on machine with java version 11 to 20");
		
	}

}

package com.app.JunitPractice;

import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

public class DependancyInjection {
	@org.junit.jupiter.api.RepeatedTest(5)
	public void repeattest(TestInfo testInfo,RepetitionInfo repitInfo) {
		System.out.println();
	}
}

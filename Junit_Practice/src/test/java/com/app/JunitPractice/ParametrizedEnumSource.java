package com.app.JunitPractice;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class ParametrizedEnumSource {
	enum Values{
		Selenium,Jmeter,Junit
	}
	@ParameterizedTest(name="Enum Value{arguments}")
	@EnumSource(Values.class)
	public void passvaluesEnumSource(Object value) {
		System.out.println(value.toString());
	}

}

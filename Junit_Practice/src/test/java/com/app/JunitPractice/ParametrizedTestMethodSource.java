package com.app.JunitPractice;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ParametrizedTestMethodSource {
	@ParameterizedTest(name="Method value{arguments}")
	@MethodSource("stringParameters")
	public void getdatafromMethod(String input) {
		System.out.println("The value from method is:"+ input);
		
	}
	public static Stream<String> stringParameters(){
		return Stream.of("Monday","Tuesday","Wednesday");
	}

}

package com.app.JunitPractice;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ParameterizedCSVSource {
	@ParameterizedTest(name="CSV Source {arguments}")
	@CsvSource({"Admin,1234",
				"Admin2,123424",
				"Admin3,23245",
				"Admin4,34350"})

	public void datafrom_CSVsource(String username,String pwd) {
		System.out.println(username+" :"+pwd);
	}
	
}


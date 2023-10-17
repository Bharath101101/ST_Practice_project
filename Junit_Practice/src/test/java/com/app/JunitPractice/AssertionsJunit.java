package com.app.JunitPractice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsJunit {
	@Test
	public void testAssertions() {
		String expected = new String("ABC");
		String actual = new String("ABC");
		String str3 ="junit";
		String str4=null;
		int val1=20;
		int val2=30;
		Assertions.assertEquals(expected,actual);
		Assertions.assertTrue(val1<val2);
		Assertions.assertNull(str4);
		Assertions.assertNotNull(str3);
		Assertions.assertSame(expected, actual);
		Assertions.assertNotSame(expected, str3);
		
	}
}

package com.app.JunitPractice;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.runner.RunWith;
import org.junit.platform.suite.api.*;
@SuppressWarnings("unused")
@IncludeTags({"development"})
@ExcludeTags({"prod"})
public class IncludeExcludeTags {
	@Test
	@Tag("development")
	public void devtest1() {
		System.out.println("test Case Development 1");
	}
	@Test
	@Tag("development")
	public void devtest2() {
		System.out.println("test Case Development 2");
	}
	@Test
	@Tag("qa")
	public void qatest1() {
		System.out.println("test Case QA 1");
	}
	@Test
	@Tag("qa")
	public void qatest2() {
		System.out.println("test Case QA 2");
	}
	@Test
	@Tag("prod")
	public void prodtest1() {
		System.out.println("test Case prod 1");
	}
	@Test
	@Tag("prod")
	public void prodtest2() {
		System.out.println("test Case prod 2");
	}

}

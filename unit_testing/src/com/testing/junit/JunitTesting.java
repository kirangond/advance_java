package com.testing.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTesting {
	
	@Test //to run the test case
	public void test1()
	{
		System.out.println("from test1 method(): ");
	}
	
	@Before //will run before every test case
	public void before()
	{
		System.out.println("before method(): ");
	}
	
	@After //will run after every test case
	public void after()
	{
		System.out.println("after method(): ");
	}

	@Test
	public void test2()
	{
		System.out.println("from test2 method(): ");
	}
	
	@BeforeClass //will run only once before test case and method should be static
	public static void beforeClass()
	{
		System.out.println("beforeClass method(): ");
	}
	
	@AfterClass //will run only once after test case
	public static void afterClass()
	{
		System.out.println("afterClass method(): ");
	}
	
	
	
}

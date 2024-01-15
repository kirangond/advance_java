package com.testng;



import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UnitTestingTestNG {
	
	@Test
	public void test1()
	{
		System.out.println("from test1 method(): ");
	}
	@BeforeTest //will run before every test case once
	public void before()
	{
		System.out.println("beforetest method(): ");
	}
	
	@AfterTest //will run after every test case only once
	public void after()
	{
		System.out.println("aftertest method(): ");
	}
	
	@Test
	public void test2()
	{
		System.out.println("from test2 method");
	}
	
	@BeforeClass 
	public static void beforeClass()
	{
		System.out.println("beforeClass method(): ");
	}
	
	@AfterClass 
	public static void afterClass()
	{
		System.out.println("afterClass method(): ");
	}
}

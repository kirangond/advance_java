package com.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class A {
	
	@Test
	@Parameters("{url}")
	public void test(String url)
	{
		System.out.println("passing parameter to method: ");
	}

}

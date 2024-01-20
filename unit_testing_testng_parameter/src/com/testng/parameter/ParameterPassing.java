package com.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterPassing {
	
	//fetching url value from the testng.xml file  (value stored in variable url )
	@Parameters({"url"})
	@Test
	public void test(String name) {
		System.out.println(name);
	}

}

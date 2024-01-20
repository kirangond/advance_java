package com.testng.compare;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CompareValues {
	
	@Test
	public void test()
	{
		AddTwoNumbers obj = new AddTwoNumbers();
		int result = obj.sum(10, 20);
		
		Assert.assertEquals(result, 30);
	}

}

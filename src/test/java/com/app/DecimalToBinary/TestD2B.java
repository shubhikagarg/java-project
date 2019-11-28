package com.app.DecimalToBinary;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.TestCase;

public class TestD2B
{
	MyClass m=new MyClass();
	@Test
	public void testpositive()
	{
		assertEquals(101, m.D2B(5));
		String 	 browserName = System.getProperty("browserName");
		System.out.println(browserName);
		
	}
	@Test
	public void testnegative()
	{
		assertEquals(0, m.D2B(-5));
	}
	
	@Test
	public void testZeroInput()
	{
		assertEquals(0, m.D2B(0));
	}

}

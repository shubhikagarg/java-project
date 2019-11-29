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
		String 	 instanceID = System.getProperty("instanceID");
	System.out.println("Instance Id is -   "+instanceID);
	String uname = System.getProperty("uname");
	System.out.println(uname);
	 String[] arrOfStr = uname.split(":"); 
	
     for (String a : arrOfStr) 
         System.out.println("Seprate  is "+a); 
    
		
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

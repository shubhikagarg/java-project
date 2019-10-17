package com.app.DecimalToBinary;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.runner.*;
import org.junit.runner.notification.Failure;
import org.junit.Test;

public class TestController {

	public static void main(String[] args) 
	{
		Result r=JUnitCore.runClasses(TestD2B.class);
	for (Failure s : r.getFailures())
	{
			System.out.println("Failed  "+s.toString());
	}
		
	System.out.println("pass");
	}

}

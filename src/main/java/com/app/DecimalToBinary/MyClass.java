package com.app.DecimalToBinary;

public class MyClass {

	public long D2B(int n)
	{
		 long binaryNumber = 0;
	    int remainder, i = 1, step = 1;
	    if(n==0)
	    {
	    	return 0;
	    }
	    if(n<0)
	    {
	    	return 0;
	    }
	    while (n!=0)
	    {
	        remainder = n%2;
	   //     printf("Step %d: %d/2, Remainder = %d, Quotient = %d\n", step++, n, remainder, n/2);
	        n /= 2;
	        binaryNumber += remainder*i;
	        i *= 10;
	    }
	    return binaryNumber;
	}
}

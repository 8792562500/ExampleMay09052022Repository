package com.sgtesting.calculator.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sgtesting.calculator.sourcecode.Calculator;

public class DivisionTestcases 
{
	Calculator calculator=new Calculator();
	
	@Test
	public void divideTwoPositiveNumbers()
	{
		int expected,actual;
		try
		{
			expected=10;
			actual=calculator.division(40, 4);
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void divideTwoNegitiveNumbers()
	{
		int expected,actual;
		try
		{
			expected=10;
			actual=calculator.division(-80, -8);
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void multiplyOnePostiveAndNegitiveNumbers()
	{
		int expected,actual;
		try
		{
			expected=-3;
			actual=calculator.division(24, -8);
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}

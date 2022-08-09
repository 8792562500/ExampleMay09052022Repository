package com.sgtesting.calculator.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sgtesting.calculator.sourcecode.Calculator;



public class MultiplicationTestcases 
{
	Calculator calculator=new Calculator();
	
	@Test
	public void multiplyTwoPositiveNumbers()
	{
		int expected,actual;
		try
		{
			expected=40;
			actual=calculator.multiplication(10, 4);
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void multiplyTwoNegitiveNumbers()
	{
		int expected,actual;
		try
		{
			expected=64;
			actual=calculator.multiplication(-8, -8);
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
			expected=-64;
			actual=calculator.multiplication(8, -8);
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test
	public void multiplyPositiveAndZeroNumbers()
	{
		int expected,actual;
		try
		{
			expected=0;
			actual=calculator.multiplication(8,0);
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

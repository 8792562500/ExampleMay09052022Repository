package com.sgtesting.calculator.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sgtesting.calculator.sourcecode.Calculator;

public class SubtractionTestcases 
{
	Calculator calculator=new Calculator();
	
	/**
	 * Created By:
	 * Description:
	 */
	@Test
	public void subTwoPositiveNumber()
	{
		int expected,actual;
		try
		{
			expected=17;
			actual=calculator.subtraction(20, 3);
			Assert.assertEquals(expected,actual);
		}catch(Exception e)
		{
			e.printStackTrace();			                
		}
	}
	
	/**
	 * Created By:
	 * Description:
	 */
	@Test
	public void subTwoNegativeumber()
	{
		int expected,actual;
		try
		{
			expected=-5;
			actual=calculator.subtraction(-10, -5);
			Assert.assertEquals(expected,actual);
		}catch(Exception e)
		{
			e.printStackTrace();			                
		}
	}
	
	/**
	 * Created By:
	 * Description:
	 */
	@Test
	public void subOnePositiveandNegativeumber()
	{
		int expected,actual;
		try
		{
			expected=15;
			actual=calculator.subtraction(10,-5);
			Assert.assertEquals(expected,actual);
		}catch(Exception e)
		{
			e.printStackTrace();			                
		}
	}
	
	@Test
	public void addPostiveAndZeroNumbers()
	{
		int expected,actual;
		try
		{
			expected=10;
			actual=calculator.subtraction(10,0);
			Assert.assertEquals(expected,actual);
		}catch(Exception e)
		{
			e.printStackTrace();			                
		}
	}
}

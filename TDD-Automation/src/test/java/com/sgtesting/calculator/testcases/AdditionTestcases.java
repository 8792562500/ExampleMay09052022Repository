package com.sgtesting.calculator.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sgtesting.calculator.sourcecode.Calculator;

public class AdditionTestcases 
{
	Calculator calculator=new Calculator();
	
	/**
	 * Created By:
	 * Description:
	 */
	@Test
	public void addTwoPositiveNumber()
	{
		int expected,actual;
		try
		{
			expected=70;
			actual=calculator.addition(30, 40);
			Assert.assertEquals(expected, actual);
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
	public void addTwoNegativeNumber()
	{
		int expected,actual;
		try
		{
			expected=-17;
			actual=calculator.addition(-13, -4);
			Assert.assertEquals(expected, actual);
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
	public void addPostiveAndNegativeNumber()
	{
		int expected,actual;
		try
		{
			expected=27;
			actual=calculator.addition(30, -3);
			Assert.assertEquals(expected, actual);
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
			expected=27;
			actual=calculator.addition(27, 0);
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
}

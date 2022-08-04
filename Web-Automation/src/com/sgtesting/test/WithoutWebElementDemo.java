package com.sgtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutWebElementDemo 
{
	public static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void login()
	{
		try
		{
			WebElement oText=oBrowser.findElement(By.id("username"));
			oText.sendKeys("DemoUser1");
			Thread.sleep(1000);
			oText.clear();
			Thread.sleep(1000);
			oText.sendKeys("DemoUser2");
			Thread.sleep(1000);
			oText.clear();
			Thread.sleep(1000);
			oText.sendKeys("Demouser3");
			Thread.sleep(1000);
			oText.clear();
			Thread.sleep(1000);
			oText.sendKeys("DemoUser1234");
			Thread.sleep(1000);
			String val=oText.getAttribute("value");
			System.out.println(val);
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

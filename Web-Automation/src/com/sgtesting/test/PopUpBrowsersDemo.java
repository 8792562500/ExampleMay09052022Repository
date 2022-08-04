package com.sgtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpBrowsersDemo 
{
	public static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		handlingPopupBrowser();
	}
	
	private static void launchBrowser()
	{
		try 
		{
			System.setProperty("webdriver.chrome.driver", "C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			Thread.sleep(2000);
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
	
	private static void handlingPopupBrowser()
	{
		WebElement oLink=null;
		try 
		{
			oLink=oBrowser.findElement(By.linkText("actiTIME Inc."));
			System.out.println("# of popups before click on the link: " +popupcount());
			oLink.click();
			Thread.sleep(2000);
			System.out.println("# of popups after click on the link: " +popupcount());
			if(popupcount()>0)
			{
				popupBrowser();
			}
		}catch(Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	private static int popupcount()
	{
		int count=0;
		count=oBrowser.getWindowHandles().size()-1;
		return count;
	}
	private static void popupBrowser()
	{
		String ParentBrowser;
		Object popups[];
		try
		{
			ParentBrowser=oBrowser.getWindowHandle();
			System.out.println("Parent Browser: " +ParentBrowser);
			popups=oBrowser.getWindowHandles().toArray();
			for(int i=1;i<popups.length;i++)
			{
				String ChildBrowser=popups[i].toString();
				System.out.println("Child Browser: " +ChildBrowser);
				oBrowser.switchTo().window(ChildBrowser);
				String title=oBrowser.getTitle();
				System.out.println("Title of Child Browser: " +title);
				String url=oBrowser.getCurrentUrl();
				System.out.println("URL of Child Browser: " +url);
				oBrowser.findElement(By.linkText("Try Free")).click();
				Thread.sleep(3000);
			}	
		}catch(Exception e) 
		{
			e.printStackTrace();
		}		
	}
}

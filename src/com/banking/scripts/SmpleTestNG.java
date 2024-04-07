package com.banking.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SmpleTestNG 
{  
	WebDriver driver;
@BeforeTest
public void xyz()
{
driver= new FirefoxDriver();
	
	driver.manage().window().maximize();
}
	@Test(priority=2)
public void abc() throws InterruptedException
{
	driver.get("http://google.com");
	Thread.sleep(2000);
}
	@Test(priority=1)
	public void bcd() 
	{
	driver.get("http://amazon.com");	
	}
	@AfterTest
public void pqr()
{
	driver.close();
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

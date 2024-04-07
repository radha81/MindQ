package com.banking.master;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HPpom {

	WebDriver driver;
	
	@Test
	public void HPlogin() throws InterruptedException
	{
	driver =new FirefoxDriver();

	driver.manage().window().maximize();
	driver.get("http://103.211.39.246/ranford2/");
RanfordHP	PHP=PageFactory.initElements(driver, RanfordHP.class);

	PHP.loginHP();
	Role	NRC=PageFactory.initElements(driver, Role.class);

NRC.roleCreation();
	
}
	}
package com.banking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RanfordHP {

	
	@FindBy(id="txtuId")
	WebElement uname;
	
	
	@FindBy(name="txtPword")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"login\"]")
	WebElement login;
	/*@FindBy(xpath="//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")
	WebElement roles;*/
	
	public void loginHP()
	{
		uname.sendKeys("Admin");
		password.sendKeys("TestingMindq");
		login.click();
	}
		
		
	}
	

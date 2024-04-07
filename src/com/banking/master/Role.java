package com.banking.master;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Role {

	@FindBy(xpath="//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")
	WebElement roles;
	
	@FindBy(xpath="//*[@id=\"btnRoles\"]")
	WebElement newrole;
	@FindBy(id="txtRname")
	WebElement rolename;
	@FindBy(xpath="//*[@id=\"lstRtypeN\"]")
WebElement roletype;
	@FindBy(xpath="//*[@id=\"btninsert\"]")
	WebElement submit;
		
	public void roleCreation() 
	
	
	{
		roles.click();
	newrole.click();	
	rolename.sendKeys("cashier");
		
		Select roltp=new Select(roletype);
		roltp.selectByVisibleText("E");
		submit.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

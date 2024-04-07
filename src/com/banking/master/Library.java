package com.banking.master;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Library
{
	public static WebDriver driver;
	public static String Expval,Actval;
	public static FileInputStream FIS;
	public static Properties pr;
	
	public String OpenApp(String url) throws IOException
	{
		FIS= new FileInputStream("C:\\Users\\DELL\\eclipse-workspace-MQ\\Ebanking\\src\\com\\banking\\testdata\\Branches.xlsx");
		//pr=new Properties();
		//pr.load(FIS);
		Expval="Ranford Bank";

		 driver =new FirefoxDriver();

		driver.manage().window().maximize();
		//URL
		driver.get(url);
		String actval= driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
		if(Expval.equalsIgnoreCase(actval))
			System.out.println("launch successful");
		else
			{System.out.println("unsuccessful");
			}
		return "pass";
	}

	public String AdminLogin(String uname,String pwd) throws InterruptedException
	{
		Expval="Welcome to Admin";
		Thread.sleep(3000);
		
		driver.findElement(By.id("txtuId")).sendKeys(uname);

		driver.findElement(By.name("txtPword")).sendKeys(pwd);
		
		
		
driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
//driver.findElement(By.xpath(pr.getProperty(Login))).click();

Actval=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
if (Expval.equalsIgnoreCase(Actval)) 
{
System.out.println("Admin Login Succ");	
}
else
{
	System.out.println("Admin Login Failed");	
}
//return "login success";//*[@id="Table_01"]/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img
return "pass";
}
	
	
	public String Branches(String bname,String address1, String pincode,String countryname,String statename,String cityname) throws InterruptedException
	{   
		Expval="Sucessfully";
		//*[@id="Table_01"]/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img
		driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[2]/td")).click();
		driver.findElement(By.xpath("//*[@id=\"BtnNewBR\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"txtbName\"]")).sendKeys(bname);
		driver.findElement(By.xpath("//*[@id=\"txtAdd1\"]")).sendKeys(address1);
		driver.findElement(By.xpath("//*[@id=\"txtZip\"]")).sendKeys(pincode);
		Select country=new Select(driver.findElement(By.xpath("//*[@id=\"lst_counrtyU\"]")));
		country.selectByVisibleText(countryname);
		
	Select state=new Select(driver.findElement(By.xpath("//*[@id=\"lst_stateI\"]")));
	state.selectByVisibleText(statename);
		Select city= new Select(driver.findElement(By.xpath("//*[@id=\"lst_cityI\"]")));
		city.selectByVisibleText(cityname);

		driver.findElement(By.xpath("//*[@id=\"btn_insert\"]")).click();
		//Alert
		Thread.sleep(5000);

		Actval=driver.switchTo().alert().getText();

		driver.switchTo().alert().accept();
			
			if (Actval.contains(Expval)) 
			{
			System.out.println("Branch Created");	
			}
			else
			{
				System.out.println("Branch Already Exist");
			}
			driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr/td[1]/a/img")).click();
			
return"Branch creation successful";
	}
	
public void Alogout() throws InterruptedException 
{Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"Table_02\"]/tbody/tr/td[3]/a/img")).click();
	
}

public void Aclose() throws InterruptedException
{
	Thread.sleep(2000);
	driver.close();
	
}







}
	
/*	
	
	public void Roles()
	{
		driver.findElement(By.xpath("//*[@id=\"Table_02\"]/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
		driver.findElement(By.xpath("//*[@id=\"btnRoles\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"txtRname\"]")).sendKeys("cashier");
		Select roletype=new Select(driver.findElement(By.xpath("//*[@id=\"lstRtypeN\"]")));
		roletype.selectByVisibleText("E");
		driver.findElement(By.xpath("//*[@id=\"btninsert\"]")).click();
		driver.switchTo().alert().accept();
	
	}
		public void Employees()
	{
			driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")).click();
			driver.findElement(By.xpath("//*[@id=\"BtnNew\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"txtUname\"]")).sendKeys("reachrk");
			driver.findElement(By.xpath("//*[@id=\"txtLpwd\"]")).sendKeys("Radha@12345");
			Select role=new Select(driver.findElement(By.xpath("//*[@id=\"lst_Roles\"]")));
			role.selectByVisibleText("Accountant");
			Select branch=new Select(driver.findElement(By.xpath("//*[@id=\"lst_Branch\"]")));
			branch.selectByVisibleText("12345");
			driver.findElement(By.xpath("//*[@id=\"BtnSubmit\"]")).click();

	}
	
		public void Logout() 
		{
			
		}
		
		public void Close()
		{
		
		}


*/

	


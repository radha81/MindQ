package com.banking.scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String expval="Ranford Bank";

		WebDriver driver =new FirefoxDriver();
//Maximize

driver.manage().window().maximize();
//URL
driver.get("http://103.211.39.246/ranford2/");
String actval= driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/p/span")).getText();
if
(expval.equalsIgnoreCase(actval))
	System.out.println("launch successful");
else
	{System.out.println("unsuccessful");
	}

//AdminLogin

/*driver.findElement(By.id("txtuId")).sendKeys("Admin");

driver.findElement(By.name("txtPword")).sendKeys("TestingMindq");

driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table[2]/tbody/tr[2]/td/table/tbody/tr[8]/td/div/input")).click();
//Branch Creation
driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
driver.findElement(By.id("BtnNewBR")).click();
driver.findElement(By.xpath("//*[@id=\"txtbName\"]")).sendKeys("vanasthalipurm");
driver.findElement(By.xpath("//*[@id=\"txtAdd1\"]")).sendKeys("hyderabad");
driver.findElement(By.xpath("//*[@id=\"txtZip\"]")).sendKeys("50068");
Select country=new Select(driver.findElement(By.xpath("//*[@id=\"lst_counrtyU\"]")));
country.selectByVisibleText("INDIA");
new Select(driver.findElement(By.xpath("//*[@id=\"lst_stateI\"]"))).selectByVisibleText("GOA");
new Select(driver.findElement(By.xpath("//*[@id=\"lst_cityI\"]"))).selectByVisibleText("GOA");

driver.findElement(By.xpath("//*[@id=\"btn_insert\"]")).click();
//Alert

driver.switchTo().alert().accept();
	Thread.sleep(5000);
	
	
	//Roles Creation
	driver.findElement(By.xpath("//*[@id=\"Table_02\"]/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img")).click();
	driver.findElement(By.xpath("//*[@id=\"btnRoles\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"txtRname\"]")).sendKeys("cashier");
	Select roletype=new Select(driver.findElement(By.xpath("//*[@id=\"lstRtypeN\"]")));
	roletype.selectByVisibleText("E");
	driver.findElement(By.xpath("//*[@id=\"btninsert\"]")).click();
	driver.switchTo().alert().accept();
/*users creation
	driver.findElement(By.xpath("//*[@id=\"Table_02\"]/tbody/tr[2]/td/table/tbody/tr[6]/td/a/img")).click();
	driver.findElement(By.xpath("//*[@id=\"Btnuser\"]")).click();
	Select user=new Select(driver.findElement(By.xpath("//*[@id=\"lst_Roles\"]")));
	user.selectByVisibleText("ccustomer");
	Select branch=new Select(driver.findElement(By.xpath("//*[@id=\"lst_Branch\"]")));
	branch.selectByVisibleText("12345");
	Select CustomerID=new Select(driver.findElement(By.xpath("//*[@id=\"DrCName\"]")));
	CustomerID.selectByVisibleText("ccustomer");
	driver.findElement(By.xpath("//*[@id=\"Lbc_name\"]")).sendKeys("radha krishna");
	driver.findElement(By.xpath("//*[@id=\"txtLpwd\"]")).sendKeys("Radha1212");
	driver.findElement(By.xpath("//*[@id=\"txtTpwd\"]")).sendKeys("Radha12345");

	
	//*Employee Creation
	
	driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[8]/td/a/img")).click();
	driver.findElement(By.xpath("//*[@id=\"BtnNew\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"txtUname\"]")).sendKeys("reachrk");
	driver.findElement(By.xpath("//*[@id=\"txtLpwd\"]")).sendKeys("Radha@12345");
	Select role=new Select(driver.findElement(By.xpath("//*[@id=\"lst_Roles\"]")));
	role.selectByVisibleText("Accountant");
	Select branch=new Select(driver.findElement(By.xpath("//*[@id=\"lst_Branch\"]")));
	branch.selectByVisibleText("12345");
	driver.findElement(By.xpath("//*[@id=\"BtnSubmit\"]")).click();
	
*/	

	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

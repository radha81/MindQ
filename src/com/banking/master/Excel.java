package com.banking.master;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static void main(String[] args) throws IOException, InterruptedException 
	{
	Library LB=new Library();
		LB.OpenApp("http://103.211.39.246/ranford2/");
		LB.AdminLogin("Admin","TestingMindq");

		FileInputStream FIS=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace-MQ\\Ebanking\\src\\com\\banking\\testdata\\Branches.xlsx");
    
	//Work Book
	
	XSSFWorkbook WB=new XSSFWorkbook(FIS);
	
	//Sheets
	
	XSSFSheet WS=WB.getSheet("Branches");
	
	//RowCount
	
	
	
	
int RowCount=WS.getLastRowNum();
	System.out.println(RowCount);

	
	//Multiple Iterations --------- Loop
	
	for(int i=1;i<=RowCount;i++)
	{
        //Row
		
		XSSFRow WR=WS.getRow(i);
		
	   //Cell
		
		XSSFCell WC=WR.getCell(0);
		XSSFCell WC1=WR.getCell(1);
		XSSFCell WC2=WR.getCell(2);
		XSSFCell WC3=WR.getCell(3);
		XSSFCell WC4=WR.getCell(4);
		XSSFCell WC5=WR.getCell(5);
		XSSFCell WC6=WR.createCell(6);

		//XSSFCell WC6=WR.getCell(6);

		//XSSFCell WC2=WR.createCell(2);
		
		//Cell Values
		
		String bname=WC.getStringCellValue();
		String address1=WC1.getStringCellValue();
		String pincode=WC2.getStringCellValue();
		String countryname=WC3.getStringCellValue();

		String statename=WC4.getStringCellValue();

		String cityname=WC5.getStringCellValue();

		String res=LB.Branches(bname, address1, pincode,countryname,statename, cityname);
		System.out.println(res);
		WC6.setCellValue(res);
	}
FileOutputStream FOS=new FileOutputStream("C:\\Users\\DELL\\eclipse-workspace-MQ\\Ebanking\\src\\com\\banking\\results\\Resbranches.xlsx");
		
	WB.write(FOS);
	WB.close();
	
	
		
	
}
}
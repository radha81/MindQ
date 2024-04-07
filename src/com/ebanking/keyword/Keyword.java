package com.ebanking.keyword;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.banking.master.Library;

public class Keyword {

	public static void main(String[] args) throws IOException, InterruptedException {
		Library LB=new Library();
		String kpath="C:\\Users\\DELL\\eclipse-workspace-MQ\\Ebanking\\src\\com\\ebanking\\keyword\\keyword_data.xlsx";
		String kout="C:\\Users\\DELL\\eclipse-workspace-MQ\\Ebanking\\src\\com\\ebanking\\keyword\\keywordResults2_data.xlsx";

		String Res=null;
		FileInputStream FIS=new FileInputStream(kpath);
		XSSFWorkbook wb= new XSSFWorkbook(FIS);
	XSSFSheet ws=wb.getSheet("TestCase");
	XSSFSheet ws1=wb.getSheet("TestSteps");
	int RCTC=ws.getLastRowNum();
	System.out.println(RCTC);
	int RCTS=ws1.getLastRowNum();
	System.out.println(RCTS);
	for(int i=0;i<=RCTC;i++)
	{
				String exe= ws.getRow(i).getCell(2).getStringCellValue();
		if (exe.equalsIgnoreCase("y"))
				{
			String TCID=ws.getRow(i).getCell(0).getStringCellValue();
			System.out.println(TCID);
			for(int j=0;j<=RCTS;j++)
			{
				String  TsTcId=ws1.getRow(j).getCell(0).getStringCellValue();
					System.out.println(TsTcId);		
			if(TCID.equalsIgnoreCase(TsTcId))
			{
			String key=ws1.getRow(j).getCell(3).getStringCellValue();
			System.out.println(key);
			switch(key)
			{
				case "RLanch":
					Res=LB.OpenApp("http://103.211.39.246/ranford2/");
                    break;
				case "RLogin":
					Res=LB.AdminLogin("Admin","TestingMindq");
					break;
							
				case "RBranch":
					FileInputStream fi=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace-MQ\\Ebanking\\src\\com\\banking\\testdata\\Branches.xlsx");
				    
					//Work Book
					
					XSSFWorkbook WB=new XSSFWorkbook(fi);
					
					//Sheets
					
					XSSFSheet WS=WB.getSheet("Branches");
					
					//RowCount
					
					
					
					
				int RowCount=WS.getLastRowNum();
					System.out.println(RowCount);

					
					//Multiple Iterations --------- Loop
					
					for(int k=1;k<=RowCount;k++)
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
break;
				/*default:
					System.out.println("Pass a Valid Keyword");
					break;*/
				}
			
			
			ws1.getRow(j).createCell(3).setCellValue(Res);
			if(!ws1.getRow(j).getCell(3).getStringCellValue().equalsIgnoreCase("fail"))
			{
				ws.getRow(i).createCell(3).setCellValue(Res);
			}
			else
			{
			
				ws.getRow(i).createCell(3).setCellValue("Fail");
			}
			
			}		
		

		else {
			ws.getRow(i).createCell(3).setCellValue("Blocked");

		}
		
		FileOutputStream FOS=new FileOutputStream(kout);
		wb.write(FOS);
		//wb.close();
		
		
		}}}}}
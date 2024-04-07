package com.banking.master;

import java.io.IOException;


public class Exelibrary {

	public static void main(String[] args) throws InterruptedException, IOException 
	{  //Instance Class
		
		Library LB=new Library();
	LB.OpenApp("http://103.211.39.246/ranford2/");
	//System.out.println(retval);
		LB.AdminLogin("Admin","TestingMindq");
		LB.Branches("bname"," address1", "pincode","countryname","statename","cityname");
		
			}
}


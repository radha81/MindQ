package com.banking.master;

import org.testng.annotations.Test;

public class BranchesNG extends Base


{
	@Test
	public void branch () throws InterruptedException
	{
		LB.Branches("abcdef", "mansoorabad", "507003", "INDIA", "GOA", "GOA" );
	}
	
	
	}



package com.revature.driver;

import com.revature.bean.MeanuSystem;
import com.revature.util.BankRecord;
import com.revature.util.FileStuff;

public class Driver {
	static {FileStuff.readCustomerFile();}

	public static void main(String[] args) {
		MeanuSystem.whichMenu();
	    //BankRecord.cPrintList();
	}

}

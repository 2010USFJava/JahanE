package com.revature.driver;

import com.revature.bean.Customer;
import com.revature.menuSystem.ManuSystem;
import com.revature.util.CustList;
import com.revature.util.FileStuff;

public class Driver {
       static {FileStuff.readCustomerFile();}
	public static void main(String[] args) {
		
		ManuSystem.menu();
		
		
	}

}

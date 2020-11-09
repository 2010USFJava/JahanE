package com.revature.function;

import com.revature.bean.CustomerAccount;
import com.revature.util.BankRecord;
import com.revature.util.FileStuff;

public class ViewCustomer {
	
	
	public void viewCustomerDetails(CustomerAccount a) {
		FileStuff.writeCustomerFile(BankRecord.customerList);//work
		
	}

}

package com.revature.project0;

import java.util.ArrayList;
import java.util.List;

public class BankAdmin extends BankEmployee{
	
	List<BankAccount> bank=new ArrayList<>();
	
	// Method to retrieve a BankAccount information by given accountNumber
		
	
	//Method to delete a bankaccount given account number 
		public boolean deleteAccount(int s) {
			for(int i = 0; i < bank.size(); i++) {
				if((bank.remove(i).getHolder())[0].getAccountNumber() == s) {
					bank.remove(i);
					return true;
				}
			}
			return false; //not there
		}

}

package com.revature.util;

import java.util.ArrayList;
import java.util.List;

import com.revature.bean.CustomerAccount;

public class BankRecord {
	public static List<CustomerAccount>customerList=new ArrayList<CustomerAccount>();
	
	
	public static void cPrintList() {
		for(CustomerAccount c: customerList) {
			System.out.println("Customer List: " + c);
		}
		
	}
	
	
 public static CustomerAccount findByName(String inputName) {
		
		for(int i=0;i<customerList.size();i++) {
			
			String name=customerList.get(i).getfName();
			if(inputName.equals(name)) {
				return customerList.get(i);
			}
		}
		
		System.out.println("customer Not found");
		return null;
	}
	
    public static CustomerAccount deletById(int uId) {
    	
    	for(int i=0;i<customerList.size();i++) {
    		int id=customerList.get(i).getCustId();
    		if(uId==id) {
    			return customerList.remove(i);
    			
    		}
    		
    	}
		return null;
    }
	 
		public static CustomerAccount deletByName(String n) {
	    	
	    	for(int i=0;i<customerList.size();i++) {
	    		String name=customerList.get(i).getfName();
	    		if(n.equals(name)) {
	    			return customerList.remove(i);
	    			
	    		}
	    		
	    	}
			return null;
	 
 }
		public static CustomerAccount findByUserName(String inputUser) {
			
			for(int i=0;i<customerList.size();i++) {
				
				String uname=customerList.get(i).getfName();
				if(inputUser.equals(uname)) {
					return customerList.get(i);
				}
			}
			
			
			return null;
		}	
    public static CustomerAccount findBypass(String inputPass) {
			
			for(int i=0;i<customerList.size();i++) {
				
				String pass=customerList.get(i).getfName();
				if(inputPass.equals(pass)) {
					return customerList.get(i);
				}
			}
			
			
			return null;
		}	
public static CustomerAccount findByAccount(int acc) {
		
		for(int i=0;i<customerList.size();i++) {
			
			int account=customerList.get(i).getAccountNumber();
			if(acc==account) {
				return customerList.get(i);
			}
		}
		
		System.out.println("Account Number Not found");
		return null;
	}
	
}

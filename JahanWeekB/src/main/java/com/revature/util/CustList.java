package com.revature.util;

import java.util.ArrayList;
import java.util.List;

import com.revature.bean.Customer;
import com.revature.menuSystem.ManuSystem;



public class CustList {
	public static List<Customer>custList=new ArrayList<Customer>();
	public static Customer findByName(String iName) {
		for (int i = 0; i < custList.size(); i++) {
			String name= custList.get(i).getName();
			if(iName.equals(name)) {
				return custList.get(i);
			}
		}
		
		System.out.println(" not found");
		ManuSystem.menu();
		return null;
	}


}

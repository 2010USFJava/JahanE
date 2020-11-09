package com.revature.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.revature.bean.CustomerAccount;

public class FileStuff {
	
	public static final String customerFile="customerList.txt";
	   
	//write method
	public static void writeCustomerFile(List<CustomerAccount>cList) {
		
		try {
			
			ObjectOutputStream objectOut=new ObjectOutputStream(new FileOutputStream(customerFile));
			objectOut.writeObject(cList);
			objectOut.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	//Read method
	@SuppressWarnings("unchecked")
	   public static void readCustomerFile() {
		try {
			ObjectInputStream objectIn=new ObjectInputStream(new FileInputStream(customerFile));
			BankRecord.customerList=(ArrayList<CustomerAccount>) objectIn.readObject();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

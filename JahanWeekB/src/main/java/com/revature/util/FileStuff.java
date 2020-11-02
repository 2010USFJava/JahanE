package com.revature.util;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.revature.bean.Customer;



public class FileStuff {
	public static final String custFile="customerList.txt";
	   
	//write method
	public static void writeCustomerFile(List<Customer>cList) {
		
		try {
			
			ObjectOutputStream objectOut=new ObjectOutputStream(new FileOutputStream(custFile));
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


@SuppressWarnings("unchecked")
public static void readCustomerFile() {
	try {
		ObjectInputStream objectIn=new ObjectInputStream(new FileInputStream(custFile));
		CustList.custList=(ArrayList<Customer>) objectIn.readObject();
		
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

package com.revature.project0;

import com.revature.util.CusData;
import com.revature.util.FileStuff;
import com.revature.util.Log;

public class CustomerAccount extends BankAccount {
	private String fName;
	private String lName;
	private String uName;
	private String pWord;
	private int custID;
	
	public CustomerAccount() {
		super();
		CusData.customerList.add(this);
		FileStuff.writeCustomerFile(CusData.customerList);
	}
	
	
	public CustomerAccount(String fName, String lName, String uName, String pWord, int custID) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.uName = uName;
		this.pWord = pWord;
		this.custID++;
		CusData.customerList.add(this);
		FileStuff.writeCustomerFile(CusData.customerList);
		Log.LogIt("info", "A new customer Add and Id is"+this.getCustID());
	}


	public String getfName() {
		return fName;
	}


	public void setfName(String fName) {
		this.fName = fName;
	}


	public String getlName() {
		return lName;
	}


	public void setlName(String lName) {
		this.lName = lName;
	}


	public String getuName() {
		return uName;
	}


	public void setuName(String uName) {
		this.uName = uName;
	}


	public String getpWord() {
		return pWord;
	}


	public void setpWord(String pWord) {
		this.pWord = pWord;
	}


	public int getCustID() {
		return custID;
	}


	public void setCustID(int custID) {
		this.custID = custID;
	}


	@Override
	public String toString() {
		return "CustomerAccount [fName=" + fName + ", lName=" + lName + ", uName=" + uName + ", pWord=" + pWord
				+ ", custID=" + custID + "]";
	}
	
	

}

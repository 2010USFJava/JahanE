package com.revature.project0;

public class BankEmployee extends CustomerAccount{
	private String uName;
	private String pWord;
	private int empID;
	
	public BankEmployee() {
		super();
	}
	
	
	
	public BankEmployee(String uName, String pWord, int empID) {
		super();
		this.uName = uName;
		this.pWord = pWord;
		this.empID = empID;
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



	public int getEmpID() {
		return empID;
	}



	public void setEmpID(int empID) {
		this.empID = empID;
	}



	@Override
	public String toString() {
		return "BankEmployee [uName=" + uName + ", pWord=" + pWord + ", empID=" + empID + "]";
	}
	
	

}

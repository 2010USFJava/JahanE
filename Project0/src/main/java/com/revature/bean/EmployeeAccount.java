package com.revature.bean;

import com.revature.util.BankRecord;

public class EmployeeAccount {
	private String empUsName;
	private String empPassNme;
	private CustomerAccount AccountNumber;
	
	public EmployeeAccount() {
		super();
	}
	
	public EmployeeAccount(String empUsName, String empPassNme, CustomerAccount accountNumber) {
		super();
		this.empUsName = empUsName;
		this.empPassNme = empPassNme;
		AccountNumber = accountNumber;
	}

	public String getEmpUsName() {
		return empUsName;
	}

	public void setEmpUsName(String empUsName) {
		this.empUsName = empUsName;
	}

	public String getEmpPassNme() {
		return empPassNme;
	}

	public void setEmpPassNme(String empPassNme) {
		this.empPassNme = empPassNme;
	}

	public CustomerAccount getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(CustomerAccount accountNumber) {
		AccountNumber = accountNumber;
	}
	
	@Override
	public String toString() {
		return "EmployeeAccount [empUsName=" + empUsName + ", empPassNme=" + empPassNme + ", AccountNumber="
				+ AccountNumber + "]";
	}
	
	
	

}

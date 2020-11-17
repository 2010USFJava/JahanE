package com.revature.bean;

import java.io.Serializable;

public class BankAccount implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4929292496343464532L;
	private double balance;
	private double amount;
	private int account_Id;
	private String accountType;
	
	public BankAccount() {
		super();
		
	}
	public BankAccount(double balance, double amount, int account_Id,String accountType) {
		super();
		this.balance = balance;
		this.amount = amount;
		this.account_Id = account_Id;
		this.accountType=accountType;
	}
	public BankAccount(int account_Id,double balance,String accountType) {
		super();
	
	    this.account_Id = account_Id;
	    this.balance = balance;
		this.accountType=accountType;
	}
	
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getAccount_Id() {
		return account_Id;
	}
	public void setAccount_Id(int account_Id) {
		this.account_Id = account_Id;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType=accountType;
		
	}
	@Override
	public String toString() {
		return "BankAccount [balance=" + balance + ", account_Id=" + account_Id + ", accountType=" + accountType + "]";
	}
//	public static double depositMoney(double amount,double balance) {
//
//		if (amount < 0) {
//			System.out.println("Let's serious!!!!you can't deposit zero or less then zero");
//
//		}
//
//		balance += amount;
//		System.out.println("successfuly diposit money " + balance);
//         return balance;
//	}

//	public void withdrawMoney(double amount) {
//
//		if (amount < 0) {
//			System.out.println("Cannot withdraw a zero amount or less then zero.");
//
//		} else {
//
//			this.balance = this.balance - amount;
//			System.out.println("Successfully widthdraw Money in your account" + amount);
//			
//		}
//	}

}
	
	
	
	
	
	
	
	
	
	
	



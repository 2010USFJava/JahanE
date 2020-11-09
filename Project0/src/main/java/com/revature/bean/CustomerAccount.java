package com.revature.bean;
import com.revature.util.FileStuff;
import com.revature.util.LogThis;

import java.io.Serializable;
import java.util.Scanner;

import com.revature.util.BankRecord;


public class CustomerAccount implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4863267706323216136L;



	static Scanner scan = new Scanner(System.in);
	
	
	
	private String fName;
	private String lName;
	private int custId;
	private  int accountNumber;
	private String userName;
	private String passWord;
	private double balance;
	private double amount;
	
	public CustomerAccount() {
		super();
		BankRecord.customerList.add(this);
		//FileStuff.writeCustomerFile(BankRecord.customerList);
	}
	public CustomerAccount(String fName, String lName,String userName, String passWord, double balance,int accountNumber ) {
		super();
		this.fName = fName;
		this.lName = lName;
		
		this.userName = userName;
		this.passWord = passWord;
		//this.custId=custId;
		this.balance = balance;
		this.accountNumber=accountNumber;
		
		BankRecord.customerList.add(this);
		FileStuff.writeCustomerFile(BankRecord.customerList);
		LogThis.LogIt("info","New customer "+this.fName+" has been added");
	}
	
	/*public CustomerAccount(String fName, String lName, int custId, String userName, String passWord, double balance,
			double amount,int accountNumber) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.custId = custId;
		this.userName = userName;
		this.passWord = passWord;
		this.balance = balance;
		this.amount = amount;
		this.accountNumber=accountNumber;
		
		BankRecord.customerList.add(this);
		FileStuff.writeCustomerFile(BankRecord.customerList);
		LogThis.LogIt("info","New customer "+this.fName+" has been added");
	}*/


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


	public int getCustId() {
		return custId;
	}


	public void setCustId(int custId) {
		this.custId = custId;
	}


	public  int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassWord() {
		return passWord;
	}


	public void setPassWord(String passWord) {
		this.passWord = passWord;
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
	
	 public  void customerLogin( String uname,String pword) {
    	 
  	   
	   		for (int i = 0; i < BankRecord.customerList.size(); i++) {
	   			String userName= BankRecord.customerList.get(i).getUserName();
	   			String userPassword= BankRecord.customerList.get(i).getPassWord();
	   			
	   			if(userName.equals(uname) && userPassword.equals(pword)) {
	   				System.out.println("Login Successful!");
	   			} else {
	   				
	   				System.out.println("Please input correct username and password.");
	   				//MeanuSystem.whichMenu();
	   			}
	   		}
	   		
	   	}


	 //All Method:
			public  void depositMoney(double amount) {
				if(amount < 0) {
					System.out.println("Let's serious!");
					
				}
				
				this.balance += amount;
				System.out.println("successfuly diposit money "+this.balance);
				FileStuff.writeCustomerFile(BankRecord.customerList);
			
			
			}
			
			public void withdrawMoney(double amount) {
				
				
		        if (amount < 0) {
		            System.out.println ("Cannot withdraw a negative amount.");
		        
		        } else {
		          
		        	 this.balance = this.balance - amount;
		            System.out.println("Successfully widthdraw Money $"+this.amount+"New balance :$"+balance);
		            FileStuff.writeCustomerFile(BankRecord.customerList);
		        }
		       

			}
		public void makeTransfer(double amount, CustomerAccount b) {
				double sBalance=b.getBalance();
				
				if(this.balance==0) {
					System.out.print("you need money");
				}else {
					this.balance=balance-amount;
				         if(this.balance<0) {
		    	  System.out.println("Can't do that"); 
		    	   
		       }else {
		    	   
		    	   b.setBalance(sBalance+amount);
		    	   FileStuff.writeCustomerFile(BankRecord.customerList);
		    	   System.out.println("Successfully Transfer and current balance is : $"+this.balance);
		       }
			
				}
		       
		    }
		public static void viewBalance() {
			
			double bal=MeanuSystem.c.getBalance();
			System.out.println("Balance is: $"+ bal);
		}


			@Override
			public String toString() {
				return "CustomerAccount [fName=" + fName + ", lName=" + lName + ", custId=" + custId + ", userName="
						+ userName + ", passWord=" + passWord + ", balance=" + balance + ", amount=" + amount + "]";
			}
			
	
	
	
	
	
	
	

}

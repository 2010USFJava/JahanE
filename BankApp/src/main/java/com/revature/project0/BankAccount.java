package com.revature.project0;

import java.util.Arrays;

public class BankAccount {
	private static int AccountNumber=0;//generated automatically ad unique to each account
	private double balance;
	private double amount;
	private CustomerAccount[]holder;
	
	public BankAccount() {
		super();
	}
	
	public BankAccount(double balance, double amount, CustomerAccount[] holder) {
		super();
		this.balance = balance;
		this.amount = amount;
		this.holder = holder;
		++AccountNumber;
	}

	public static int getAccountNumber() {
		return AccountNumber;
	}

	public static void setAccountNumber(int accountNumber) {
		AccountNumber = accountNumber;
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

	public CustomerAccount[] getHolder() {
		return holder;
	}

	public void setHolder(CustomerAccount[] holder) {
		this.holder = holder;
	}
	
	//open an bank account:
	
	// - deposit() will deposit a spicific amount of money to the account
		public void depositMoney(double amount) {
			if(amount < 0) {
				System.out.println("Let's serious!");
				return;
			}
			this.balance += amount;
			System.out.println("successfuly diposit money "+this.balance);
		
			
		}
		// - withdraw() will remove specific amount of money if there are sufficient funds
		public String withdrawMoney(double amount) {
			if(amount < 0 || amount > balance) {
				System.out.println("Not enough sufficient funds");
				
			}
			this.balance -= amount;
			String bal="successfuly withdraw money "+this.balance;
			return bal;
		}
		public boolean transferAmount(BankAccount dAccount, double amount) {
			if(this.balance >= amount) {
			this.balance -= amount;
			dAccount.balance += amount;
			return true;
			}
			return false;
	}

		@Override
		public String toString() {
			return "BankAccount [balance=" + balance + ", amount=" + amount + ", holder=" + Arrays.toString(holder)
					+ "]";
		}
		

}

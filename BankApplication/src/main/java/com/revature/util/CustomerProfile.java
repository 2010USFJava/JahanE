package com.revature.util;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.bean.BankAccount;
import com.revature.bean.CustomerAccount;
import com.revature.bean.Singing;
import com.revature.dao.BankAccountDao;
import com.revature.dao.CustomerAccountDao;
import com.revature.daoImpl.BankAccountDaoImpl;
import com.revature.daoImpl.CustomerDaoImpl;

public class CustomerProfile {
	
	static Scanner sc = new Scanner(System.in);
	static CustomerAccountDao ca = new CustomerDaoImpl();
	static BankAccountDao ba = new BankAccountDaoImpl();
	
	
	
	public static void openCustomerInput() {
	double balance;
	System.out.println("please Enter your first name");
	String firstName=sc.nextLine();
	System.out.println("please Enter your last name");
	String lastName=sc.nextLine();
	System.out.println("please Enter your user name");
	String userName=sc.nextLine();
	System.out.println("please Enter your password");
	String password=sc.nextLine();
	do {
		System.out.println("please Enter your balance");
		 balance=Double.parseDouble(sc.nextLine());
	}while(balance<0);
	try {
	ba.insertNewCustomerData(balance);
	ca.insertNewCustomer(firstName, lastName, userName, password);
	//view all information
	} catch (SQLException e) {
		e.printStackTrace();
	}

   }
	
 public static void chekBalanceCustomer() {
		
		try {
			System.out.println(" balance is $: " +ba.checkCustomerBalance(CustomerDaoImpl.findId));//input id
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		
		
	}
	public static void depositMoney() {
		try {
			ba.depositBalance();
			System.out.println("successfully Deposit :"+"Now current balance is :"+ba.checkCustomerBalance(CustomerDaoImpl.findId));
			
		}catch (SQLException e) {
		e.printStackTrace();
		}
	}
	public static void withdrewMoney() {
	
	try {
	ba.withdrawBalance();
		System.out.println("successfully withdraw "+"Now current balance is :"+ba.checkCustomerBalance(CustomerDaoImpl.findId));
		
	}catch (SQLException e) {
	e.printStackTrace();
	}
	
	
	}
	public static void viewAllAccountInformation() {
		try {
			List<BankAccount> listAccount =(ArrayList<BankAccount>)ba.viewBankAccountsByID();//input id
			List<CustomerAccount> cList = (ArrayList<CustomerAccount>)ca.AllCustomerAccountById();
			System.out.println("All Customer List is :");
			System.out.println(cList.toString());
			System.out.println(listAccount.toString());
			}catch (SQLException e) {
				e.printStackTrace();
			}
    }
		public static void delectEmptyAccout() {
			try {
				if(ba.checkCustomerBalance(CustomerDaoImpl.findId)==0) {
					ca.deleteCustBankAccount(CustomerDaoImpl.findId);
					ba.deleteCustBankAccount(CustomerDaoImpl.findId);
				}else {
					System.out.println("Sorry this customer Has Balance, You cant't delect this Account");
				}
				
					//System.out.println(pd.toString());
				} catch (SQLException e) {
					e.printStackTrace();

				}
			
		
		
		
			
			
			
			
			
//			public static void printList() {
//		 		for(CustomerAccount ca:cList) {
//		 			System.out.println("All Customer List: " + c);
//		 		}
//		 		
//		 		for(BankAccount ba: listAccount) {
//		 			System.out.println("All Account List: " + b);
//		 		}
//		 	}
			
		}
		
		
	}
	

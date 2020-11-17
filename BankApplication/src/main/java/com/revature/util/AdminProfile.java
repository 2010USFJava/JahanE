package com.revature.util;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.bean.CustomerAccount;
import com.revature.dao.BankAccountDao;
import com.revature.dao.CustomerAccountDao;
import com.revature.daoImpl.BankAccountDaoImpl;
import com.revature.daoImpl.CustomerDaoImpl;
import com.revature.menu.MainMenu;

 public class AdminProfile {
	static Scanner sc = new Scanner(System.in);
	static String menu="";
	static CustomerAccountDao ca = new CustomerDaoImpl();
	static BankAccountDao ba = new BankAccountDaoImpl();
	
	
public static void delectCustomerAccout() {
		try {
			 
				ca.deleteCustBankAccount(CustomerDaoImpl.findId);
				ba.deleteCustBankAccount(CustomerDaoImpl.findId);
			} catch (SQLException e) {
				e.printStackTrace();

			}
}
		
  public static void editCustomerByName() {
			try {
				System.out.println("Please enter your last name: ");
			String lastName = sc.nextLine();
			System.out.println("Enter the user Id number to update customer information");
        	int userId = sc.nextInt();
			ca.updateCustomerLastName(lastName, userId);
				
				
			} catch (SQLException e) {
				e.printStackTrace();

			}
			
				}
				
		
		
  
		
		
		

	
	
	
	
	
	
	
	}



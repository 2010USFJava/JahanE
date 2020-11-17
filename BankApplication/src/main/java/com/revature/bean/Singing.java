package com.revature.bean;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.dao.BankAccountDao;
import com.revature.dao.CustomerAccountDao;
import com.revature.daoImpl.AdminDaoImpl;
import com.revature.daoImpl.BankAccountDaoImpl;
import com.revature.daoImpl.CustomerDaoImpl;



public class Singing {
	static CustomerAccountDao pd=new CustomerDaoImpl();
	static BankAccountDao ba=new BankAccountDaoImpl();
	
	
	static Scanner sc = new Scanner(System.in);
	public static void customerSignin() {
		System.out.println("Enter the Username:");
   		String username = sc.nextLine();
   		System.out.println("Enter the Password:");
   		String password = sc.nextLine();
   		CustomerDaoImpl pd=new CustomerDaoImpl();
   		try {
   			if(pd.findByUserName(username)==pd.findBypassWord(password)) {
 		    System.out.println("Successful Login to you Account");
 	   	}else {
 	   			System.out.println("Opps Error--try again.");
 	   		}	 
 		    }catch (SQLException e) {
			e.printStackTrace();
		}
 		
	}
	public  static void adminLogin() {
		System.out.println("Enter the admin Username:");
   		String username = sc.nextLine();
   		System.out.println("Enter the admin Password:");
   		String password = sc.nextLine();
   		
   		AdminDaoImpl adm=new AdminDaoImpl();
   		try {
   			if(adm.findByUserName(username)==adm.findBypassWord(password)) {
 		    System.out.println("Successful Login to you Account");
 	   	}else {
 	   			System.out.println("Opps Error--try again.");
 	   		}	 
 		    }catch (SQLException e) {
			e.printStackTrace();
		}
   			
   		}
   
    
     

}

package com.revature.driver;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.bean.AdminClass;
import com.revature.bean.BankAccount;
import com.revature.bean.CustomerAccount;
import com.revature.bean.Singing;
import com.revature.daoImpl.AdminDaoImpl;
import com.revature.daoImpl.BankAccountDaoImpl;
import com.revature.daoImpl.CustomerDaoImpl;
import com.revature.menu.MainMenu;
import com.revature.util.CustomerProfile;



public class DriverOfSql {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
//		CustomerDaoImpl ne = new CustomerDaoImpl();
//		try {
//			ne.insertNewCustomer(new CustomerAccount());
//			System.out.println(ne.toString());
//		} catch (SQLException e) {
//			e.printStackTrace();
//
//		}
//		CustomerDaoImpl pd=new CustomerDaoImpl();
//		try {
//			CustomerAccount c=pd.retriveById(2);
//			System.out.println(c.toString());
//			}catch (SQLException e) {
//				e.printStackTrace();
//			}
//		
//		BankAccountDaoImpl ba=new BankAccountDaoImpl();
//		try {
//		BankAccount b=ba.retriveById(1);
//			System.out.println(b.toString());
//			}catch (SQLException e) {
//				e.printStackTrace();
//			}
		
//		BankAccountDaoImpl ba=new BankAccountDaoImpl();
//		try {
//			ba.depositBalance(1);
//			System.out.println(ba.toString());
//			
//		}catch (SQLException e) {
//		e.printStackTrace();
//		}
//		BankAccountDaoImpl ba1=new BankAccountDaoImpl();
//		try {
//			ba.withdrawBalance(1);;
//			System.out.println(ba1.toString());
//			
//		}catch (SQLException e) {
//		e.printStackTrace();
//		}
//	}
//	CustomerDaoImpl pd=new CustomerDaoImpl();
//	try {
//		CustomerAccount c=pd.emptyAccountDeletById(2);
//		System.out.println("delete the whole customer"+c.toString());
//		}catch (SQLException e) {
//			e.printStackTrace();
//		}
//		Singing.customerSignin();
//		System.out.println("loging");
		
//		AdminDaoImpl ad=new AdminDaoImpl();
//		try {
//		AdminClass a=ad.retriveById(1);
//			System.out.println(a.toString());
//			}catch (SQLException e) {
//				e.printStackTrace();
//			}
		//Singing.adminLogin();
//		BankAccountDaoImpl ne = new BankAccountDaoImpl();
//		try {
//			ne.insertNewCustomerData(new BankAccount());
//			System.out.println(ne.toString());
//		} catch (SQLException e) {
//			e.printStackTrace();
//
//		}
	//CustomerProfile.openCustomerInput() ;
		
		//show customer List for account and customer list
//		BankAccountDaoImpl ba = new BankAccountDaoImpl();
//		CustomerDaoImpl pd = new CustomerDaoImpl();
//		try {
//			List<BankAccount> listAccount = (ArrayList<BankAccount>) ba.viewBankAccountsByID(1);
//			List<CustomerAccount> cList = (ArrayList<CustomerAccount>) pd.AllCustomerAccountById(1);
//			System.out.println(cList.toString() + listAccount.toString());
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		//CustomerProfile.findTheAccountId();
		
//		BankAccountDaoImpl ne = new BankAccountDaoImpl();
//		CustomerDaoImpl pd = new CustomerDaoImpl();
//		try {
//		ne.deleteCustBankAccount(4);
//		pd.deleteCustBankAccount(4);
//			//System.out.println(pd.toString());
//		} catch (SQLException e) {
//			e.printStackTrace();
//
//		}
		MainMenu.mainMenu();
    
	}
	
}

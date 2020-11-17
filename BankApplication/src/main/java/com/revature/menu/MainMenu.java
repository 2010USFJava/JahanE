package com.revature.menu;
import java.sql.SQLException;
import java.util.Scanner;
import com.revature.bean.AdminClass;
import com.revature.bean.BankAccount;
import com.revature.bean.CustomerAccount;
import com.revature.bean.Singing;
import com.revature.dao.CustomerAccountDao;
import com.revature.daoImpl.CustomerDaoImpl;

import com.revature.util.AdminProfile;
import com.revature.util.CustomerProfile;


public class MainMenu {
	static CustomerAccountDao ca = new CustomerDaoImpl();
	static String menu;
	static Scanner sc = new Scanner(System.in);
	static CustomerAccount c=new CustomerAccount();
	static BankAccount b=new BankAccount();
	
	
	public static void mainMenu() {
		
		System.out.println("***************************************");
		System.out.println("<><><><><WELCOME TO JahanJDBC BANK><><><><><>");
		System.out.println("***************************************");
		System.out.println("Please select your option");
		System.out.println("\t[c]Customer");
		System.out.println("\t[a]Admin");
		System.out.println("\t[q] Quit Bank");
		System.out.println("***************************************");
		menu = sc.nextLine();
		switch(menu.toLowerCase()) {
		case "c":
		startMenu();
		   break;
		case "a":
			Singing.adminLogin();
			adminMenu();
		  break;
		  
		case "q":
			System.out.println("===========================================");
			System.out.println("You are Logged Out !!!Thank you for being with us, See you Soon");
			System.out.println("============================================");
			mainMenu();
		break;
		default: 
			System.out.println("Sorry Try again*******Good Bye");
			System.out.println("================================");
		    mainMenu();
		    }
		}
	
    public static void startMenu(){
		System.out.println("**************************************");
		System.out.println("Welcome!!!!! Please Select the option: ");
		System.out.println("\t [l]Login for Existing Customer");
		System.out.println ("\t [r]Register for new Customer"); 
		System.out.println("****************************************");
		menu = sc.nextLine();
		
		switch(menu.toLowerCase()) {
		case "l":
			Singing.customerSignin();
		    customerMenu();
			break;
		case "r":
			CustomerProfile.openCustomerInput() ;
			startMenu();
			break;
		default:
			System.out.println(" Please try again.");
			startMenu();
			break;
			}
	}
    public static void customerMenu() {
		System.out.println("=============WELCOME================");
		System.out.println("What would you like to do?");
		System.out.println("\t[b]View balance");
		System.out.println("\t[v]View Account Information");
		System.out.println("\t[d]Deposit");
		System.out.println("\t[w]Withdraw ");
		System.out.println("\t[e]Delete Empty Account");
		System.out.println("\t[l]LogOut");
		System.out.println("=======================================");
		
		menu = sc.nextLine();
		switch(menu.toLowerCase()) {
			case "b":
				CustomerProfile.chekBalanceCustomer();
				customerMenu();
				break;
			case "v":
				CustomerProfile.viewAllAccountInformation();
				customerMenu();
				break;
				
			case "d":
				CustomerProfile.depositMoney();
			customerMenu();
				break;
			case "w":
		CustomerProfile.withdrewMoney();
				customerMenu();
				
				break;
			
			case "e":
			CustomerProfile.delectEmptyAccout();
				customerMenu();
				
				break;
			case "l":
			System.out.println("LogOut from Account");
			mainMenu();
				break;
			default:
				mainMenu();
				break;
		}
	
    }
    public static void adminMenu() {
    	
		System.out.println("=============WELCOME================");
		System.out.println("What would you like to do?");
		System.out.println("\t[v]View balance");
		System.out.println("\t[i]View Customer Information");
		System.out.println("\t[c]Create Customer Account ");
	    System.out.println("\t[u]Update Information");
		System.out.println("\t[d]Delete Customer Account");
		System.out.println("\t[l]LogOut");
	    System.out.println("=======================================");
		
		
		menu = sc.nextLine();
		switch(menu.toLowerCase()) {
			case "v":
				System.out.println("Enter Customer Id That you want view balance");
				System.out.println("-----------------------------------------");
				int id=sc.nextInt();
				sc.nextLine();
				CustomerDaoImpl.findId=id;
				CustomerProfile.chekBalanceCustomer();
				adminMenu();
				break;
			case "i":
				System.out.println("All customer Inforamition:");
				System.out.println("-----------------------------------------");
				CustomerProfile.viewAllAccountInformation();
				adminMenu();
				break;
			case "c":
				System.out.println("Want to open account for new Customer Enter all required field");
				System.out.println("----------------------------------------------------------------");
				CustomerProfile.openCustomerInput() ;
				adminMenu();
				
				break;
			case "u":
				
				
				
				AdminProfile.editCustomerByName();
				adminMenu();
				
				break;
			case "d":
				System.out.println("Enter Customer Id That you want Delete");
				System.out.println("-----------------------------------------");
				int inputId=sc.nextInt();
				sc.nextLine();
				CustomerDaoImpl.findId=inputId;
				AdminProfile.delectCustomerAccout();
				adminMenu();
				
				break;
			case "l":
			
				System.out.println("Succefully logOut!!!Nice to see you Again! Goodbye!");
				System.out.println("*******************************");
				mainMenu();
				break;
			   default:
				mainMenu();
				break;
		}
		
	
    }
}

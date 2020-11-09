package com.revature.bean;

import java.util.Scanner;

import com.revature.function.ViewCustomer;
import com.revature.util.BankRecord;
import com.revature.util.LogThis;

public class MeanuSystem {
	
	static String menu;
	public static CustomerAccount c=new CustomerAccount();
	static Scanner sc = new Scanner(System.in);
		public static void whichMenu() {
			System.out.println("Welcome to ABC Bank, Please select your menu");
			System.out.println("\n  [c]Customer");
			System.out.println("\n  [e]Employee");
			System.out.println("\n  [a]Admin");
			System.out.println( "\n [q]Quit Bank");
		    menu = sc.nextLine();
			switch(menu.toLowerCase()) {
			
			case "c":
				System.out.println("Welcome to customer page");
				System.out.println("Are you in New Customer or Exiting customer");
				System.out.println("Please choose an option:"
						+ "\n  [nc] New Customer"
						+ "\n  [ec] Exiting Customer");
				menu = sc.nextLine();
				switch(menu.toLowerCase()) {
				case "nc": 
					System.out.println("I want to apply for new account, can you help me ?");
					System.out.println("Well, Are you want Saving Account OR Joint Account:"
							+ "\n [s] Saving Account"
							+ "\n [j] Joint Account");
					menu = sc.nextLine();
					switch(menu.toLowerCase()) {
					case "s" :
						OpenCustAccount();
						whichMenu();
						break;
					
				case "j":
					jointAccount();
					whichMenu();
					break;
				}
				case "ec": 
					System.out.println("Please Login to your Account");
					customerLog();
					whichMenu();
					break;
					}
				
			case "e":
				System.out.println("Welcome to employee page");
				
				System.out.println("what Do want to do?"
						+"\n [ap] approved"
						+ "\n [de] denied");
				menu = sc.nextLine();
				
				switch (menu.toLowerCase()) {
				case "ap":
					
					System.out.println("Approved");
					viewCustomerInfo();
					whichMenu();
					break;
				case "de":
					System.out.println("Denied");
					whichMenu();
					break;
				}
				
			case "a":
				System.out.println("Welcome to Admin page"
						+ "\n If want to view customer information :");
				
				viewCustomerInfo();
				break;
				case "q":
				System.out.println("Have a nice Day :-)--Thank you for chosing ABC bank");
				break;
				default: 
					System.out.println("Sorry bad Try");
					whichMenu();
				}	
			}
			
			
		
       public static void OpenCustAccount() {
    	   System.out.println("Welcome, let's start and Create a new account!");
    	   System.out.println("Enter a new  customer first name !");
		   String custfiName=sc.nextLine();
		   System.out.println("Enter a new customer last name !");
		   String custlaName=sc.nextLine();
		   System.out.println("chose  a userName !");
		   String custName=sc.nextLine();
		   System.out.println("chose  a passWord !");
		   String custPass=sc.nextLine();
		   System.out.println("New customer Id!");
		   int cId=Integer.parseInt(sc.nextLine());
		   System.out.println("Balance  !");
		   double cBalance=Double.parseDouble(sc.nextLine());
		   System.out.println("New customer accountNumber!");
		   int cAccount=Integer.parseInt(sc.nextLine());
		   CustomerAccount c = new CustomerAccount(custfiName,custlaName,custName,custPass,cBalance,cAccount);
		   LogThis.LogIt("info" , c.getfName()+"customer Added");
		   
		   
		   System.out.println("Account Request Send!");
		  
		   
		   MeanuSystem.whichMenu();
			
		}
       public static void jointAccount() {//need to work
    	   System.out.println("Enter a new  customer first name !");
		   String custfiName=sc.nextLine();
		   System.out.println("Enter a new customer last name !");
		   String custlaName=sc.nextLine();
		   System.out.println("chose  a userName !");
		   String custName=sc.nextLine();
		   System.out.println("chose  a passWord !");
		   String custPass=sc.nextLine();  
		   System.out.println("New customer Id!");
		   int cId=Integer.parseInt(sc.nextLine());
		   System.out.println("Balance  !");
		   double cBalance=Double.parseDouble(sc.nextLine());
		   System.out.println("New customer accountNumber!");
		   int cAccount=Integer.parseInt(sc.nextLine());
		   System.out.println("Enter your account number that you will be making joint");
			int userChoice = sc.nextInt();
			CustomerAccount a=BankRecord.findByAccount(userChoice);
			ViewCustomer view=new ViewCustomer();
			view.viewCustomerDetails(a);
			 CustomerAccount c = new CustomerAccount(custfiName,custlaName,custName,custPass,cBalance,cAccount);
			  //LogThis.LogIt("info" ,c.getAccountNumber()+"Added");
       }
     
       
       public static void viewCustomerInfo() {
    	   
			System.out.println("Please enter customer name");
			String fname=sc.nextLine();
			CustomerAccount a=BankRecord.findByName(fname);
			ViewCustomer view=new ViewCustomer();
			view.viewCustomerDetails(a);
			LogThis.LogIt("info", a.getfName()+" was Recorded");
			System.out.println("Customer name: "+a.getfName() + a.getlName()
			+"\nCustomer Username: "+a.getUserName()
			+"\nCustomer Password: "+a.getPassWord()
			+"\nCustomer Account Numer: "+a.getAccountNumber()
			+ "\n Customer Balance :"+a.getBalance() );
	System.out.println("want search again?"
			+ "\n [y] yes"
			+ "\n [n] no");
	 menu=sc.nextLine();
			switch (menu.toLowerCase()) {
			case "y":
				viewCustomerInfo();
				break;
			case "n":
				System.out.println(" Are Customer OR employee OR Admin ?"
				+"\n [customer] Customer"
				+ "\n [employee] Employee"
                + "\n [admin] Admin");
		menu =sc.nextLine();
		switch(menu.toLowerCase()) {
		case "customer":
		whichFunction();
		break;
		case "employee":
			whichMenu();
			break;
		case "admin":
			deletCustomer();
			break;
		default:
			System.out.println("Invalid Input");
			whichMenu();
		}
			default:
				System.out.println("sorry");
				whichMenu();
			}
		}
      
		private static void whichFunction() {
			//System.out.println(CustomerAccount.viewBalance());
			//CustomerAccount c = new CustomerAccount();
			ViewCustomer view = new ViewCustomer();
			view.viewCustomerDetails(c);
           // System.out.println("balance"+c.getBalance());
			System.out.println("What function wan to see?" 
			        + "\n [d] Deposit"
			        + "\n [w] Withdraw"
					+ "\n [t] Transfer"
					+ "\n [b] Balance"
					+"\n [m] Menu ");
			menu = sc.nextLine();
			switch (menu.toLowerCase()) {
			case "d":
				System.out.println("Enter the customer that you want deposit");
				String fname=sc.nextLine();
                System.out.println("How much you want deposit");
                CustomerAccount a=BankRecord.findByName(fname);
                double cBalance =Double.parseDouble(sc.nextLine());
				c.depositMoney(cBalance);
				
				whichFunction();
				break;
			case "w":
				System.out.println("Enter the customer that you want widtdrew");
				String fname2=sc.nextLine();
				System.out.println("How much you want withdrew");
				CustomerAccount a1=BankRecord.findByName(fname2);
				double wBalance = Double.parseDouble(sc.nextLine());
				c.withdrawMoney(wBalance);
				
				whichFunction();
				break;
			case "t":
				System.out.println("How much Money you want transfer");
				double uAccount = Double.parseDouble(sc.nextLine());
				System.out.println("Enter your name");
				String fname3=sc.nextLine();
				CustomerAccount a2=BankRecord.findByName(fname3);
				System.out.println("Enter your name that account to transfer?");
				String fname7=sc.nextLine();
				CustomerAccount a4=BankRecord.findByName(fname7);
				if (uAccount >= 1) {
					c.makeTransfer(uAccount, a4);
				}else {
					System.out.println("Invalid procedure");
				}
				
                whichFunction();
				
				break;
			case "b":

				System.out.println("Enter the customer that you want to view Account");
				String fname1=sc.nextLine();
				CustomerAccount a5=BankRecord.findByName(fname1);
				c.viewBalance();
				//LogThis.LogIt("info"," Your new balance is "+ c.viewBalance());
				
				whichFunction();
				break;
			case "m":
				whichMenu();
				break;

			default:
				System.out.println("Invalid Input");
				whichMenu();
				break;
			}

		}
       
       
       public static void deletCustomer() {
    	   //BankRecord b=new BankRecord();
			System.out.println("Do you want to delet the Account"
			
			+ "\n [y] yes"
			+ "\n [n] no");
	 menu=sc.nextLine();
			switch (menu.toLowerCase()) {
			case "y":
				deletMethod();
				whichMenu();
				break;
			case "n":
				whichMenu();
				break;
				default:
				System.out.println("Sorry Again");
				
				break;
				
			}
       }
       public static void deletMethod() {
    	   System.out.println("Please enter customer name");
			String fn=sc.nextLine();
			CustomerAccount a=BankRecord.deletByName(fn);
			ViewCustomer view=new ViewCustomer();
			view.viewCustomerDetails(a);
			System.out.println("Customer :"+a.getfName()+" deleted ");
    	 
    	   
       }
       public static void customerLog() {
   		System.out.println("Enter the Username:");
   		String username = sc.nextLine();
   		System.out.println("Enter the Password:");
   		String password = sc.nextLine();
   		
   		if(BankRecord.findByUserName(username) == BankRecord.findBypass(password)) {
   			System.out.println("Successful Login to you Account");
   			viewCustomerInfo();
   		}else {
   			System.out.println("Opps Error--try again.");
   			customerLog();
   		}
       }
       
     /*  public static void approveOrDeny() {
    	   CustomerAccount c=new CustomerAccount();
    	   CustomerAccount c2=new CustomerAccount();
			ViewCustomer view=new ViewCustomer();
			view.viewCustomerDetails(c);
			ViewCustomer view2=new ViewCustomer();
			view2.viewCustomerDetails(c2);
    	   
				if(c.getfName()==c2.getfName()) {
					System.out.println("Approved---here the information"+c.toString());
					
				}else {
			
			
				System.out.println("deny");}
				
    	   
       }
	*/

}

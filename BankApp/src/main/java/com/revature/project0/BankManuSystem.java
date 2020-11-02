package com.revature.project0;

import java.util.Scanner;

public class BankManuSystem {
	
	static String menu;
	static Scanner sc = new Scanner(System.in);
		public static void whichMenu() {
			System.out.println("Welcome to our Bank, Please select your menu");
			System.out.println("\n  [s]saving account Application");
			System.out.println("\n  [j]joint account Application");
			System.out.println("\n  [c]Customer");
			System.out.println("\n  [e]Employee");
			System.out.println("\n  [a]Admin");
			System.out.println( "\n [q]Quit Bank");
		    menu = sc.nextLine();
			switch(menu.toLowerCase()) {
			case "s" : 
				System.out.println("Thanks for chosing Saving Account option");
				//createNewsaving account for Customer();
				whichMenu();
				break;
			case "j":
				System.out.println("Thanks for select joint account option");
				//create joint account for new customer;
				whichMenu();
				break;
			case "c":
				System.out.println("Welcome to customer page");
				//customerLog();
				//which part you want to see
				//deposite();
				//withwrew();
				//transfer();
				whichMenu();
				break;
				
			case "e":
				System.out.println("Welcome to employee page");
				employeeLog();
				//which part you want to see
				// retavie information();
				//retaive bank information();
				whichMenu();
				break;
			case "a":
				System.out.println("Welcome to Admin page");
				adminLog();
				//which part you want to see
				// retavie information();
				//retaive bank information();
				//delete account();
				whichMenu();
				break;
			
			case "q":
				System.out.println("Have a nice Day :-)");
				break;
				default: 
					System.out.println("Sorry bad Try");
					whichMenu();
					
			}
		
	
		}
		public static void createSavingAccount() {
			
			
			
		}
		
       public static void createJointAccount() {
			
			
			
		}
       public static void customerLog(CustomerAccount c) {
    	   System.out.println("Customer:");
    	   BankManuSystem customer= new BankManuSystem();
    	
   		   System.out.println("Enter your username:");
   		   //c.setuName(uName)=sc.next();
   		
   		
   		   System.out.println("Password your password:");
   		   //pWord=sc.next();
   		
   		
			
		}
       public static void employeeLog() {
			
    	  
			
		}
       public static void adminLog() {
			
    	  
   		
   		
			
		}
	
      
      
       

}

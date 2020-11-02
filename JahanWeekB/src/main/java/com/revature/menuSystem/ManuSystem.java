package com.revature.menuSystem;

import java.util.Scanner;

import com.revature.bean.Customer;
import com.revature.util.CustList;
import com.revature.util.LogTheFile;

public class ManuSystem {
	
	

	static Scanner sc = new Scanner(System.in);
		public static void menu() {
			
			System.out.println("Welcome to all customers");
			System.out.println("\n  [n]new customer");
			System.out.println("\n  [o]old custumer");
			System.out.println( "\n [q]Quit System");
			String menu=sc.nextLine();
			
			switch(menu.toLowerCase()) {
				case "n":
					newCustomer();
					break;
				case "o":
					oldCustomer();
					break;
				case "q":
					System.out.println("see you Again");
					break;
				default:
					System.out.println("Sorry bad Try");
					menu();
					break;			
		}

}
		
		public static void newCustomer() {
			
			System.out.println("Enter the name  customer");
			String fN= sc.nextLine();
			Customer c= CustList.findByName(fN);
			Customer c2=new Customer("Esrat",02,23,"old");
			LogTheFile.LogIt("info", c2.getName()+"Customer List, " );
			
			
			
		}
		
		
		
		
		
		public static void oldCustomer() {
			System.out.println("Enter the name  customer");
			String f= sc.nextLine();
			Customer c= CustList.findByName(f);
			System.out.println("Enter the another name  customer");
			String o= sc.nextLine();
			Customer c1= CustList.findByName(o);
			if(c.equals(o)) {
				System.out.println("name Exit");
			}else {
				System.out.println(" not match");
			}
			
			
			
		}
}

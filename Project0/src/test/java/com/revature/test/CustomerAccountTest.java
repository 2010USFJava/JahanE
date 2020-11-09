package com.revature.test;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.bean.CustomerAccount;



public class CustomerAccountTest {
	
	@BeforeClass
	public static void initialSetUp(){
		System.out.println("Run before test loaded");
	}
	@Before
	public void runBeforeEachTest() {
		System.out.println("Running before each test.");
	}
	
	
	
	
	@Test
	public void depositTesting() {
		CustomerAccount acc=new CustomerAccount();
		acc.setBalance(500);
		int value=(int)acc.getBalance();
		assertEquals(500,value);
		
		}
	

	@Test
	public void withdrawTesting() {
		CustomerAccount acc=new CustomerAccount();
		acc.setBalance(50);
		int value=(int)acc.getBalance();
		assertEquals(50,value);
		
		}
	@Test
	public void transferTesting() {
		CustomerAccount acc=new CustomerAccount();
		CustomerAccount acc1=new CustomerAccount();
		acc.setBalance(400);
		acc1.setBalance(100);
		
		int value=(int)acc.getBalance();
		int value1=(int)acc1.getBalance();
		assertEquals(400,value);
		assertEquals(100,value1);
		
		}
	
	
}

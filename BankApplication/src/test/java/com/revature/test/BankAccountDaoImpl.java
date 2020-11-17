package com.revature.test;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.bean.BankAccount;
import com.revature.bean.CustomerAccount;
import com.revature.dao.BankAccountDao;
import com.revature.dao.CustomerAccountDao;
import com.revature.daoImpl.CustomerDaoImpl;
import com.revature.util.LogThis;

public class BankAccountDaoImpl {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

	@BeforeClass
	public static void initialSetUp(){
		System.out.println("Run before test loaded");
	}
	@Before
	public void runBeforeEachTest() {
		System.out.println("Running before each test.");
	}
	@Test
	public void logTest() {
		LogThis.LogIt("info", "logger working!");
	}
	@Test
	public void depositTest() throws SQLException {
		
	}
	@Test
	public void withdrawTest() throws SQLException {
		
	}

}

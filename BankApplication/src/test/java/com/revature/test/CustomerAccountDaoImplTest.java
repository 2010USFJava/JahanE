package com.revature.test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.bean.CustomerAccount;
import com.revature.dao.CustomerAccountDao;
import com.revature.daoImpl.CustomerDaoImpl;
import com.revature.util.LogThis;

public class CustomerAccountDaoImplTest {

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
	public void deleteCustomer() throws SQLException {
		CustomerAccountDao cdi = new CustomerDaoImpl();
		cdi.deleteCustBankAccount(7);
		CustomerAccount c = new CustomerAccount();
		String r = c.toString();
		assertEquals(r, null);
	}
	@Test
	public void findUserNme() throws SQLException {
		CustomerAccountDao cdi = new CustomerDaoImpl();
		cdi.findByUserName("esrat");
		CustomerAccount c = new CustomerAccount();
		String r = c.toString();
		assertEquals(r, null);
	}
	
	
	
}

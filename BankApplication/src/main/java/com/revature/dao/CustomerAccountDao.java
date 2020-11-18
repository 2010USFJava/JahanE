package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.bean.CustomerAccount;



public interface CustomerAccountDao {
	
	//insert
	public void insertNewCustomer(String firstName,String lastName,String userName,String password)throws SQLException;
	
	public List<CustomerAccount> AllCustomerAccountById() throws SQLException;
	//retive
	public CustomerAccount retriveById(int user_id)throws SQLException;
	
	//username
	public  CustomerAccount findByUserName(String userName)throws SQLException;
		
	//password
	public  CustomerAccount findBypassWord(String passWord)throws SQLException;
	
	public int findUserAccountId()throws SQLException;
	
	//delect emptyAccount
	public void deleteCustBankAccount(int account_id) throws SQLException;
	
	//update
	public void updateCustomerLastName(String lastName, int user_id) throws SQLException;
	
	public int countAllCustomer() throws SQLException;
	
	
	
	

}

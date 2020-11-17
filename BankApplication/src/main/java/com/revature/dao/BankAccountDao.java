package com.revature.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.bean.BankAccount;
import com.revature.bean.CustomerAccount;

public interface BankAccountDao {
	
	//insert
	public void insertNewCustomerData(double balance)throws SQLException;
	
	//view information by ID
	public List<BankAccount> viewBankAccountsByID () throws SQLException;
	
	//retive information
	public BankAccount retriveById(int account_id)throws SQLException;
	
	//view Balance
	public double checkCustomerBalance(int account_id) throws SQLException;
     
	public void depositBalance()throws SQLException;
	
	public void withdrawBalance()throws SQLException;
	
	public void updateFunction(int account_id, double balance) throws SQLException;
	
	//delete account 
	public void deleteCustBankAccount(int account_id) throws SQLException;
	 

}


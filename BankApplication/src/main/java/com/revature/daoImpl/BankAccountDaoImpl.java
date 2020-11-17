package com.revature.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.bean.BankAccount;
import com.revature.dao.BankAccountDao;
import com.revature.util.ConnFactory;
import com.revature.util.LogThis;

public class BankAccountDaoImpl implements BankAccountDao{
	static Scanner sc = new Scanner(System.in);
    public static ConnFactory cf=ConnFactory.getInstance();

@Override
public void insertNewCustomerData(double balance) throws SQLException {
	Connection conn=cf.getConnection();
	String sql="insert into account values(DEFAULT,?,?)";
	PreparedStatement ps=conn.prepareStatement(sql);
	ps.setDouble(1, balance);
	ps.setString(2, "saving");
	ps.executeUpdate();
		
}

@Override
public List<BankAccount> viewBankAccountsByID() throws SQLException {
	List<BankAccount> listAccount = new ArrayList<BankAccount>();
	Connection conn = cf.getConnection();
	String sqlList = "select * from account";
	PreparedStatement ps = conn.prepareCall(sqlList);
	
	
	ResultSet rs = ps.executeQuery();
	
	while (rs.next()) {
	BankAccount b = new BankAccount(rs.getInt(1),rs.getDouble(2),rs.getString(3));
		listAccount.add(b);
	}
	return listAccount;
}
@Override
public double checkCustomerBalance(int account_id) throws SQLException {
	double balance = 0;
	Connection conn = cf.getConnection();
	String sqlBal = "select balance from account where account_id=?";
	PreparedStatement ps = conn.prepareStatement(sqlBal);
	
	ps.setInt(1, account_id);
	ResultSet rs = ps.executeQuery();
	while(rs.next()) {
		balance = rs.getDouble(1);
	}
	
	return balance;
}



@Override
public BankAccount retriveById(int account_id) throws SQLException {
	Connection conn=cf.getConnection();
	String sql="select * from account where account_id=?";
    PreparedStatement ps=conn.prepareStatement(sql);
	ps.setInt(1, account_id);
	ResultSet rs=ps.executeQuery();
	BankAccount b=null;
	
	while(rs.next()){
	b=new BankAccount(rs.getInt(1),rs.getDouble(2),rs.getString(3));
	}
	return b;
	
}

@Override
public void depositBalance() throws SQLException {
	double bal =0;
	System.out.println("How much money want to deposit");
	double inputMoney=sc.nextDouble();
	if(inputMoney < 0) {
		System.out.println("Negative amount!");
	}
	//read balance from database
	Connection conn=cf.getConnection();
	String sql="select  balance from account where account_id=?";
    PreparedStatement ps=conn.prepareStatement(sql);
	ps.setInt(1, CustomerDaoImpl.findId);
	ResultSet rs=ps.executeQuery();
	while(rs.next()){
	 bal=rs.getDouble(1);
	}
	double updatedBal =  inputMoney + bal;
	updateFunction(CustomerDaoImpl.findId, updatedBal);
	LogThis.LogIt("info","Account" + CustomerDaoImpl.findId+"deposit $"+bal+ "to account");
}

@Override
public void withdrawBalance() throws SQLException {
	double bal=0;
	System.out.println("How much money want to withdraw");
	double inputMoney=sc.nextDouble();
	if(inputMoney < 0) {
		System.out.println("Cannot withdraw a zero amount or less then zero!");
		}
	//read balance from database
		Connection conn=cf.getConnection();
		String sql="select  balance from account where account_id=?";
	    PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1, CustomerDaoImpl.findId);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
		bal=rs.getDouble(1);
		}
		double updatedBal =  bal-inputMoney;
		updateFunction(CustomerDaoImpl.findId, updatedBal);
		LogThis.LogIt("info","Account" + CustomerDaoImpl.findId+"Withdraw $"+bal+ "to account");
	}
	
@Override
public void updateFunction(int account_id, double balance) throws SQLException {
	Connection conn=cf.getConnection();
	String updatesql="update account set balance =? where account_id=?";
	 PreparedStatement ps=conn.prepareStatement(updatesql);
	 ps.setDouble(1, balance);
	 ps.setInt(2, account_id);
	 ps.executeUpdate();
	 
}


@Override
public void deleteCustBankAccount(int account_id) throws SQLException {
	Connection conn=cf.getConnection();
	 String deleteSql="delete from account where account_id =?";
	 PreparedStatement ps=conn.prepareStatement(deleteSql);
	 ps.setInt(1, account_id);
	 ps.executeUpdate();
	 LogThis.LogIt("info", "  deleted account is " + account_id );
}

}

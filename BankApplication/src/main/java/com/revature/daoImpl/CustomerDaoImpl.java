package com.revature.daoImpl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.revature.bean.BankAccount;
import com.revature.bean.CustomerAccount;
import com.revature.dao.CustomerAccountDao;
import com.revature.util.AdminProfile;
import com.revature.util.ConnFactory;
import com.revature.util.LogThis;

public class CustomerDaoImpl implements CustomerAccountDao{
	public static ConnFactory cf=ConnFactory.getInstance();
	static Scanner sc = new Scanner(System.in);
	public static int findId;
	@Override
	public void insertNewCustomer(String firstName,String lastName,String userName,String password) throws SQLException {
		Connection conn=cf.getConnection();
         String sql="insert into customer values(DEFAULT,?,?,?,?)";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, firstName);
		ps.setString(2, lastName);
		ps.setString(3, userName);
		ps.setString(4, password);
		ps.executeUpdate();
	    System.out.println("All values were successfully added to the database !");
	   
		LogThis.LogIt("info", "New Customer added to database for: " + firstName +" "+ lastName );
	}
	@Override
	public List<CustomerAccount> AllCustomerAccountById() throws SQLException {
		List<CustomerAccount> cList = new ArrayList<CustomerAccount>();
		Connection conn = cf.getConnection();
		String sqlList = "select * from customer";
		PreparedStatement ps = conn.prepareCall(sqlList);
		
		ResultSet rs = ps.executeQuery();
		CustomerAccount a = null;
		while (rs.next()) {
		a = (new CustomerAccount(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
			cList.add(a);
		}
		return cList;
	}

	@Override
	public CustomerAccount retriveById(int user_id) throws SQLException {
		Connection conn=cf.getConnection();
		String sql="select * from customer where user_id=?";
	    PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1, user_id);
		ResultSet rs=ps.executeQuery();
		CustomerAccount c=null;
		
		while(rs.next()){
		c=new CustomerAccount(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
		}
		return c;
	}
	@Override
	public CustomerAccount findByUserName(String userName) throws SQLException {
		String uName="";
		Connection conn=cf.getConnection();
		String sql="select * from customer where userName=?";
	    PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, userName);
		ResultSet rs=ps.executeQuery();
		CustomerAccount c=null;
		
		while(rs.next()){
		uName=(rs.getString(4));
		CustomerDaoImpl.findId = rs.getInt(1);

		}
		return c;
	}

	@Override
	public CustomerAccount findBypassWord(String passWord) throws SQLException {
		String pass="";
		Connection conn=cf.getConnection();
		String sql="select * from customer where user_passWord=?";
	    PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, passWord);
		ResultSet rs=ps.executeQuery();
		CustomerAccount c=null;
		
		while(rs.next()){
		pass=(rs.getString(1));
		}
		return c;
		
	}
	@Override
	public int findUserAccountId() throws SQLException {
		Connection conn=cf.getConnection();
		String sql="select account_id from account ";
		  PreparedStatement ps=conn.prepareStatement(sql);
		
		  ResultSet rs=ps.executeQuery();
		 
		  while(rs.next()){
				 findId=(rs.getInt(1));
				}
		return findId;
	}
	@Override
	public void deleteCustBankAccount(int account_id) throws SQLException {
		Connection conn=cf.getConnection();
		 String deleteSql="delete from customer where account_id =?";
		 PreparedStatement ps=conn.prepareStatement(deleteSql);
		 ps.setInt(1, account_id);
		 ps.executeUpdate();
		 LogThis.LogIt("info", " customer deleted account is " + account_id );
		
	}

	@Override
	public void updateCustomerLastName(String lastName, int user_id) throws SQLException {
		String sql = "update customer set lastName=? where user_id=?";
	    Connection conn = cf.getConnection(); 
	    PreparedStatement ps = conn.prepareStatement(sql);
	    
	    ps.setString(1, lastName);
	    ps.setInt(2, user_id);
	     ps.executeUpdate();
	     System.out.println("updated successfully ");
	   
	}
	@Override
	public int countAllCustomer() throws SQLException {
		Connection conn = cf.getConnection(); 
		String sql = "select userfunction()";
	    PreparedStatement ps = conn.prepareStatement(sql);
	    ResultSet rs=ps.executeQuery();
		int count=0;
		while(rs.next()){
		 count=(rs.getInt(1));
		}
		return count;
		
		
	}

}

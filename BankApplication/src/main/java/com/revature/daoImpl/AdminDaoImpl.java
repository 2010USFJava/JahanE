package com.revature.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.revature.bean.AdminClass;
import com.revature.bean.CustomerAccount;
import com.revature.dao.AdminDao;
import com.revature.dao.BankAccountDao;
import com.revature.dao.CustomerAccountDao;
import com.revature.util.AdminProfile;
import com.revature.util.ConnFactory;
import com.revature.util.CustomerProfile;

public class AdminDaoImpl implements AdminDao{
	public static ConnFactory cf=ConnFactory.getInstance();
	static Scanner sc = new Scanner(System.in);
	static CustomerAccountDao ca = new CustomerDaoImpl();
	static BankAccountDao ba = new BankAccountDaoImpl();
	@Override
	public AdminClass retriveById(int admin_id) throws SQLException {
		
		Connection conn=cf.getConnection();
		String sql="select * from admin where admin_id=?";
	    PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1, admin_id);
		ResultSet rs=ps.executeQuery();
		AdminClass a=null;
		
		while(rs.next()){
		a=new AdminClass(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
		}
		return a;
	}

	@Override
	public AdminClass findByUserName(String username) throws SQLException {

		String uName="";
		Connection conn=cf.getConnection();
		String sql="select * from admin where username=?";
	    PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, username);
		ResultSet rs=ps.executeQuery();
		AdminClass a=null;
		
		while(rs.next()){
		uName=(rs.getString(1));
		}
		return a;
	}

	@Override
	public AdminClass findBypassWord(String password) throws SQLException {

		String pass="";
		Connection conn=cf.getConnection();
		String sql="select * from admin where password=?";
	    PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, password);
		ResultSet rs=ps.executeQuery();
		AdminClass a=null;
		
		while(rs.next()){
		pass=(rs.getString(1));
		}
		return a;
	}


	

}

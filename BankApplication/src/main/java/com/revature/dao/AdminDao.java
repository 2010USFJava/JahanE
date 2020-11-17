package com.revature.dao;

import java.sql.SQLException;

import com.revature.bean.AdminClass;
import com.revature.bean.CustomerAccount;



public interface AdminDao {
	
	
	//retive
		public AdminClass retriveById(int user_id)throws SQLException;
		
		//username
		public  AdminClass findByUserName(String username)throws SQLException;
			
		//password
		public  AdminClass findBypassWord(String password)throws SQLException;
		
		//update
		//public void updateCustomerInformation(CustomerAccount c)throws SQLException;

}

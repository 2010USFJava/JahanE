package com.revature.bean;

import java.io.Serializable;

public class CustomerAccount implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3071707407378044205L;

	private int user_Id;

	private String firstName;
	private String LastName;
	private String userName;
	private String passWord;

	
	
	public CustomerAccount() {
		super();
		
	}


	public CustomerAccount(int user_Id,String firstName, String lastName, String userName, String passWord)  {
		super();
		this.firstName = firstName;
		this.LastName = lastName;
		this.userName = userName;
		this.passWord = passWord;
		this.user_Id = user_Id;
		
	}

public CustomerAccount(int user_id,String lastName) {
	this.user_Id = user_Id;
	this.LastName = lastName;
}
	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassWord() {
		return passWord;
	}


	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}


	public int getUser_Id() {
		return user_Id;
	}


	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}


	@Override
	public String toString() {
		return "CustomerAccount [user_Id=" + user_Id + ", firstName=" + firstName + ", LastName=" + LastName
				+ ", userName=" + userName + ", passWord=" + passWord + "]";
	}


	

	




	
	
}

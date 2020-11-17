package com.revature.bean;


public class AdminClass {
	private int adminId;
	private String firstName;
	private String lastName;
	private String userName;
	private String passWord;
	
	
	public AdminClass() {
		super();
		
	}

	

	public AdminClass(int adminId, String firstName, String lastName, String userName, String passWord) {
		super();
		this.adminId = adminId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.passWord = passWord;
	}



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	@Override
	public String toString() {
		return "AdminClass [firstName=" + firstName + ", LastName=" + lastName + ", userName=" + userName
				+ ", passWord=" + passWord + ", AdminId=" + adminId + "]";
	}
	
	
}

package com.revature.bean;

import java.io.Serializable;

import com.revature.util.CustList;
import com.revature.util.FileStuff;
import com.revature.util.LogTheFile;

public class Customer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5851154450094806072L;
	private String name;
	private int CustId;
	private int age;
	private String title;
	
	public Customer() {
		super();
		CustList.custList.add(this);
		FileStuff.writeCustomerFile(CustList.custList);
	}
	
	
	public Customer(String name, int custId, int age, String title) {
		super();
		this.name = name;
		CustId = custId;
		this.age = age;
		this.title = title;
		FileStuff.writeCustomerFile(CustList.custList);
		LogTheFile.LogIt("info", "Customer List, "+ this.name );
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getCustId() {
		return CustId;
	}


	public void setCustId(int custId) {
		CustId = custId;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	@Override
	public String toString() {
		return "Customer [name=" + name + ", CustId=" + CustId + ", age=" + age + ", title=" + title + "]";
	}
	
	
	
	

}

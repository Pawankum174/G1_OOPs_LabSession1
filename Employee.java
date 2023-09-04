package com.greatlearning.model;

public class Employee {

	private String fname;
	private String lname;
	private String emailId;
	private String password;
	
	public Employee(String fname, String lname) {
		this.fname = fname;
		this.lname = lname;
	}

	public Employee() {}
	
	public String getfname() {
		return fname;
	}
	public void setfname(String fname) {
		this.fname = fname;
		}
	public String getlname() {
		return lname;
	}
	public void setlname(String lname) {
		this.lname = lname;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}

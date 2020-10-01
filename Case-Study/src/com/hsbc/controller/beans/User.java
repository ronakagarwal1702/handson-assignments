package com.hsbc.controller.beans;

public class User {
	
	private int userid;
	private String name;
	private String dob;
	private String password;
	private long phone;
	
	public User()
	{
		super();
	}
	public User(String name, String dob, String password, long phone) {
		super();
		this.name = name;
		this.dob = dob;
		this.password = password;
		this.phone = phone;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", name=" + name + ", dob=" + dob + ", password=" + password + ", phone="
				+ phone + "]";
	}
	

}

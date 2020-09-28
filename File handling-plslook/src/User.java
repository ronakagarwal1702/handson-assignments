package com.hsbc.controller;

import java.io.Serializable;

public class User implements Serializable {
	
	private int userid;
	private String name;
	private long phone;
	private long password;
	
	
	
	public User(int userid, String name, long phone, long password) {
		super();
		this.userid = userid;
		this.name = name;
		this.phone = phone;
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
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
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public long getPassword() {
		return password;
	}
	public void setPassword(long password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", name=" + name + ", phone=" + phone + ", password=" + password + "]";
	}
	
	

}

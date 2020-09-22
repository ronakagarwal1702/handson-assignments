package com.bank.model.beans;

public class Account {
	
	private int account_no;
	private String customer_name;
	private double balance;
	private long contact_no;
	
	private static int token=1; //To provide Account No
	
	public Account(String customer_name, double balance, long contact_no) {
		this.customer_name = customer_name;
		this.balance = balance;
		this.contact_no = contact_no;
		this.account_no=token++;
	}
	
	public int getAccount_no() {
		return account_no;
	}
	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}
	
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void updateBalance(double balance)
	{
		this.balance=balance;
	}
	
	public long getContact_no() {
		return contact_no;
	}
	public void setContact_no(long contact_no) {
		this.contact_no = contact_no;
	}
	
	public String toString() {
		return "User [AccountNo=" + account_no + ", Customer_name=" + customer_name + ", balance=" + balance + ", Contact_no=" + contact_no + "]";
	}
	
	

}

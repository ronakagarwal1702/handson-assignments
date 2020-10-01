package com.hsbc.controller.beans;

public class Contacts {
	private String name;
	private long contact;
	public Contacts(String name, long contact) {
		super();
		this.name = name;
		this.contact = contact;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Contacts [name=" + name + ", contact=" + contact + "]";
	}
	
	
}

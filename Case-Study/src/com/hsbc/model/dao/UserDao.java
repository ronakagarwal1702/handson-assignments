package com.hsbc.model.dao;

import java.util.List;

import com.hsbc.controller.beans.Contacts;
import com.hsbc.controller.beans.User;

public interface UserDao {
	
	User authentication(int userid,String password);
	User store(User user);
	int editProfile(User user,String newPassword, long newContact);
	int addContacts(User u,String friendname,long friendphone);
	
	int editContacts(User user,String name,long phone);
	
	List<Contacts> viewContacts(User user);
	int deleteContacts(User user,int contactid);
	User deleteProfile(User user);
	
	int checkContactId(int id);

}

package com.hsbc.model.service;

import java.util.List;

import com.hsbc.controller.beans.Contacts;
import com.hsbc.controller.beans.User;
import com.hsbc.exception.UserNotFound;

public interface UserService {
	
	User login(int userid,String password) throws UserNotFound;
	User register(User user);
	int editProfile(User user,String password,long contact);
	int addContacts(User u,String friend_name,long friend_phone);
	int editContacts(User user,String name,long phone);
	int checkContactId(int contact_id);
	List<Contacts>viewContacts(User user);
	
	int deleteContacts(User user,int contact_id) throws UserNotFound;
	
	User deleteProfile(User user);

}

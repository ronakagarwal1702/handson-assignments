package com.hsbc.model.service;

import java.util.List;

import com.hsbc.controller.beans.Contacts;
import com.hsbc.controller.beans.User;
import com.hsbc.exception.UserNotFound;
import com.hsbc.model.dao.UserDao;
import com.hsbc.model.utility.*;

public class UserServiceImpl implements UserService {
	
	UserDao dao=(UserDao)FactoryPattern.getInstance(Type.DAO);

	@Override
	public User login(int userid,String password) throws UserNotFound {
	  User user= dao.authentication(userid,password);
	  if(user==null)
	  {
		  throw new UserNotFound();
	  }
	  return user;
	}

	@Override
	public User register(User user) {
		return dao.store(user);
	}

	@Override
	public int editProfile(User user,String password,long contact) {
		return dao.editProfile(user,password,contact);
		
	}

	@Override
	public int addContacts(User u,String friend_name,long friend_phone) {
		return dao.addContacts(u, friend_name, friend_phone);
	}

	@Override
	public int editContacts(User user,String name,long phone) {
		return dao.editContacts(user,name, phone);
	}

	@Override
	public List< Contacts>viewContacts(User user) {
		return dao.viewContacts(user);
	}

	@Override
	public int deleteContacts(User user,int contactId) throws UserNotFound {
		int status=dao.deleteContacts(user,contactId);
		if(status!=1)
		{
			throw new UserNotFound("Person not found");
		}
		return status;
	}

	@Override
	public User deleteProfile(User user) {
		return dao.deleteProfile(user);
		
	}

	@Override
	public int checkContactId(int contact_id) {
		return dao.checkContactId(contact_id);
	}

}

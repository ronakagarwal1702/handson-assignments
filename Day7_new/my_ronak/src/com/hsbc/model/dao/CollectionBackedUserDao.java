package com.hsbc.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.hsbc.model.beans.User;

public class CollectionBackedUserDao implements UserDao {
	
	private List<User> userArray=new ArrayList<User>();
	private static int index = 0;
	@Override
	public User store(User user) {
		userArray.add(index++,user);
		return user;
	}

	@Override
	public User[] fetchUsers() {
		
		User[] user_array = userArray.toArray(new User[userArray.size()]);  
		 return user_array;
	}

	@Override
	public User fetchUserById(int userId) {
		User user = null;
		for(int i = 0; i < index; i++) {
			if(userArray.get(i).getUserId() == userId) { 
				user = userArray.get(i);
				return user;
			}
		}
		return null;
	}

	@Override
	public User updateUser(int userId, User user) {
		for(int i = 0; i < index; i++) {
			if(userArray.get(i).getUserId() == userId) { 
				userArray.set(i,user);
				return user;
			}
		}
		return null;
	}

}

package com.hsbc.model.dao;

import com.hsbc.model.beans.User;

public interface UserDao {
	
	  User authenticate(int userId,String password);

}

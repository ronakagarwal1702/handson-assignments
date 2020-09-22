package com.bank.model.utility;

import com.bank.model.business.AccountServiceImpl;
import com.bank.model.dao.ArrayBackendAccountDao;

public class UserFactory {
	
	public static Object getInstance(Type type)
	{
		Object obj=null;
		switch(type)
		{
		case Dao:
			obj=new ArrayBackendAccountDao();
			break;
			
		case Service:
			obj=new AccountServiceImpl();
			break;
		}
		return obj;
	}

}

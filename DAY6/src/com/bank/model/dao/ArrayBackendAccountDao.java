package com.bank.model.dao;

import com.bank.model.beans.Account;

public class ArrayBackendAccountDao implements AccountDao {
	
	private Account account_user[]=new Account[10];
	
	private static int index=0;

	@Override
	public Account storeAccount(Account account) {
		account_user[index++]=account;
		return account;
	}

	@Override
	public Account[] fetchAllAccount() {
		return account_user;
	}

	@Override
	public Account fetchAccountById(int account_no) {
		for(int i=0;i<index;i++)
		{
			if(account_user[i].getAccount_no()==account_no)
			{
				return(account_user[i]);
			}
		}
		return null;
	}

	@Override
	public void updateAccount(int account_no, Account account) {
		
		for(int i=0;i<index;i++)
		{
			if(account_user[i].getAccount_no()==account_no)
			{
				account_user[i]=account;
			}
		}
		
	}
	
	

}

package com.bank.model.dao;

import com.bank.model.beans.Account;

public interface AccountDao {
	
	Account storeAccount(Account account);
	Account[] fetchAllAccount();
	Account fetchAccountById(int account_no);
	void updateAccount(int account_no,Account account);
	
	

}

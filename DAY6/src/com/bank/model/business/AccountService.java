package com.bank.model.business;

import com.bank.exception.UserNotFoundException;
import com.bank.model.beans.Account;

public interface AccountService {
	
	Account createAccount(Account account);
	Account getAccountById(int account_no) throws UserNotFoundException;
	Account[] fetchAllAccount();
	String tranfer(int debitor_account, int creditor_account,double amount) throws UserNotFoundException;
	

}

package com.bank.model.business;
import com.bank.exception.UserNotFoundException;
import com.bank.model.beans.Account;
import com.bank.model.dao.AccountDao;
import com.bank.model.utility.Type;
import com.bank.model.utility.UserFactory;

public class AccountServiceImpl implements AccountService {
	
	AccountDao dao=(AccountDao)UserFactory.getInstance(Type.Dao);

	@Override
	public Account createAccount(Account account) {
		Account account_user=dao.storeAccount(account);
		return account_user;
	}

	@Override
	public Account getAccountById(int account_no) throws UserNotFoundException {
		Account account_user=dao.fetchAccountById(account_no);
		if(account_user==null)
		{
			throw new UserNotFoundException();
		}
		return account_user;
	}

	@Override
	public String tranfer(int debitor_account_no, int creditor_account_no, double amount) throws UserNotFoundException {
		Account src_account=dao.fetchAccountById(debitor_account_no);
		if(src_account==null)
		{
			throw new UserNotFoundException("Debitor account does not exist");
		}
		Account dest_account=this.getAccountById(creditor_account_no);
		if(dest_account==null)
		{
			throw new UserNotFoundException("Creditor account does not exist");
		}
		if(src_account.getBalance()>=amount)
		{
			dest_account.updateBalance(dest_account.getBalance()+amount);
			dao.updateAccount(creditor_account_no, dest_account);
			src_account.updateBalance(src_account.getBalance()-amount);
			dao.updateAccount(debitor_account_no, src_account);
			return("Tranfer done");
			
		}
		
			return("Less Debitor account balance");
	}
	@Override
	public Account[] fetchAllAccount()
	{
		return (dao.fetchAllAccount());
		
	}
	
	

}

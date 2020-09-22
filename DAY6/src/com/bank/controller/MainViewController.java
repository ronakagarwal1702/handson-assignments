package com.bank.controller;
import java.util.*;

import com.bank.exception.UserNotFoundException;
import com.bank.model.beans.Account;
import com.bank.model.business.AccountService;
import com.bank.model.utility.Type;
import com.bank.model.utility.UserFactory;

public class MainViewController {
	
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		AccountService service =(AccountService)UserFactory.getInstance(Type.Service);
		int option=0;
		do
		{
			System.out.println("**********************************************************************************************");
			System.out.println("1.Store Account 2. Fetch All Account 3. Fetch Account By Id 4. Transfer Amount 5.Exit");
			System.out.println("**********************************************************************************************");
			System.out.println();
			System.out.println("Enter the option:");
			option=scanner.nextInt();
			switch(option)
			{
			    case 1:
			    	System.out.println("Enter the customer name:");
			    	String name=scanner.next();
			    	System.out.println("Enter the contact details:");
			    	long contact=scanner.nextLong();
			    	System.out.println("Enter the inital amount want to deposit");
			    	double amount=scanner.nextDouble();
			    	Account account=new Account(name,amount,contact);
			    	Account created_account=service.createAccount(account);
			    	System.out.println("Your account is created with account No is :"+account.getAccount_no());
			    	break;
			    	
			    case 2:
			    	Account account_user[]=service.fetchAllAccount();
			    	for(Account user:account_user)
			    	{
			    		if(user!=null)
			    		{
			    			System.out.println(user);
			    		}
			    	}
			    	break;
			    	
			    case 3:
			    	System.out.println("Enter the account no");
			    	int account_no=scanner.nextInt();
			    	try
			    	{
			    	     Account user=service.getAccountById(account_no);
			    	     System.out.println(user);
			    	}
			    	catch(UserNotFoundException e)
			    	{
			    		System.out.println(e.getMessage());
			    	}
			    	break;
			    	
			    case 4:
			    	System.out.println("Enter the Account no from where you want to debit the amount");
			        int debitor_account=scanner.nextInt();
			        System.out.println("Enter the Account no in which you credit the amount");
			        int creditor_account=scanner.nextInt();
			        System.out.println("Enter the amount:");
			        amount=scanner.nextDouble();
			        try
			        {
			           String msg=service.tranfer(debitor_account, creditor_account, amount);
			           System.out.println(msg);
			        }
			        catch(UserNotFoundException e)
			    	{
			    		System.out.println(e.getMessage());
			    	}
			        break;	
			}
			
		}while(option<5);
		scanner.close();
	}

}

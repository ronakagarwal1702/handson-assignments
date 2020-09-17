public class MainBank {
    public static void main(String[] args) {

        //pass the accountNo and amount to deposit from CLA
        long acc=Long.parseLong(args[0]);
        double amount=Double.parseDouble(args[1]);
        //get the Account using the accountNo by calling getAccount(...)
        Account account= getAccount(acc);
        // if accountNo is wrong show the error message and must not perform any below
        // operation
        if(account==null)
        {
            System.out.println("Please Enter Valid Account Number");
        }
        // show the account information before deposit
        else
        {
            account.accountInformation();
            //deposit the amount to that particular Accoun
            account.deposit(amount);
            //show the account information after deposit
            account.accountInformation();
        }
        
        
    }

    // pass the accountNO and get the Account from Accounts[] 
    public static Account getAccount(long accountNo) {
        Account[] accounts = AccountsDB.getAccounts();

        Account account = null;
        // get the account from accounts using the account
        for(Account a:accounts)
        {
            if(a.getAccountNumber()==accountNo)
            {
                account=a;
            }
        }
        return(account);
    }
}
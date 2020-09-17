public class MainBank {
    public static void main(String[] args) {

        //pass the accountNo and amount to deposit from CLA
        long acc_src=Long.parseLong(args[0]);
        long acc_dest=Long.parseLong(args[0]);
        double amount=Double.parseDouble(args[2]);
        //get the Account using the accountNo by calling getAccount(...)
        Account wd= getAccount(acc);
        Account dest= getAccount(acc);
        // if accountNo is wrong show the error message and must not perform any below
        // operation
        if(wd==null || dest==null)
        {
            System.out.println("Please Enter Valid Account Number");
        }
        // show the account information before deposit
        else
        {
            wd.accountInformation();
            dest.accountInformation();
            //deposit the amount to that particular Accoun
            if(amount > wd.balance){
                System.out.println("less Amount");
            }
            else{
                wd.withdraw(depositAmount);
                dest.deposit(depositAmount);
            }
            wd.accountInformation();
            dest.accountInformation();
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
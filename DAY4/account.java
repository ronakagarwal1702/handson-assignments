class account
{
    int accountno;
    double bal;
    account(int accountno,double bal)
    {
        this.accountno=accountno;
        this.bal=bal;
    }
    void display_info()
    {
        System.out.println("Account_no: "+accountno+" "+"bal: "+bal);
    }
}
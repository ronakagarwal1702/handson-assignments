class Customer
{
    long acc_no;
    String name;
    int bal;
    String ifsc;
    String state;
    String city;
    int pin;
    Customer(long acc,String n,String s,String c,int p){
        acc_no=acc;
        name=n;
        state=s;
        city=c;
        pin=p;
        bal=0;
        ifsc="7845A";
    }
    Customer(long acc,String n,String s,String c,int p,int b){
        acc_no=acc;
        name=n;
        state=s;
        city=c;
        pin=p;
        bal=bal+b;
        ifsc="7845A";
    }
    public void deposit(long acc,int b)
    {
        if(acc_no==acc)
        {
            bal=bal+b;
            System.out.println("Balance updated");
        }
        else{
            System.out.println("Account noy registered");
        }
    }
    public void withdraw(long acc,int b)
    {
        if(acc==acc_no)
        {
            bal=bal-b;
            System.out.println("Balance withdrawn successfully");

        }
        else
        {
            System.out.println("Account no is wrong");
        }
    }
    public void display(long acc)
    {
        if(acc==acc_no)
        {
        System.out.println("The total balance is :"+ bal);
        }
    }


}

public class Saving_Account
{
    public static void main(String args[])
    {
       Customer pp=new Customer(14231288,"ronak","Rajasthan","Jaipur",302012);
       Customer qq=new Customer(745891288,"rajesh","Assam","Juiop",74128,1500);
       pp.display(14231288);
       qq.display(745891288);
       pp.withdraw(14231288,1200);
       pp.deposit(14231288,8500);

    }
}
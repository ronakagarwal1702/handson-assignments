class Main
{
    public static void main(String args[])
    {
        // MANAGER
        Address ad=new Address("Assam","jhol",302012);
        account ac=new account(14785,15000);
        Manager mq=new Manager("ronak",170214,"male","A",94875176,17000,ac,ad);
  
        // Programmer
        Address aq=new Address("Rajasthan","jaipur",302012);
        account al=new account(14785,15000);
        Programmer mp=new Programmer("rohitk",170214,"male","A",94875176,17000,al,aq);

        //Student
        Address am=new Address("UTOPIAMS","jhol",302012);
        account ao=new account(14785,15000);
        Student ms=new Student("ronak",170214,"male",94875176,am);
 
        //Customer
        Address aj=new Address("PUNJAB","jhol",302012);
        account avv=new account(14785,15000);
        Customer mf=new Customer("ronak",170214,"male",94875176,aj);

        getdetails(mq,ac); // get details of Manager
        getdetails(mp,a1); // get details of Programmer
    }

    static void  getdetails(Person p,account ap)
    {
        p.update_salary();
        p.update_grade("p");
        p.update_balance(ap);
        p.display();
        p.display();
    }
}
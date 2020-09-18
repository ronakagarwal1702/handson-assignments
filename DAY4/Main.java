class Main
{
    public static void main(String args[])
    {
        Address address1=new Address("rajasthan","jaipur",302012);
        Account account1=new Account(123654,10000);
        Manager manager=new Manger("ronak",17021998,"male",9487563289,address1,121,"A+",15000,2015,account1);
        display_detail1(manger);

        Address address2=new Address("rajasthan","jaipur",302012);
        Account account2=new Account(123654,10000);
        Programmer program=new Programmer("rohot",1701998,"male",9487563289,address2,121,"B+",1500,2015,account2);


        Address address3=new Address("rajasthan","jaipur",302012);
        Student student=new Student("ronak",17021998,"male",9487563289,address3); 

        display_details2(student);
    }

    // display information

    public static void display_detail1(Person p)
    {
        p.display_details();
        p.showAddress();
        p.account_details();
    }
    public static void display_detail2(Person p)
    {
        p.display_details();
        p.showAddress();
    }


    public static void testUpdate(Person p)
    {
        if(p instanceof Student)
        {
            Student s1=(Student)p;
            s1.update_grade("B+");
        }

        if(p instanceof Manager){
            Manager m=(Manager)p;
            m.update_salary(m.getsalary()+(m.getSalary()*0.1));
        }
   
        if(p instanceof Admin){
            
            Admin m=(Admin)p;
            m.update_salary(m.getsalary()+(m.getSalary()*0.1));
        }
        if(p instanceof Programmer){
            Programmer m=(Programmer)p;
           m.update_salary(m.getsalary()+(m.getSalary()*0.1));
        }
    }
}
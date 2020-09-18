class Customer extends Person
{
    private String name;
    private int dob;
    private String gender;
    private long phone;
    Address ad;
    Customer(String name,int dob,String gender,long phone,Address ad)
    {
        super(name,dob,gender,phone,ad);
    }
    void update_salary()
    {
        System.out.println("Not applicable");
    }
    void update_grade(String p)
    {
        System.out.println("Not applicable");
    }
    void update_balance(account p)
    {
       System.out.println("Not applicable");
    }
}
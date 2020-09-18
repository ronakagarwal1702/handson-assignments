class Programmer extends Person
{
    private String name;
    private int dob;
    private String gender;
    private String grade;
    private long phone;
    private double salary;
    account ac;
    Address ad;
    Programmer(String name,int dob,String gender,String grade,long phone,double Salary,account ac,Address ad)
    {
        super(name,dob,gender,grade,phone,Salary,ac,ad);
    }
    void update_salary()
    {
        this.salary=this.salary*0.1;
    }
    void update_grade(String p)
    {
        this.grade=p;
    }
    void update_balance(account p)
    {
       p.bal=p.bal+this.salary;
    }
}
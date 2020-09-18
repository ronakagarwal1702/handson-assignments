// ADMIN CLASS;

abstract class Person
{
    private String name;
    private int dob;
    private String gender;
    private String grade;
    private long phone;
    private double salary;
    account ac;
    Address ad;
    Person(String name,int dob,String gender,String grade,long phone,double salary,account ac,Address ad)
    {
        this.name=name;
        this.dob=dob;
        this.gender=gender;
        this.grade=grade;
        this.phone=phone;
        this.salary=salary;
        this.ad=ad;
        this.ac=ac;
    }
    Person(String name,int dob,String gender,long phone,Address ad)
    {
        this.name=name;
        this.dob=dob;
        this.gender=gender;
        this.phone=phone;
        this.ad=ad;
    }
    abstract void update_salary();
    abstract void update_grade(String p);
    abstract void update_balance(account p);

    void display()
    {
        System.out.println("The details are: ");
        System.out.println("Name: "+this.name+" "+"DOB: "+this.dob+" "+"Gender: "+this.gender);
        System.out.println("Grade: "+this.grade+" "+"PHONE: "+this.phone+" "+"Salary: "+this.salary);
        ad.display_info();
        ac.display_info();
    }

}
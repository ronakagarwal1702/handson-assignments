class Programmer extends Employee
{
    double salary;
    private String language="C++";
    Programmer(String name,long dob,String gender,long phone,int id,String grade,double salary,Address address,Account account)
    {
        super(name,dob,gender,phone,address,id,grade,salary,address,account);
    }
    @Override
    void display_details()
    {
        System.out.println("The details of Programmer is : ");
        System.out.println("Name: "+get_name()+" "+"DOB: "+get_dob()+" "+"Gender: "+get_gender());
        System.out.println("Grade: "+get_grade()+" "+"PHONE: "+get_phone()+" "+"Salary: "+get.salary());
        System.out.println("Progrramming language: "+ langugae);
    }
    double getSalary()
    {
        return(salary);
    }
    void update_salary(double salary)
    {
        this.salary=salary;
    }
}
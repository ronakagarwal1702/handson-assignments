class Manager extends Employee
{
    double salary;
    Manager(String name,long dob,String gender,long phone,Address address)
    {
        super(name,dob,gender,phone,address);
    }
    Manager(String grade,double salary,int id,Account account)
    {
        super(grade,salary,id,account);
    }
    @ Override
    void display_details()
    {
        System.out.println("The details of Manager is : ");
        System.out.println("Name: "+get_name()+" "+"DOB: "+get_dob()+" "+"Gender: "+get_gender());
        System.out.println("Grade: "+get_grade()+" "+"PHONE: "+get_phone()+" "+"Salary: "+get.salary());
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
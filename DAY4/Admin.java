class Admin extends Employee
{
    double salary;
    public Admin(String name,long dob,String gender,long phone,Address address)
    {
        super(name,dob,gender,phone,address);
    }
    public Admin(String grade,double salary,int id,Account account)
    {
        super(grade,salary,id,account);
    }


    @Override
    void display_details()
    {
        System.out.println("The details of Admin is : ");
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
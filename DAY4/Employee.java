abstract class Employee extends Person
{
    Account account;
    Private int id;
    Private String grade;
    Private double salary;
    public Employee(String name,long dob,String gender,long phone,int id,String grade,double salary,Address address,Account account)
    {
        super(name,dob,gender,phone,address);
        this.account=account;
        this.grade=grade;
        this.salary=salary;
        this.id=id;
    int get_id()
    {
        return(id);
    }
    String get_grade();
    {
        return(grade);
    }
    double get_salary()
    {
        return(salary);
    }
    void account_details()
    {
        account.show_account_details();
    }
}
class Student extends Person
{
    private String grade;
    public Student(String name,long dob,String gender,long phone,Address address)
    {
        super(name,dob,gender,phone,address);
    }

    @Override
    void display_details()
    {
        System.out.println("The details of Student is : ");
        System.out.println("Name: "+get_name()+" "+"DOB: "+get_dob()+" "+"Gender: "+get_gender()+"Phone "+get_phone());
    }
    public void update_grade(String grade){
        this.grade=grade;
    }
}
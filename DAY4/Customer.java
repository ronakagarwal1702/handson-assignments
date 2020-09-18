class Customer extends Person
{
    public Customer(String name,long dob,String gender,long phone,Address address)
    {
        super(name,dob,gender,phone,address);
    }

    @Override
    void display_details()
    {
        System.out.println("The details of Customer is : ");
        System.out.println("Name: "+get_name()+" "+"DOB: "+get_dob()+" "+"Gender: "+get_gender()+"Phone "+get_phone());
    }
}
abstract class Person
{
    private String name;
    private long dob;
    private String gender;
    private long phone;
    Address address;
    Person(String name,long dob,String gender,long phone,Address address)
    {
        this.name=name;
        this.dob=dob;
        this.gender=gender;
        this.phone=phone;
        this.address=address;
    }
    abstract void display_details();
    String get_name()
    {
        return(name);
    }
    long get_dob()
    {
        return(dob);
    }
    String get_gender()
    {
        return(gender);
    }
    long get_phone()
    {
        return(phone);
    }
    public void Address_details()
    {
        address.showAddress();
    }
}
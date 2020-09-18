class Address
{
    String state;
    String city;
    int pin;
    Address(String state,String city,int pin)
    {
        this.state=state;
        this.city=city;
        this.pin=pin;
    }
    void display_info()
    {
        System.out.println("State: "+state+" "+"city: "+city+" "+"pin: "+pin);
    }
}
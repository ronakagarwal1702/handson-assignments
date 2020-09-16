/*package whatever //do not write package name here */
class Person
{
    int id;
    String name;
    double salary;
    Address ad;
    Person(int id,String name,double salary,Address ad)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.ad=ad;
    }
    void display(Person p[])
    {
        for(Person pq:p)
        {
            if(pq.salary>5000)
            {
                System.out.println("Name is "+pq.name+"City "+ad.city);
            }
        }
    }
}
class Address
{
    String state;
    String city;
    int pin;
    Address(String state, String city,int pin)
    {
        this.state=state;
        this.city=city;
        this.pin=pin;
    }
}
class GFG
{
    public static void main(String args[])
    {
        Person p[]=new Person[5];
        Address ap=new Address("assam","jiol",302012);
        p[0]=new Person(1,"ronak",10000,ap);
        Address aq=new Address("rajasthan","jaipur",12365);
        p[1]=new Person(2,"rohit",4000,aq);
        p[2]=new Person(3,"ajay",7000,aq);
        p[3]=new Person(4,"vinay",4500,aq);
        p[4]=new Person(5,"mukesh",5000,aq);
        p[0].display(p);

    }
}

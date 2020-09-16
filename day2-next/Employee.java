/*package whatever //do not write package name here */
class Person
{
    int id;
    String name;
    double salary;
    Person(int id,String name,double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    static void display(Person p[])
    {
        for(Person pq:p)
        {
            if(pq.salary>5000)
            {
                System.out.println("Name is "+pq.name);
            }
        }
    }
}
class GFG
{
    public static void main(String args[])
    {
        Person p[]=new Person[5];
        p[0]=new Person(1,"ronak",10000);
        p[1]=new Person(2,"rohit",4000);
        p[2]=new Person(3,"ajay",7000);
        p[3]=new Person(4,"vinay",4500);
        p[4]=new Person(5,"mukesh",5000);
        Person.display(p);

    }
}

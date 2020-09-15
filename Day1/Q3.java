class Grade
{
  public static void main(String args[])
  {
    int q=Integer.parseInt(args[0]);
    if(q>=70)
    {
       System.out.println("First Class Division");
    }
    else if(q>=60 && q<70)
    {
       System.out.println("Second Class Division");
    }
    else if(q>=50 && q<60)
    {
       System.out.println("Third Class Division");
    }
    else
    {
       System.out.println("Fail");
    }	
  }
}
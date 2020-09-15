class Tax
{
  public static void main(String args[])
  {
    String p=args[0];
    int m=Integer.parseInt(args[1]);
    double mp;
    switch(p)
    {
      case "Rajasthan":
         mp=m-((m*7)/100);
         System.out.println("Total ="+ mp);
         break;
   
      case "Punjab":
         mp=m-((m*10)/100);
         System.out.println("Total ="+mp);
         break;

      case "Assam":
         mp=m-((m*8)/100);
         System.out.println("Total ="+mp);
         break;

      case "Bihar":
         mp=m-((m*12)/100);
         System.out.println("Total ="+mp);
         break;

      case "kerala":
         mp=m-((m*3)/100);
         System.out.println("Total ="+mp);
         break;

      default:
          System.out.println("Not Applicable");
    }
  }
}
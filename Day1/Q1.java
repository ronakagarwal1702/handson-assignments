class Fun
{
   public static void main(String args[])
   {
      int min=Integer.parseInt(args[0]);
      int max=Integer.parseInt(args[0]);
      int sum=Integer.parseInt(args[0]);
      for(int i=1;i<args.length;i++)
      {
         int q=Integer.parseInt(args[i]);
         if(q>max)
         {
           max=q;
         }
         if(min>q)
         {
           min=q;
         }

        sum=sum+q;
      }
      System.out.println("Maximum ="+ max);
      System.out.println("Minimum ="+ min);
      System.out.println("Sum ="+ sum);


   }
}
import java.util.*;

class Swaping
{
  public static void main(String args[])
  {
   int a,b;
   Scanner s=new Scanner(System.in);
   System.out.println("Enter the two number");
   a=s.nextInt();b=s.nextInt();
   int t=a;a=b;b=t;
   System.out.println("After swaping " +a+" "+b);
  }
} 
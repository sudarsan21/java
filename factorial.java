//factorial
import java.io.*;
import java.util.Scanner;
public class factorial
{
  public static void main(String args[])
   {
    int s=1;
    Scanner S=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=S.nextInt();
    if(n>0)
      {
    for(int i=1;i<=n;i++)
      {
       s=i*s;
      }
      System.out.println("The factorial of "+n+"="+s);  
     } 
     else
      {
       System.out.println("0");
       }
   }
}

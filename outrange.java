import java.io.*;
class RangeException extends Exception
{
	RangeException(String e)
	{
		super(e);
	}
}
public class outrange
{
	public static void main(String[] args)
	 {
	 	int a=0,b=700,n;
	 	try
		{
			DataInputStream din=new DataInputStream(System.in);
			System.out.println("Enter any number:");
			n=Integer.parseInt(din.readLine());
			if (n<a || n>b)throw new RangeException("Number out of range");
			System.out.println("The  given number"+n+"is in the range of number"+a+ "and" +b);
		}
		catch(RangeException s)
		{
			System.out.println(s);
		}
	
		catch(IOException e )
		

	{
		System.out.println(e);
		}
	}
	}

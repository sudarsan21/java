import java.io.*;
class vehicle
{
	 
	String regno;
	int model;
	String make;
	vehicle(String r,int m,String n)
	{
		regno=r;
		model=m;
		make=n;
	}
	void display()
	{
		System.out.println("Registration number ="+regno);
		System.out.println("model="+model);
		System.out.println("manufacturer="+make);


	}
}
class twowheeler extends vehicle
{
	int nogear;
	int power;
	twowheeler(String a, int b,String c,int g,int p)
	{
		super(a,b,c);
		nogear=g;
		power=p;
	}
	void print()
	{
		System.out.println("Number of gear="+nogear);
		System.out.println("Power="+power);

	}
}
class bike extends twowheeler
{
	String owner;
	bike(String x,int y,String z,int x1,int x2,String x3)
	{
		super(x,y,z,x1,x2);
		owner=x3;

	}
	void print1()
	{
		System.out.println("owner="+owner);
	}
}
class vehicledemo
{
	 public static void main(String [] args)
	  {
	  	bike b1=new bike("TN36Y6912",2003,"TVS",6,200,"tharun");
	  	b1.display();
	  	b1.print();
	  	b1.print1();	
	}
}
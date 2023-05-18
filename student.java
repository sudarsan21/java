class student
{
	int regno;
	String name;
	int m1,m2,m3,total;
	student(int r ,String n,int n1, int n2,int n3)
	{
		regno=r;
		name=n;
		m1=n1;
		m2=n2;
		m3=n3;

	}
	void result()
	{
		total=m1+m2+m3;
	}
	void print()
	{
		System.out.println("Registernumber:"+regno);
		System.out.println("name:"+name);
		System.out.println("Total mark:"+total);
	}
	 	public static void main(String args[]) 
		
		{
			student s[]=new student[3];
			s[0]=new student(1001,"Kumar",45,90,67);
			s[1]=new student(1002,"Ramu",75,90,87);
			s[2]=new student(1002,"Babu",80,86,77);
			s[0].result();
			s[0].print();
            s[1].result();
            s[1].print();
            s[2].result();
            s[2].print(); 

		}
	}

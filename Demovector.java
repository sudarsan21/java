import java.util.*;
class Demovector
{
	public static void main(String args[])
	{
		Vector Vec=new Vector(5,2);//created vector 
		System.out.println("capacity:"+Vec.size());
		System.out.println("capacity:"+Vec.capacity());
		for(int i=1;i<6;i++)
			Vec.addElement(new Integer(i));
		System.out.println("size:"+Vec.size());
		System.out.println("capacity:"+Vec.capacity());
		Vec.addElement(new Double(173.58));
		System.out.println("capacity:"+Vec.capacity());
		System.out.println("size:"+Vec.size());
}
}

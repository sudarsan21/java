package commandline;
class area1
{
    float pi;
    void getd()
    {
        pi=3.1457f;
    }
    void circle(float radius)
    {
       float area11=pi*radius*radius; 
        System.out.println("area of circle is::"+area11);
    }        
    
}
public class area1
{
    public static void main(String args[])
    {
        float r=Float.parseFloat(args[0]);
        area1 a=new area1();
        a.getd();
        a.circle(r);
    }
}

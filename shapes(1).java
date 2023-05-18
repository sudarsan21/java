//<appletcode="shapes" width=500 height=500></applet>
import java.awt.*;
import java.applet.*;
public class shapes extends Applet
{
	Color c1=new Color(255,0,0);
	Color c2=new Color(0,255,0);
	Color c3=new Color(0,0,255);
	public void paint(Graphics g)
	{
		g.setColor(c1);
		g.fillRect(10,10,70,40);
		g.setColor(c2);
		g.fillOval(100,10,50,50);
	
				
				g.setColor(c3);
				g.fillRect(100,100,100,100);
	}
}
/* <applet code = shapes.class height = 500 width =500>  
   </applet> */

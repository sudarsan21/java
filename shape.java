//<appletcode="shapes" width=500 height=300></applet>
import java.awt.*;
import java.applet.*;
public class shapes extends applet
{
	color c1=newcolor(255,0,0);
	color c2=newcolor(0,255,0);
	color c3=newcolor(0,0,255);
	public void paint(Graphics g)
	{
		g.setcolor(c1);
		g.fillrect(10,10,70,40);
		g.setcolor(c2);
		g.filloval(100,40,10,10);
		g.setcolor(c3);
		g.fillArc(200,30,50,30,100,180);
	}
}
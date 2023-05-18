/*<applet code="MouseMotionDemo" width=300 height=200></applet>*/
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class MouseMotionDemo extends Applet
{
String msg="";
public void init()
{
addMouseListener(new MouseManager());
addMouseMotionListener(new MouseMotioner());
}
public void paint(Graphics g)
{
Font f1 = new Font("Ariel",Font.BOLD,20);
g.setFont(f1);
g.drawString(msg,100,50);
}
class MouseManager implements MouseListener
{
public void mousePressed(MouseEvent e)
{
msg="Mouse Pressed";
repaint();
}
public void mouseReleased(MouseEvent e)
{
msg="Mouse Released";
repaint();
}
public void mouseClicked(MouseEvent e)
{
msg="Mouse Clicked";
repaint();
}
public void mouseEntered(MouseEvent e)
{
msg="Mouse Entered";
repaint();
}
public void mouseExited(MouseEvent e)
{
msg="Mouse Exited";
repaint();
}
}
class MouseMotioner implements MouseMotionListener
{
public void mouseMoved(MouseEvent e)
{
msg="Mouse Moved";
repaint();
}
public void mouseDragged(MouseEvent e)
{
msg="Mouse Dragged";
repaint();
}
}
}

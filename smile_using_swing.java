import java.awt.*;
import javax.swing.*;

class Ab extends Canvas
{
public void paint(Graphics g)
{
g.setColor(Color.yellow);
g.fillOval(10,10,200,200);
g.setColor(Color.black);
g.fillOval(55,65,30,30);
g.fillOval(135,65,30,30);
g.fillOval(50,110,120,60);
g.setColor(Color.yellow);
g.fillOval(50,110,120,30);
g.fillOval(50,120,120,40);
}
public static void main(String args[])
{
Ab c=new Ab();
JFrame f=new JFrame();
f.setSize(300,400);
f.setVisible(true);
f.add(c);
}
}

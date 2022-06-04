import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class A extends JFrame implements ActionListener
{
  JTextField tf1,tf2,tf3;
  A()
  {
   JLabel l1 = new JLabel("First no. ");
   JLabel l2 = new JLabel("Second no. ");
   JLabel l3 = new JLabel("Result  ");
   tf1 = new JTextField(20);
   tf2 = new JTextField(20);
   tf3 = new JTextField(20);
   setLayout(new FlowLayout());         
   JButton b1= new JButton(" SUM ");
   b1.addActionListener(this);
   add(l1);
   add(tf1);
   add(l2);
   add(tf2);
   add(b1);
   add(l3);
   add(tf3);
  }
  public  void actionPerformed(ActionEvent e)
  {
    String s = e.getActionCommand();
    int result =0;
    if(s.equals(" SUM "))
       result= Integer.parseInt(tf1.getText())+Integer.parseInt(tf2.getText());
   tf3.setText(Integer.toString(result));
  }
  public static void main(String args[])
  {
    A ob= new A();
    ob.setSize(300,400);
    ob.setVisible(true);
  }
}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class practical9 extends JFrame implements ActionListener {
int res=0;
JButton b1;
JTextField t1,t2,res1;
JLabel l1,l2,l3;
practical9() {
setSize(400,400);
setVisible(true);
setLayout(null);
setTitle("MINI Calculator");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
b1=new JButton("ADD");

t1=new JTextField();
t2=new JTextField();
res1=new JTextField();
l1= new JLabel("Enter First No :");
l2= new JLabel("Enter Second No :");
l3= new JLabel("The answer is :");
b1.setBounds(20, 180, 70, 20);

t1.setBounds(140,30, 100, 20);
t2.setBounds(140, 70, 100, 20);
res1.setBounds(140, 110, 100, 20);
l1.setBounds(20, 30, 100, 20);
l2.setBounds(20, 70, 100, 20);
l3.setBounds(30, 110, 100, 20);
add(b1);

add(t1);
add(t2);
add(res1);
add(l1);
add(l2);
add(l3);
b1.addActionListener(this);

}
public void actionPerformed(ActionEvent a)
{
int num1;
num1 =Integer.valueOf(t1.getText());
int num2 = Integer.valueOf(t2.getText());
t2.getText();
if(a.getActionCommand()=="ADD")
res = num1 + num2;
res1.setText(String.valueOf(res));

repaint();
}
public static void main(String args[])
{
new practical9();
}
}
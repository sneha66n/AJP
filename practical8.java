import javax.swing.*;
import java.awt.*;
import javax.swing.JApplet;
import javax.swing.JProgressBar;
public class practical8 extends JApplet {
JProgressBar pb;
public void init() {
pb=new JProgressBar(0,2000);
pb.setBounds(50,50,150,30);
pb.setValue(0);
pb.setStringPainted(true);
add(pb);
setLayout(null);
setSize(300,300);
setVisible(true);
int i=0;
try
{
while(i<=2000)
{
pb.setValue(i);
Thread.sleep(100);
i=i+20;
}
}
catch(Exception e)
{}
}
} 

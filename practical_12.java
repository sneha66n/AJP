import javax.swing.JApplet;
import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
public class practical_12 extends JApplet
{
JTree tree;
public void init()
{
setLayout(new BorderLayout());
DefaultMutableTreeNode Top = new DefaultMutableTreeNode("System",true);
DefaultMutableTreeNode A = new DefaultMutableTreeNode("C:");
Top.add(A);
DefaultMutableTreeNode B = new DefaultMutableTreeNode("D:");
Top.add(B);
DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("Windows");
A.add(a1);
DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("Users");
A.add(a2);
DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("Java");
B.add(b1);
DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("Python");
B.add(b2);
tree=new JTree(Top);
Container con= getContentPane();
con.add(tree,BorderLayout.CENTER);
} }
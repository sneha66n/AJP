import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class practical_14 extends Applet implements KeyListener
{
String msg="";
public void init()
{
addKeyListener(this);
requestFocus();
}
public void keyPressed(KeyEvent ke)
{
showStatus("Key Pressed");
}
public void keyReleased(KeyEvent ke)
{
showStatus("Key Released");
}
public void keyTyped(KeyEvent k)
{
Font f;
f=new Font("Monotype Corsiva",Font.BOLD,30);
msg+=k.getKeyChar();
setFont(f);
repaint();
}
public void paint(Graphics g)
{
g.drawString(msg,100,100);
}
}
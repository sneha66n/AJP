import java.applet.*;
import java.awt.*;
public class practical4 extends Frame
{
practical4()
{
setSize(200,300);
setVisible(true);
List l=new List(10,true);
l.add("Pune");l.add("Mumbai");l.add("Chennai");l.add("Delhi");l.add("Kolhapur");
l.add("Sangli");l.add("Satara");l.add("Bangolre");l.add("Nashik");l.add("Lonavala");
add(l);
}
public static void main(String[] args)
{
practical4 r=new practical4();
}
}
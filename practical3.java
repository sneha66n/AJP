import java.applet.*;
import java.awt.*;
public class practical3 extends Frame
{
practical3()
{
setSize(200,300);
setVisible(true);
List l=new List(10,true);
l.add("Sakal");
l.add("Times of India");
l.add("Lokmat");
l.add("Pune Times");
l.add("Maharashtra Times");
l.add("Kesari");
l.add("Prabhat");
l.add("Pune Mirror");
l.add("Indian Times");
l.add("Pudari");
add(l);
}
public static void main(String[] args)
{
practical3 r=new practical3();
}
}
import java.awt.Frame;
import java.awt.*;
public class practical7 extends Frame
{
practical7(){
setTitle("MenuBar Demo");
setSize(500,500);
setLayout(null);
MenuBar mb=new MenuBar();
setMenuBar(mb);
Menu mf=new Menu("BLACK");
mb.add(mf);
Menu ml=new Menu("BLUE");
mb.add(ml);
Menu ma=new Menu("GREEN");
mb.add(ma);
Menu mg=new Menu("RED");
mb.add(mg);
MenuItem mc=new MenuItem("GRAY");
mf.add(mc);
mc.setEnabled(false);
}
public static void main(String[] args)
{
practical7 md=new practical7();
md.setVisible(true);
}
}
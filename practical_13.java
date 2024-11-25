import javax.swing.*;
import java.awt.*;
public class practical_13 extends JApplet
{
JTable jt;
public void init()
{
setLayout(new BorderLayout());
String[]th={"Name of Student","Percentage","Grade"};
Object[][]mt=
{
{"101","amit","B"},
{"Rohan","84","B"},
{"Vishwajeet","82","B"},
{"Prajwal","70","C"},
{"Mayur","72","C"},
{"Nachiket","76","B"},
{"Siddhi","91","A"},
{"Rutvik","90","A"},
{"Tejas","85","B"},
{"Ajinkya","72","C"}
};
jt=new JTable(mt,th);
int vscrollbar=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
int hscrollbar=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
JScrollPane mp=new JScrollPane(jt,vscrollbar,hscrollbar);
add(mp,BorderLayout.CENTER);
}
}
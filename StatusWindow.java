import java.awt.*;
import java.applet.*;
/*
<applet code="StatusWindow" width=300 height=100>
</applet>
*/

public class StatusWindow extends Applet{
       
       public void init(){
              setBackground(Color.cyan);
       }
       
       public void paint(Graphics g){
              g.drawString("This is an applet Window ", 10 ,20);

              showStatus("This is show Status window");
       }
}

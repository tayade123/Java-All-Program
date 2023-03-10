import java.awt.*;
import java.applet.*;
/*
<applet code="ColorApplet" width=300 height=300>
</applet>
*/

public class ColorApplet extends Applet{

    String msg;
    public void init(){
    setBackground(Color.cyan);
    setBackground(Color.yellow);
    msg="Inside init()--";
    }

    public void start(){
    msg+="Inside start()==";
    }
  
    public void paint(Graphics g){
    msg+="Inside paint().";
    g.drawString(msg,10,30);

    }
}

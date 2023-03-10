import java.applet.*;
import java.awt.*;

/*
  <applet code="AppletSkel" height="300" width="300">
  </applet>
*/

public class AppletSkel extends Applet{


     //Applet Initilization
     public void init(){
    
            setBackground(Color.pink);
            setBackground(Color.yellow);
            
            System.out.println("Applet Initilization");
     }

     //Applet Staring
     public void start(){
    
            System.out.println("Applet Staring");
     }

     //Applet Stop Running
     public void stop(){
    
            System.out.println("Applet Stop Running");
     }

     //Applet Destroy
     public void destroy(){
    
            System.out.println("Applet Destroy");
     }
     public void paint(Graphics g){
    
            g.drawString(" Hello Applet ",100,50);
     }

     
}

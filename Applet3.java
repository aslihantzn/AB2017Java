import java.applet.Applet;
import java.awt.*;
public class Applet3 extends Applet {
int i,j,x,y;
      public void paint(Graphics g)
    { 
        x=10;y=10;
    for (i=1;i<=10;i++)    
        {
            g.drawString("*",x,y);
            x+=20;  y+=20;
        }
    y=10;
    for (i=1;i<=10;i++)
     
        {
          //  g.drawString(""+i+"x"+j+"="+i*j,x,y);
            g.drawString("*",x,y);
            x-=20;y+=20;
        }
        
    }
    
}

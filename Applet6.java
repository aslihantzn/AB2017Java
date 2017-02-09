
import java.applet.Applet;
import java.awt.*;
public class Applet6 extends Applet 
{
int i,j,x,y;
   public void paint(Graphics g)
    { 
        x=10;y=20;
       for(i=1 ; i<=5 ;i++){
           for(j=1; j<=i ; j++) {
               g.drawString("*", x, y);
           }
           x=10; y+=20;
       }
    }   
}

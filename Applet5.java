
import java.applet.Applet;
import java.awt.*;
public class Applet5 extends Applet 
{
int i,j,x,y;
   public void paint(Graphics g)
    { 
        x=10;y=20;
        for (i=5;i>=1;i--)
        {  
          for(j=1;j<=i;j++)
          {  g.drawString("*",x,y);
             x+=20;
          }
            x=10+(6-i)*20;
            y+=20;
        }
    }  
}


import java.applet.Applet;
import java.awt.Graphics; 
import java.applet.Applet;



public class birden_ona_kadaar extends Applet {

   
    public void paint(Graphics g) {
        int i;
        int x=25,y=25;
        for(i=0;i<=10;i++){
        g.drawString(Integer.toString(i), x, y);
            x=x+15;
            y=y+15;
        }
            
     
    }
   
}

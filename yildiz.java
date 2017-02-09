

import java.applet.Applet;
import java.awt.*;

public class yildiz extends Applet {

   
    public void paint(Graphics g) {
        
        int x=5,y=5,sayac=1;
        for(y=5;y<26;y=y+5){
        for(x=5*sayac;x<26;x=x+5){
        g.drawString("*", x, y);
        }
        sayac++;
        }
            
     
    }
   
}

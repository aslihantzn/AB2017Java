
import java.applet.Applet;
import java.awt.Graphics;
public class Applet4 extends Applet {
    int i,j,x,y;
    public void paint(Graphics g) {
        for(i=0 ; i<7 ; i++){
            g.drawString("*", 80 , i*20+20);
        }
        for(j=0 ; j<7; j++){
        g.drawString("*", j*20+20, 80);
        }
    }
}

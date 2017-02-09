
import java.applet.Applet;
import java.awt.Graphics;
public class merdiven extends Applet {
    public void paint(Graphics g) {
       int x=20, y=20;
       for(int i=0 ; i<5; i++){
           g.drawLine(x, y, x+20, y);
           g.drawLine(x+20, y, x+20, y+20);
           x+=20;
           y+=20;
       }
    }
}

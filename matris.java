

import java.applet.Applet;
import java.awt.Graphics;
public class matris extends Applet {
    public void paint(Graphics g) {
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                g.drawString(""+i+j, i*25, j*25);
            }
        }
    }
}

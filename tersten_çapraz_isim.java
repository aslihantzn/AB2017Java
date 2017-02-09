
import java.applet.Applet;
import java.awt.Graphics;
public class tersten_çapraz_isim extends Applet {
    public void paint(Graphics g) {
       int x, y=0;
       String ad="asli";
       char harf;
        for (int i=0; i<ad.length(); i++) {
            y+=20;
            g.drawString(Character.toString(ad.charAt(ad.length()-i-1)), y, y);
        }
    }
}

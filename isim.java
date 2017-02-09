
import java.applet.Applet;
import java.awt.*;
public class isim extends Applet {
    int i,y;
    int x=20;
    public void init() {
     setBackground(Color.red);
     setFont(new Font("Arial",Font.BOLD, 20));
    }
    public void paint(Graphics g){
        for(i=1 , y=20 ; i<=10 ; i++, y=y+20){
            g.drawString("asli", x, y);
        }
    }
}

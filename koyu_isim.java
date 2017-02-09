
import java.applet.*;
import java.awt.*;
public class koyu_isim extends Applet {
      int x=20,y; 
    public void paint (Graphics g) {
        x=10; y=10;
        for (int i = 8; i<= 28; i+=2) {
           setFont(new Font("Book Antiqua", Font.BOLD, i));
             g.drawString("aslı",x,y);
              y+=20;
        }      
    }
}
//Trebuches MS
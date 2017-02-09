
import java.applet.Applet;
import java.awt.Label;
import java.awt.Graphics;

public class label extends Applet {

    Label L1, L2;

    public void init() {
        L1 = new Label();
        L1.setText("Bu Etiket Önce Boş olarka oluşturuldu");
        add(L1);
        L2 = new Label("Bu Etiket İlk Tanımda Tanımlandı", 2);
        add(L2);
       
    }

    public void paint(Graphics g) {
        g.drawString("L1 in içerdiği metin :" + L1.getText(), 30, 70);
        g.drawString("L2 in içerdiği metin :" + L2.getText(), 30, 90);
    }
}
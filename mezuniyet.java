
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class mezuniyet extends Applet implements ItemListener {

    Choice secim;
    String msg;

    public void init() {
        secim = new Choice();
        secim.add("Ilkokul");
        secim.add("Ortaokul");
        secim.add("Lise");
        secim.add("Universite");
        add(secim);
        secim.addItemListener(this);
    }
public void itemStateChanged(ItemEvent ie) {
        repaint();
    }

    
    public void paint(Graphics g) {
        msg = "Mezuniyet Durumu:" + secim.getSelectedItem();
        g.drawString(msg, 10, 100);
    }
}

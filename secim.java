
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class secim extends Applet implements ActionListener {

    String msg = "";

    public void init() {
        Button evet, hayir, belki;
        
        evet = new Button("sefa");
        hayir = new Button("kadir");
        belki = new Button("zafer");
        add(evet);
        add(hayir);
        add(belki);
        evet.addActionListener(this);
        hayir.addActionListener(this);
        belki.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();
        if (str.equals("sefa")) {
            msg = "sefaya tiklandi";
        } else if (str.equals("kadir")) {
            msg = "kadire tiklandi";
        } else if (str.equals("zafer")) {
            msg = "zafer tiklandi";
        }
        repaint(); }

    public void paint(Graphics g) {
        g.drawString(msg, 10, 100);
    }
}
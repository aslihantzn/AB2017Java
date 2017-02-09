
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class mause extends Applet {

        int i=1,k=1,x,y;
  
    @Override
    public void init() {
        setSize(1000, 600);
        addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(i%2==0)setSize(1000, 600);
                else setSize(1001, 601);
                i++;
            }
            @Override
            public void mousePressed(MouseEvent e) {
            }
            @Override
            public void mouseReleased(MouseEvent e) {
            }
            @Override
            public void mouseEntered(MouseEvent e) {
            }
            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        });
        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                
            }
            @Override
            public void mouseMoved(MouseEvent e) {
                
                x=e.getX();
                y=e.getY();
                
                repaint();
            }
        });
    }
    @Override
        public void update(Graphics g){
            
            g.drawOval(x, y, Math.round(500), Math.round(10));
            
            
        }
    @Override
        public void paint(Graphics g){
            update(g);
        }
}


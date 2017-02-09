
import java.applet.Applet;
import java.awt.*;
public class çarpımtablosu extends Applet {
    int i,j,x,y,z;
    public void paint(Graphics g) {
       for(i=1 , y=20 ; i<=9 ; i++ , y=y+20){
          for(j=1 , x=20 ; j<=9 ; j++ , x=x+20){
              z=i*j;
              g.drawString(" "+z, x, y);
          } 
       }
    }
}

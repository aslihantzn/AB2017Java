
import java.applet.Applet;
import java.awt.*;
public class fib extends Applet {
   int i,j,x,y;
   int t[] =new int[50];     
    public void paint (Graphics g){ 
         t[0]=1;  
         t[1]=1;
       x=20; y=30;
      for (i=2; i<=10; i++){
       t[i] = t[i-1] + t[i-2];
    
       g.drawString(" " +t[i], x,y);
       x+=40; y=30;
       }
    }
}

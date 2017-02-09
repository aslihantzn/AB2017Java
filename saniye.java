
import java.applet.Applet;
import java.awt.*;
import java.applet.*;



public class saniye extends Applet {

  
    TextField t1,t2,t3,t4;
	Button b;
        
	
       public void init (){
            t1=new TextField(5);
            t2=new TextField(5);
            t3=new TextField(5);
            t4=new TextField(5);
		b=new Button("hesapla ");
		add(t1);
		add(t2);
                add(b);
                add(t3);
                add(t4);
       }	
                public boolean action (Event e,Object o){
                    int s1;
		if(e.target==b){
                   int sayac=0;
		for(int i=sayac;i<t1.getText().length();i++){
                if(t1.getText().charAt(i)==':')
                {
                for(int j=i-2;j<i;j++){
                t4.setText(t4.getText()+t1.getText().charAt(j));
               
                }
                s1=Integer.parseInt(t4.getText());
                }
                 sayac++;
                }
		}
		return true;
                
	}
     
    }
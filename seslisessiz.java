
import java.applet.Applet;
import java.awt.*;

import java.applet.*;



public class seslisessiz extends Applet {

   
    TextField t1,t2,t3;
	Button b;
	public void init(){
		
		t1=new TextField(50);
		t2=new TextField(50);
                t3=new TextField(50);
            b=new Button("ayır");
		
		add(t1);
		add(b);
                add(t2);
                add(t3);
		
		
	}
	public boolean action (Event e,Object o){
		if(e.target==b){
                   
		for(int i=0;i<t1.getText().length();i++){
                if(t1.getText().charAt(i)=='a' ||t1.getText().charAt(i)=='e' ||t1.getText().charAt(i)=='ı' ||t1.getText().charAt(i)=='i' ||t1.getText().charAt(i)=='o' ||t1.getText().charAt(i)=='ö' ||t1.getText().charAt(i)=='u' ||t1.getText().charAt(i)=='ü'){
                t3.setText(t3.getText()+t1.getText().charAt(i));
                }
                else{
                t2.setText(t2.getText()+t1.getText().charAt(i));    
                }
                }
		}
		return true;
	}
	
	
}

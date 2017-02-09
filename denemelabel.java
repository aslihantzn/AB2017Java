
import java.applet.Applet;
import java.awt.*;

import java.applet.*;



public class denemelabel extends Applet {

   
    TextField t1,t2,t3;
	Button b;
	Label L1,L2;
       public void init (){
            L1=new Label();
            L2=new Label();
		
		t1=new TextField(5);
		
            b=new Button("Ayıktır");
		
		add(t1);
		add(b);
                
              
		
		
	}
	public boolean action (Event e,Object o){
		if(e.target==b){
                   
		for(int i=0;i<t1.getText().length();i++){
                if(t1.getText().charAt(i)=='a' ||t1.getText().charAt(i)=='e' ||t1.getText().charAt(i)=='ı' ||t1.getText().charAt(i)=='i' ||t1.getText().charAt(i)=='o' ||t1.getText().charAt(i)=='ö' ||t1.getText().charAt(i)=='u' ||t1.getText().charAt(i)=='ü'){
                L1.setText(L1.getText()+t1.getText().charAt(i)); 
                add(L1);
                }
                else{
                L2.setText(L2.getText()+t1.getText().charAt(i));
                add(L2);
                
                }
                }
		}
		return true;
                
	}
        
	
	
}

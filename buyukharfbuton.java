import java.awt.*;

import java.applet.*;

public class buyukharfbuton extends Applet{
	
	TextField t1,t2;
	Button b;
	public void init(){
		
		t1=new TextField(50);
		t2=new TextField(50);
            b=new Button("Cevir");
		
		add(t1);
		add(t2);
		add(b);
		
	}
	public boolean action (Event e,Object o){
		if(e.target==b){
		t2.setText(t1.getText().toUpperCase());	
		}
		return true;
	}
	
	
}
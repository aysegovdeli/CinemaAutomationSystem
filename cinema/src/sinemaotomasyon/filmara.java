package sinemaotomasyon;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class filmara  extends JFrame{
    private String flmara;
	private JTextField film= new JTextField("Film ismi");
	private JTextField seans1= new JTextField("seans");
	private JTextField seans2= new JTextField("seans");
	private JTextField seans3= new JTextField("seans");
	private JButton btn=new JButton("OK");
	private JButton ara=new JButton("Ara");
	
	
	public filmara(){
		createGUI();		
	}

	private void createGUI() {
		Container con = getContentPane();
		con.setLayout(null);
		this.setSize(500,400);
		con.add(film);
	    con.add(seans1);
	    con.add(seans2);
	    con.add(seans3);
	    con.add(btn);con.add(ara);
	    ara.setBounds(170, 30, 60, 32);
	    film.setBounds(20,30,140,32);seans2.setBounds(20,110,140,32);
	    seans1.setBounds(20,70,140,32);seans3.setBounds(20,150,140,32);
	    btn.setBounds(370,320,100,30);
		
	
	
	
	  btn.addActionListener(new ActionListener(){
   	   
     	 public void actionPerformed(ActionEvent item){
     		
     		 String isim=film.getText();
     		 
     	   
     	   
     	 
     	   }});
	
	
	
	
	}	
	
}

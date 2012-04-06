package sinemaotomasyon;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class filmekle  extends JFrame {
	private VeritabaniBaglanti mdbc;
    private java.sql.Statement stmt;
    Connection conn;
	
	
	private JTextField film= new JTextField("Film ismi");
	private JTextField seans1= new JTextField("seans");
	private JTextField seans2= new JTextField("seans");
	private JTextField seans3= new JTextField("seans");
	private JButton btn=new JButton("OK");
	private JLabel Label1;
	private JLabel Label2;
	private JLabel Label3;
	private JLabel Label4;
	
	public filmekle(){
		mdbc=new VeritabaniBaglanti();
        mdbc.init();
        conn=mdbc.getMyConnection();
        try {
            stmt=conn.createStatement();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        initComponents();
		//createGUI();		
	}
	private void initComponents(){
		Container con = getContentPane();
		con.setLayout(null);
		this.setSize(500,400);
	    con.add(film);
	    con.add(seans1);
	    con.add(seans2);
	    con.add(seans3);
	    con.add(btn);
	  
	    film.setBounds(20,30,140,32);seans2.setBounds(20,110,140,32);
	    seans1.setBounds(20,70,140,32);seans3.setBounds(20,150,140,32);
	    btn.setBounds(370,320,100,30);
	         
	    
	    btn.addActionListener(new ActionListener(){
     	   
       	  public void actionPerformed(ActionEvent item){
       		 try {
       			PreparedStatement fekle=conn.prepareStatement("INSERT INTO viz_filmler (filmismi)" +
       	        "VALUES (?)");
       			fekle.setString(1,film.getText());
       			PreparedStatement sekle=conn.prepareStatement("INSERT INTO viz_filmler (seans,f_adi,s_no)" +
       	        "VALUES (?,?,?)");
       			sekle.setString(1,film.getText());
       			sekle.setString(2,seans1.getText());
       			sekle.setString(2,seans2.getText());
       			sekle.setString(2,seans3.getText());
       			}
       		catch(Exception exp)
       		{
       		    exp.printStackTrace();
       		}
       		
       	       Anapencere ana=new Anapencere();
       	       ana.setVisible(true);
       	   
       	 
       	    }});
        
        
        
	}
	
}

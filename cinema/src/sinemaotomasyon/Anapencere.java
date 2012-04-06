package sinemaotomasyon;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JButton;

public class Anapencere  extends JFrame{
	private  JComboBox filmler;
	private  JButton ekle;
	private  JButton sil;
	private  JButton guncelle;
    private VeritabaniBaglanti mdbc;
	private Statement stmt;
	Connection conn;
	public Anapencere(){
		
	      initComponents();	
	}

	private void initComponents(){
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		this.setSize(500,400);
		filmler=new JComboBox();
		ekle = new JButton("Ekle");
		sil = new JButton("Sil");
		guncelle = new JButton("Güncelle");
		con.add(filmler);
		con.add(ekle);
		con.add(sil);
		con.add(guncelle);
		//filmler.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vizyondaki Filmler" }));
	  
	    mdbc=new VeritabaniBaglanti();
       // mdbc.init();
        conn=mdbc.getMyConnection();
		   filmler.addItemListener(new ItemListener() {
	            public void itemStateChanged(ItemEvent item){ 
	            	List liste = new List();
	            	String URL="jdbc:mysql://localhost/sinema";
			       
	                try {
	                	Class.forName("com.mysql.jdbc.Driver");
	                    conn=DriverManager.getConnection(URL,"ayse","");
	                	
	                	
	                	String sql="SELECT filmismi FROM viz_filmler ";
	                	stmt=conn.createStatement();
	                	ResultSet rs = stmt.executeQuery(sql); 
	                	while(rs.next()){
	                		 liste.add(rs.getString(2));	 
                         
	                	}
	                	
	                	filmler.setModel(new javax.swing.DefaultComboBoxModel(new String[]{liste.toString()})); 	
	                	
	                }
	                catch (SQLException e) {
	                    e.printStackTrace();
	                
	               } catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
	            }});
	    
          ekle.addActionListener(new ActionListener(){
        	   
        	 public void actionPerformed(ActionEvent item){
        		 
        	   filmekle flm=new filmekle();
        	   flm.setVisible(true);
        	   
        	 
        	   }});

          
          sil.addActionListener(new ActionListener(){
       	   
         	 public void actionPerformed(ActionEvent item){
         		 filmsil sil= new filmsil();
         		 sil.setVisible(true);
         	 
         	 
         	 
         	 
         	   }});
          
          guncelle.addActionListener(new ActionListener(){
       	   
         	 public void actionPerformed(ActionEvent item){
         		 
         		filmara flm=new filmara();
         	    flm.setVisible(true);
         	 
         	 
         	 
         	   }});
}
	}

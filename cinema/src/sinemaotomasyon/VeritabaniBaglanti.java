package sinemaotomasyon;

import java.sql.*;

public class VeritabaniBaglanti {
   
    private Connection myConnection;
    String url = "jdbc:mysql://localhost:3306/";
	String driver = "com.mysql.jdbc.Driver";

	private String name = "sinema";
	private String username = "root";
	private String password = "";
    
    
    public VeritabaniBaglanti() {

    }

    public void init(){
    
       try{
        
        Class.forName("com.mysql.jdbc.Driver");
        myConnection=DriverManager.getConnection(url + name+"", username, password);
        }
        catch(Exception e){
            System.out.println("Baglanti Basarisiz.");
            e.printStackTrace();
        }
    }
    
    
    public Connection getMyConnection(){
        return myConnection;
    }
    
    
    
    
    public void close(ResultSet rs){
        
        if(rs !=null){
            try{
               rs.close();
            }
            catch(Exception e){}
        
        }
    }
    
     public void close(java.sql.Statement stmt){
        
        if(stmt !=null){
            try{
               stmt.close();
            }
            catch(Exception e){}
        
        }
    }
     
  public void destroy(){
  
    if(myConnection !=null){
    
         try{
               myConnection.close();
            }
            catch(Exception e){}
        
        
    }
  }
    
}

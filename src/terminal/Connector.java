package terminal;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Connector {
      Connection con;
      ResultSet rs;
      Statement st;
   
 
    static Object getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void connectors() throws ClassNotFoundException{
        
          try {
              Class.forName("com.mysql.jdbc.Driver");
              con= DriverManager.getConnection("jdbc:mysql://Localhost/terminal","root","");
              st=con.createStatement();
              
          } catch (SQLException ex) {
              System.out.println("error"+ex);
          }
         
         
         
    }
    
}

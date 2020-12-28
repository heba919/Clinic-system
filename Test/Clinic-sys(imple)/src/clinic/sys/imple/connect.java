
package clinic.sys.imple;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
 public class connect {
     public String dbname = "";
   public String dbURL = "jdbc:mysql://localhost:3306/"+dbname; // conest 
   public String username ="root"; 
   public String password = "root";  
    
    public  Connection conn() throws SQLException
    {
        Connection dbcon = null;
    try
    {
        dbcon = (Connection) DriverManager.getConnection(this.dbURL, this.username, this.password);
    }catch (SQLException se)
     {
         throw se;
         
     }
     
        return dbcon;
    }

    PreparedStatement prepareStatement(String select__from_patient) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

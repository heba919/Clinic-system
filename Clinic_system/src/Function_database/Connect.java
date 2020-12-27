
package Function_database;

import com.mysql.jdbc.Connection;
import java.sql.*;


/**
 *
 * @author aa
 */
public class Connect {
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
    
}

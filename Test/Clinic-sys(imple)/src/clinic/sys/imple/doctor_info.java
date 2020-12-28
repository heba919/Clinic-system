
package clinic.sys.imple;
import java.sql.*;
import Class.Doctor;
import java.awt.HeadlessException;


public class doctor_info{
    public Doctor doctor_info() throws SQLException{
        Doctor doc = new Doctor() ;
        try{
        connect con = new connect() ; Connection conn = con.conn();
        PreparedStatement stmt = conn.prepareStatement("select * from doctor");
         ResultSet set = stmt.executeQuery();
         stmt.setString(2,doc.name);
         stmt.setString(3,doc.address);
         stmt.setInt(4,doc.phone);
         stmt.setString(5,doc.email);
         stmt.setInt(6,doc.age);
         stmt.setString(7,doc.specially);
         stmt.setString(8,doc.studying);
     
     
        }catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        } 
    return doc;
    }
    }
    
    
    
    
    
    
    
    


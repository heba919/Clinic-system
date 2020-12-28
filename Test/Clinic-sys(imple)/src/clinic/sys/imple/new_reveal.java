
package clinic.sys.imple;
import java.sql.Connection;
import java.sql.SQLException;
import Class.Patient;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class new_reveal {
    
  public void new_reveal_submit(Patient pat) throws SQLException{
      
       //// buttom
       
     connect con = new connect() ; Connection conn = con.conn();
PreparedStatement stmt = conn.prepareStatement("insert info patient(name,phone,E-mail,"
        + "Address,symptom,Age,National_id)values(?,?,?,?,?,?,?)");
     Patient patient;
     patient=pat;
     stmt.setString(1,patient.name);
     stmt.setInt(2,patient.phone);
     stmt.setString(3,patient.email);
     stmt.setString(4,patient.address);
     stmt.setString(5,patient.symptom);
     stmt.setInt(6,patient.age);
     stmt.setInt(7,patient.national_id);
     stmt.executeUpdate();
      JOptionPane.showConfirmDialog(null,"Submit Successed");
   }
    
    
}

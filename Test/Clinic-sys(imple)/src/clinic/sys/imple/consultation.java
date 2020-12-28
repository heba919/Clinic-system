
package clinic.sys.imple;
import Class.Patient;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class consultation {
    
    public void update(Patient pat ) throws SQLException{
    try {
    connect con = new connect(); Connection conn = con.conn();
    Patient patient =pat;
    PreparedStatement stmt = conn.prepareStatement("update patient set name=?,phone=?,E-mail=?,Address=?,Symptom=?,Age=?,National_id=? where Patient _ID=?");
    stmt.setString(1,patient.name);
    stmt.setInt(2,patient.phone);
    stmt.setString(3,patient.email);
    stmt.setString(4,patient.address);
    stmt.setString(5,patient.symptom);
    stmt.setInt(6,patient.age);
    stmt.setInt(7,patient.national_id);
    stmt.executeUpdate();
    JOptionPane.showMessageDialog(null, "Update Success");
        }catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    /////////////////////////////////////////////////////////////////////////
    
      public void delet(Patient pat ) throws SQLException{
      try{    
      connect con = new connect(); Connection conn = con.conn();
      Patient patient =pat;
      PreparedStatement stmt = con.prepareStatement("delete from patient where Patient _ID=?");
      stmt.setInt(1,patient.patient_id);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Delete Success");
      
      }catch (HeadlessException | SQLException e) {
            System.out.println(e.getMessage());
        }
      }
    
    
    
    
    
    
    
    
    
    
    }


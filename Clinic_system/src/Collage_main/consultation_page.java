
package Collage_main;
import java.sql.Connection;
import java.sql.SQLException;
import Class.*;
import Class.Patient.status;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import Function_database.dbconnection;
import java.sql.ResultSet;



public class consultation_page {
    
     
     
     ///// show info patient // national id 
     public Patient show_info_patient(int na_id ) throws SQLException{
     Patient p =new Patient();
    p.national_id = na_id;
      dbconnection con = new dbconnection() ; Connection conn = con.conn();
      
      // national = id 
   PreparedStatement s = conn.prepareStatement("select patient.patient_id from patient "
               + "where patient.national_id = '"+ p.national_id +"'");
        ResultSet se = s.executeQuery();
       p.patient_id = se.getInt(1);
       
     //
      PreparedStatement stmt = conn.prepareStatement("select name,phone,e_mail,address,age,national_id,symptom"
        + "from patient where patient.patient_id='"+ p.patient_id + "';");
      ResultSet set = stmt.executeQuery();
      p.name=set.getString(1);
      p.phone=set.getInt(2);
      p.email=set.getString(3);
      p.address=set.getString(4);
      p.age=set.getInt(5);
      p.national_id=set.getInt(6);
      p.symptom=set.getString(7);
      return p;
     
     }
    
     /// show diag  // national id 
     
     public diagnosis  show_diag_info(int na_id ) throws SQLException{
         Patient p =new Patient();
     p.national_id = na_id;
         dbconnection con = new dbconnection() ; Connection conn = con.conn();
         
         // national = id 
   PreparedStatement s = conn.prepareStatement("select patient.patient_id from patient "
               + "where patient.national_id = '"+ p.national_id +"'");
        ResultSet se = s.executeQuery();
       p.patient_id = se.getInt(1);
         
      PreparedStatement stmt = conn.prepareStatement("select diagnosis.date ,diagnosis.info_about_illness from diagnosis"
              + " inner join patient on patient.dia_id = diagnosis.dia_id "
              + "where  patient.patient_id ='"+ p.patient_id + "';");
      ResultSet set = stmt.executeQuery();
      diagnosis d=new diagnosis();
      d.date=set.getString(1);
      d.info_ill=set.getString(2);
      return d;
      
     }
     
     /////show treatment
     public treatment show_treat( int na_id  )throws SQLException{
         Patient p =new Patient();
     p.national_id = na_id;
     dbconnection con = new dbconnection() ; Connection conn = con.conn();
     
     // national = id 
   PreparedStatement s = conn.prepareStatement("select patient.patient_id from patient "
               + "where patient.national_id = '"+ p.national_id +"'");
        ResultSet se = s.executeQuery();
       p.patient_id = se.getInt(1);
     
      PreparedStatement stmt = conn.prepareStatement("select treatment.name,treatment.cost from treatment"
              + " inner join patient on patient.treat_id = treatment.treat_id "
              + " where patient.patient_id ='"+ p.patient_id+ "';");
      ResultSet set = stmt.executeQuery();
      treatment t= new treatment();
      t.name=set.getString(1);
      t.cost=set.getInt(2);
      return t;
     
     }
     
     //updata patient // class patient 
  public void updata_patient(Patient p_) throws SQLException{
      Patient p =p_;
      dbconnection con = new dbconnection() ; Connection conn = con.conn();
      
      
      // national = id 
       PreparedStatement s = conn.prepareStatement("select patient.patient_id from patient "
               + "where patient.national_id = '"+ p.national_id +"'");
        ResultSet set = s.executeQuery();
       p.patient_id = set.getInt(1);
       
      PreparedStatement stmt = conn.prepareStatement("update patient set name=?,phone=?,e_mail=?"
              + ",address=?,age=?,national_id=?,symptom=? where patient_id='"+ p.patient_id + "';");
     stmt.setString(1,p.name);
     stmt.setInt(3,p.phone);
     stmt.setString(4,p.email);
     stmt.setString(2,p.address);
     stmt.setInt(5,p.age);
     stmt.setInt(6,p.national_id);
     stmt.setString(7,p.symptom);
     stmt.executeUpdate();
      JOptionPane.showConfirmDialog(null,"Submit Successed");
}    
  
  //delet patient  // national id 
  public void delet_patient(int na_id ) throws SQLException{
    dbconnection con = new dbconnection() ; Connection conn = con.conn();
    Patient p =new Patient();
     p.national_id = na_id;
     
     //national = id 
    PreparedStatement s = conn.prepareStatement("select patient.patient_id from patient "
               + "where patient.national_id = '"+ p.national_id +"'");
        ResultSet set = s.executeQuery();
       p.patient_id = set.getInt(1);
    //
    PreparedStatement stmt = conn.prepareStatement("delet from patient where patien.patient_id="
            + "'"+p.patient_id + "';");  
        stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Delete Success");
    }
    
 /* //insert status at (0k buttom)
  public void submit_status( String status ) throws SQLException{
  dbconnection con = new dbconnection() ; Connection conn = con.conn();
  PreparedStatement stmt = conn.prepareStatement("inset into patient.status value=?");
  stmt.setString(1,status);
     stmt.executeUpdate();
  
  }
    */
  
}

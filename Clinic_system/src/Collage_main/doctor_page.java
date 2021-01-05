
package Collage_main;

import Class.*;
import Function_database.dbconnection;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class doctor_page {
    
    //update diag
    public void update_diag(int pati_id, diagnosis d_) throws SQLException{
   dbconnection con = new dbconnection() ; Connection conn = con.conn();
   Patient p =new Patient();
   p.patient_id = pati_id;
   diagnosis d=d_;
   PreparedStatement stmt = conn.prepareStatement("update diagnosis set diagnosis.date=? ,diagnosis.info_about_illness=?"
           + "inner join patient on patient.dia_id = diagnosis.dia_id"
           + "where patient.patient_id='"+p.patient_id+"'");
     stmt.setString(1,d.date);
     stmt.setString(2,d.info_ill);
     stmt.executeUpdate();
      JOptionPane.showConfirmDialog(null,"Update Successed");
    
    }
    
    
    
    //delet diag 
    public void delet_diag(int pati_id) throws SQLException{
   dbconnection con = new dbconnection() ; Connection conn = con.conn();
   Patient p =new Patient();
   p.patient_id = pati_id;
   PreparedStatement stmt = conn.prepareStatement("delet from diagnosis "
           + "inner join patient on patient.dia_id = diagnosis.dia_id"
           + "where patient.patient_id='"+p.patient_id+"';");
     stmt.executeUpdate();
    JOptionPane.showMessageDialog(null, "Delete Success");
    
    }
    
    // submit diag
    public void submit_dis_and_tratment(Patient p_,diagnosis d_,treatment t_) throws SQLException{
    dbconnection con = new dbconnection() ; Connection conn = con.conn();
    Patient p=p_;
    diagnosis d=d_;
    treatment t=t_;
    PreparedStatement stmt = conn.prepareStatement("insert into diagnosis.date=? ,diagnosis.info_about_illness=? "
            + "treatment.name value(?,?,?) "
            + "inner join patient on patient.dia_id = diagnosis.dia_id"
            + "inner join patient on patient.dia_id = treatment.treat_id "
            + " whrere patient.paatient_id='"+ p.patient_id+"';"); 
  
     stmt.setString(1,d.date);
     stmt.setString(2,d.info_ill);
     stmt.setString(3,t.name);
     stmt.executeUpdate();
     JOptionPane.showMessageDialog(null, "Insertion Success");
    
    
    }
    
    //show patient info at table auto
    public DefaultTableModel  show_patient_info_at_doctor_in_table() throws SQLException{ //constractor 
    dbconnection con = new dbconnection() ; Connection conn = con.conn();
    PreparedStatement stmt = conn.prepareStatement("select patient_id,name,phone,email,address,"
                 + " age,national_id  from  patient ; ");
    ResultSet set = stmt.executeQuery();
            DefaultTableModel dm = new DefaultTableModel();
            dm.addColumn("Patient id");
            dm.addColumn("Name");
            dm.addColumn("Phone");
            dm.addColumn("E-mail");
            dm.addColumn("Address");
            dm.addColumn("Age");
            dm.addColumn("National id");
            
            while (set.next()) {
                String r[] = {set.getString(1), set.getString(2), set.getString(3),
                    set.getString(4),set.getString(5), set.getString(6), set.getString(7)};
                dm.addRow(r);
            }
    
            return dm;
    }
}
    
    
    //search 

   

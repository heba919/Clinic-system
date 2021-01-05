
package Collage_main;
import java.sql.Connection;
import java.sql.SQLException;
import Class.*;
import java.sql.*;
import javax.swing.JOptionPane;
import Function_database.dbconnection;
public class admin_page_3frame {

   ///update doctor  // class , doc id 
    public void update_doctor( Doctor doct , int select_doc_id ) throws SQLException{
    dbconnection con = new dbconnection() ; Connection conn = con.conn();
    Doctor doc = doct;
    doc.doctor_id = select_doc_id;
    PreparedStatement stmt = conn.prepareStatement("update doctor set name=?,address=?,phone=?"
            + ",e-mail=?,age=?,specially=?,studying=?,salary=?,national_id=?,salary=?"
            + "where doctor_id='"+doc.doctor_id + "';");  
     stmt.setString(1,doc.name);
     stmt.setInt(3,doc.phone);
     stmt.setString(4,doc.email);
     stmt.setString(2,doc.address);
     stmt.setInt(5,doc.age);
     stmt.setString(6,doc.specially);
     stmt.setString(7,doc.studying);
     stmt.setInt(8,doc.national_id);
     stmt.setInt(9,doc.salary);
     stmt.executeUpdate();
      JOptionPane.showConfirmDialog(null,"Submit Successed");
    
    }
    
    //insert doctor //class
    public void submit_doctor( Doctor doct) throws SQLException{
    dbconnection con = new dbconnection() ; Connection conn = con.conn();
    Doctor doc=doct;
    PreparedStatement stmt = conn.prepareStatement("inset info  doctor.name, doctor.address"
            + ",doctor.phone ,doctor.e-mail ,doctor.age ,doctor.specially ,doctor.studying"
            + ",doctor.salary ,doctor.national_id"
            + "value (?,?,?,?,?,?,?,?,?);");  
     stmt.setString(1,doc.name);
      stmt.setString(2,doc.address);
     stmt.setInt(3,doc.phone);
     stmt.setString(4,doc.email);
     stmt.setInt(5,doc.age);
     stmt.setString(6,doc.specially);
     stmt.setString(7,doc.studying);
     stmt.setInt(8,doc.salary);
     stmt.setInt(9,doc.national_id);
     stmt.executeUpdate();
      JOptionPane.showConfirmDialog(null,"Submit Successed");
    
    }
    
    //delet doctor /  doc id
     public void delet_doctor(  int select_doc_id ) throws SQLException{
    dbconnection con = new dbconnection() ; Connection conn = con.conn();
    Doctor doc=new Doctor();
    doc.doctor_id=select_doc_id;
    PreparedStatement stmt = conn.prepareStatement("delet from doctor where doctor_id="
            + "'"+doc.doctor_id + "';");  
        stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Delete Success");
    }
    
    //insert treatment / class 
     public void add_treat( treatment t_ ) throws SQLException{
      dbconnection con = new dbconnection() ; Connection conn = con.conn();
      treatment t =t_;
      PreparedStatement stmt = conn.prepareStatement("insert info treatment.name ,treatment.cost"
              + "from treatment value(?,?);");
      stmt.setString(1,t.name);
      stmt.setInt(2,t.cost);
      JOptionPane.showMessageDialog(null, "Submit Success");

     
     }
    
    
}

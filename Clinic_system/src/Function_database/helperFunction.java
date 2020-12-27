package Function_database;

import Class.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class helperFunction {
    
    public  dbconnection connector = null; 
    public  Statement stm = null;
    public  ResultSet rs = null;

    
    public boolean login(String user_name , String pass_word)
    {
        return (user_name.equals("admin") && pass_word.equals("admin"));
    }
    
    
    public  boolean login(String ID) throws SQLException
    {            
        Connection conn = connector.conn();
        stm = conn.createStatement();
        String sql = "SELECT * FROM patient WHERE patient.National_id='"+ ID + "'";
        rs = stm.executeQuery(sql);
        if(rs.next())
            return true;
        else
            return false;
    }

    public helperFunction() throws SQLException {
        connector = new dbconnection();
    }
    
    
}

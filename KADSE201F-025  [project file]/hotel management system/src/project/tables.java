
package project;
import java.sql.*;
import javax.swing.JOptionPane;

public class tables {
    
    public static void main(String[] args)
    {
        Connection con = null;
        Statement st = null;
        
        try {
            
            con = connectionProvider.getConn();
            st = con.createStatement();
            st.executeUpdate("create table users(name varchar(200), email varchar(200),password varchar(50),sequrityQuestion varchar(500),answer varchar(200),address varchar(200),status varchar(20))");
            JOptionPane.showMessageDialog(null, "table created successful...");
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        finally
        {
            try {
                
                con.close();
                st.close();
            } 
            catch (Exception e)
            {
                
            }
        }
    }
}

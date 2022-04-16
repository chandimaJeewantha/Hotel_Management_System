
package project;
import java.sql.*;
import javax.swing.JOptionPane;

public class select {
    
    public static ResultSet GetData(String query)
    {
        
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        
        try {
            
            conn = connectionProvider.getConn();
            st = conn.createStatement();
            rs = st.executeQuery(query);
            return rs;
            
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
        
    }
}

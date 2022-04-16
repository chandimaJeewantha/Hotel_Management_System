
package project;

import java.sql.*;
import javax.swing.JOptionPane;


public class insertUpdateDelete {
    
    public static void setData(String query, String msg)
    {
        Connection con = null;
        Statement st  = null;
        
        try {
         
             con = connectionProvider.getConn();
             st = con.createStatement();
             st.executeUpdate(query);
             if(!msg.equals(""))
             {
                 JOptionPane.showMessageDialog(null, msg);
             }
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(null, e.toString());
        }
        finally
        {
            try {
                
            }
            catch (Exception e) 
            {
                
            }
        }
        
    }
}

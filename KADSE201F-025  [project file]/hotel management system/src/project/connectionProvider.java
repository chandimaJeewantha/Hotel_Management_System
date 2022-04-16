
package project;
import java.sql.*;
import javax.swing.JOptionPane;


public class connectionProvider {
    
    static public final String DB_URL = "jdbc:mysql://localhost/hotel";
    static public final String USERNAME = "root";
    static public final String PASSWORD = "";
    
    static Connection conn = null;
    
    public static Connection getConn()
    {
        try
        {

           Class.forName("com.mysql.jdbc.Driver");
           conn = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
           System.out.println("DB Connected..!!");

        }
        catch(Exception obj)
        {
            JOptionPane.showMessageDialog(null, obj.toString());
        };

        return conn;
       
    }

}

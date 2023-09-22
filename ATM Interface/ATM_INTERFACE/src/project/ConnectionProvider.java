
package project;

import java.sql.*;
/**
 *
 * @author Rahul
 */
public class ConnectionProvider {
    
    public static Connection getcon()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","root@1234567");
            return con;
        }
        catch(Exception e)
        {
           return null;
        }
    }
}

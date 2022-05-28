package registration;

import java.sql.DriverManager;
import java.sql.Statement;

public class Connection
{
    java.sql.Connection c=null;
   Statement s;
    
    public Connection()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/registration","root","");
           s=c.createStatement();            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
